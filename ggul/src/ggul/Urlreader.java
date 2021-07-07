package ggul;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Urlreader extends Source {
	private String price, y_day, y_price, percent, code = null;

	Urlreader(String name) throws IOException {

		switch (name) {
		case "한화3우B":
			this.code = "00088K";
			break;
		case "미래에셋증권2우B":
			this.code = "00680K";
			break;
		case "삼성전자우":
			this.code = "005935";
			break;
		case "한국자산신탁":
			this.code = "123890";
			break;
		case "KT&G":
			this.code = "033780";
			break;
		}
		URL url = new URL("https://finance.naver.com/item/coinfo.nhn?code=" + code);
		URLConnection urlConn = url.openConnection();
		InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String line = buff.readLine();
		while (line != null) {
			if (line.contains("<dd>현재가 ")) {
//				System.out.println(line);
				String div[] = line.split(" ");
				this.price = div[9];
				this.y_day = div[11];
				this.y_price = div[12];
				this.percent = div[14];
			}
			line = buff.readLine();
		}
	}

	Urlreader() {

	}

	String showMarket() throws IOException {
		URL url = new URL("https://finance.naver.com/");
		URLConnection urlConn = url.openConnection();
		InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String line = buff.readLine();
		String line2 = "";
		String line3 = "";
		while (line != null) {
			if (line.contains("     코스피 지수 ")) {
				line2 = line;
			}
			if (line.contains("     코스닥 지수 ")) {
				line3 = line;
			}
			line = buff.readLine();
		}
		return line2 + line3;
	}

	void StartDISCUSSUrl(String url) {
		String urlLink = "https://finance.naver.com/item/board.nhn?code=" + url;
		try {
			Desktop.getDesktop().browse(new URI(urlLink));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	void StartDARTUrl(String url) {
		String urlLink = "https://finance.naver.com/item/dart.nhn?code=" + url;
		try {
			Desktop.getDesktop().browse(new URI(urlLink));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	void StartSHORTUrl(String url) {
		String urlLink = "https://finance.naver.com/item/short_trade.nhn?code=" + url;
		try {
			Desktop.getDesktop().browse(new URI(urlLink));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	String getPrice() {
		return price;
	}

	String getYday() {
		return y_day;
	}

	String getYprice() {
		return y_price;
	}

	String getPercent() {
		return percent;
	}
}