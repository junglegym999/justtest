package ggul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class sharesInfo extends Source {
	String divwonprint[] = new String[10];
	String divperprint[] = new String[10];
	String code = "";

	sharesInfo() {

	}

	sharesInfo(String name) throws IOException {
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
		URL url = new URL("https://finance.naver.com/item/main.nhn?code=" + code);
		URLConnection urlConn = url.openConnection();
		URLConnection urlConn2 = url.openConnection();
		InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
		InputStreamReader inStream2 = new InputStreamReader(urlConn2.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		BufferedReader buff2 = new BufferedReader(inStream2);
		String line = buff.readLine();
		String line2 = buff2.readLine();
		int cnt = 0;
		int cnt14 = 0;
		int cnt15 = 0;
		int cnt16 = 0;
		int j = 0;
		String ful[] = new String[10000];
		while (line != null) {
			if (line.contains("주당배당금")) {// divwon
				cnt14 = cnt;
			}
			if (line.contains("시가배당률")) {// divper
				cnt15 = cnt;
			}
			cnt++;
			line = buff.readLine();
		}
		for (int i = 0; i < cnt; i++) {
			ful[i] = line2;
			line2 = buff2.readLine();
		}

		// 배당원
		String divwon = "";
		for (int i = cnt14; i < cnt15; i++) {
			if (ful[i].length() > 1) {
				divwon += ful[i];
			}
		}
		String divwonrr[] = divwon.split("	");
		j = 0;
		for (int i = 0; i < divwonrr.length; i++) {
			if (divwonrr[i].contains(";") || divwonrr[i].contains("<td class=\"no")) {
				divwonprint[j] = "N/A";
				j++;
			} else if (divwonrr[i].length() > 0 && !divwonrr[i].contains("em") && !divwonrr[i].contains("td")
					&& !divwonrr[i].contains("<")) {
				divwonprint[j] = divwonrr[i];
				j++;
			}
		}
		// 배당퍼센트
		String divper = "";
		for (int i = cnt15; i < cnt16; i++) {
			if (ful[i].length() > 1) {
				divper += ful[i];
			}
		}
		String divperrr[] = divper.split("	");
		j = 0;
		for (int i = 0; i < divperrr.length; i++) {
			if (divperrr[i].contains(";") || divperrr[i].contains("<td class=\"no")) {
				divperprint[j] = "N/A";
				j++;
			} else if (divperrr[i].length() > 0 && !divperrr[i].contains("em") && !divperrr[i].contains("td")
					&& !divperrr[i].contains("<")) {
				divperprint[j] = divperrr[i];
				j++;
			}
		}
	}
}
