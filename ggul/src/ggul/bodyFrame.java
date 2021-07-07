package ggul;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.DecimalFormat;

public class bodyFrame extends Source {

	bodyFrame() {
		FirstFrame = new Frame("The Gathering");
		FirstFrame.setSize(800, 500);
		FirstFrame.setLayout(null);
		FirstFrame.setLocationRelativeTo(null);
		FirstFrame.setVisible(true);
		FirstFrame.addWindowListener(new BodyFrameExit());

		JohnLeeFrame = new Frame("John Lee");
		JohnLeeFrame.setSize(500, 150);
		JohnLeeFrame.setLayout(null);
		JohnLeeFrame.setLocationRelativeTo(null);
		JohnLeeFrame.setVisible(true);
		JohnLeeFrame.setBackground(Color.darkGray);
		JohnLeeFrame.setAlwaysOnTop(true);
		JohnLeeFrame.addWindowListener(new JohnLeeFrame());
		JohnLeeFrame.addKeyListener(new JohnLeeFrame());

		SecondFrame = new Frame("");
		SecondFrame.setSize(500, 300);
		SecondFrame.setLayout(null);
		SecondFrame.setLocationRelativeTo(null);
		SecondFrame.setVisible(false);

		LJohnleeproverb = new Label("주식은 파는게아니라, 모으는 것이다.  -John Lee-", Label.CENTER);
		LJohnleeproverb.setBounds(0, 30, 500, 60);
		LJohnleeproverb.setFont(titleText);
		LJohnleeproverb.setForeground(Color.WHITE);

		BJohnleeok = new Button("확인");
		BJohnleeok.setLocation(220, 100);
		BJohnleeok.setSize(60, 30);
		BJohnleeok.addActionListener(new JohnLeeFrame());

		Pvalues = new Panel();
		Pvalues.setLocation(570, 15);
		Pvalues.setSize(215, 450);
		Pvalues.setVisible(true);
		Pvalues.setBackground(Color.black);

		mirae = new Label("미래에셋증권2우B", Label.CENTER);
		mirae.setBounds(0, 50, 215, 30);
		mirae.setForeground(Color.white);
		mirae.setFont(ValuesFont);
		mirae.addMouseListener(new miraeMouseEvent());
		hanhwa = new Label("한화3우B", Label.CENTER);
		hanhwa.setBounds(0, 100, 215, 30);
		hanhwa.setForeground(Color.white);
		hanhwa.setFont(ValuesFont);
		hanhwa.addMouseListener(new hanhwaMouseEvent());
		samsung = new Label("삼성전자우", Label.CENTER);
		samsung.setBounds(0, 150, 215, 30);
		samsung.setForeground(Color.white);
		samsung.setFont(ValuesFont);
		samsung.addMouseListener(new samsungMouseEvent());
		hanjatak = new Label("한국자산신탁", Label.CENTER);
		hanjatak.setBounds(0, 200, 215, 30);
		hanjatak.setForeground(Color.white);
		hanjatak.setFont(ValuesFont);
		hanjatak.addMouseListener(new hanjatakMouseEvent());
		ktandg = new Label("KT&G", Label.CENTER);
		ktandg.setBounds(0, 250, 215, 30);
		ktandg.setForeground(Color.white);
		ktandg.setFont(ValuesFont);
		ktandg.addMouseListener(new ktandgMouseEvent());

		Pvalues.add(mirae);
		Pvalues.add(hanhwa);
		Pvalues.add(samsung);
		Pvalues.add(hanjatak);
		Pvalues.add(ktandg);

		CBGselectyourfavor = new CheckboxGroup();
		cb1 = new Checkbox("", CBGselectyourfavor, false);
		cb1.setLocation(50, 50);
		cb1.setSize(10, 10);
		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				PfixedBudget.setVisible(true);
				PreduceBudget.setVisible(false);
			}

		});
		cb2 = new Checkbox("", CBGselectyourfavor, false);
		cb2.setLocation(300, 50);
		cb2.setSize(10, 10);
		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				PfixedBudget.setVisible(false);
				PreduceBudget.setVisible(true);
			}
		});
		cb1Label = new Label("금액을 정하고 모아보자", Label.LEFT);
		cb1Label.setBounds(70, 40, 140, 25);
		cb2Label = new Label("아껴서 모아보자", Label.LEFT);
		cb2Label.setBounds(320, 40, 140, 25);
		PfixedBudgetIf1 = new Label("만약 월", Label.LEFT);
		PfixedBudgetIf1.setFont(FixedBudgetFont);
		PfixedBudgetIf1.setBounds(10, 15, 65, 25);
		PfixedBudgetIf2 = new Label("원씩,", Label.LEFT);
		PfixedBudgetIf2.setFont(FixedBudgetFont);
		PfixedBudgetIf2.setBounds(190, 15, 50, 25);
		PfixedBudgetIf3 = new Label("달을 모은다면,", Label.LEFT);
		PfixedBudgetIf3.setFont(FixedBudgetFont);
		PfixedBudgetIf3.setBounds(280, 15, 135, 25);
		PfixedBudgetIf4 = new Label("원이 모입니다.", Label.LEFT);
		PfixedBudgetIf4.setFont(FixedBudgetFont);
		PfixedBudgetIf4.setBounds(150, 55, 135, 25);
		PfixedBudgetIf5 = new Label("", Label.LEFT);
		PfixedBudgetIf5.setFont(FixedBudgetFont);
		PfixedBudgetIf5.setBounds(10, 80, 150, 25);

		PfixedBudegetBugettf1 = new TextField("");
		PfixedBudegetBugettf1.setLocation(85, 15);
		PfixedBudegetBugettf1.setSize(90, 30);
		PfixedBudegetBugettf1.addActionListener(new FixBudget());

		PfixedBudegetBugettf2 = new TextField("" + monthFixed);
		PfixedBudegetBugettf2.setLocation(240, 15);
		PfixedBudegetBugettf2.setSize(30, 30);
		PfixedBudegetBugettf2.addActionListener(new FixBudget());
		PfixedBudegetBugettf3 = new TextField("");
		PfixedBudegetBugettf3.setLocation(10, 55);
		PfixedBudegetBugettf3.setSize(130, 25);

		FixedCalculate = new Button("계산하기");
		FixedCalculate.setLocation(430, 10);
		FixedCalculate.setSize(60, 30);
		FixedCalculate.addActionListener(new FixBudget());

		PfixedBudgetResult1 = new Label("미래에셋증권2우B", Label.LEFT);
		PfixedBudgetResult1.setFont(FixedBudgetFont);
		PfixedBudgetResult1.setBounds(10, 110, 150, 30);
		PfixedBudgetResult2 = new Label("를 산다면, 평균 ", Label.LEFT);
		PfixedBudgetResult2.setFont(FixedBudgetFont);
		PfixedBudgetResult2.setBounds(160, 110, 85, 30);
		PfixedBudgetResult3 = new Label("", Label.RIGHT);
		PfixedBudgetResult3.setBackground(Color.yellow);
		PfixedBudgetResult3.setFont(FixedBudgetFont);
		PfixedBudgetResult3.setBounds(250, 110, 50, 30);
		PfixedBudgetResult4 = new Label("주 살수있고,", Label.LEFT);
		PfixedBudgetResult4.setFont(FixedBudgetFont);
		PfixedBudgetResult4.setBounds(300, 110, 150, 25);
		PfixedBudgetResult5 = new Label("내년에는 ", Label.LEFT);
		PfixedBudgetResult5.setFont(FixedBudgetFont);
		PfixedBudgetResult5.setBounds(10, 150, 90, 25);
		PfixedBudgetResult6 = new Label("", Label.RIGHT);
		PfixedBudgetResult6.setFont(FixedBudgetFont);
		PfixedBudgetResult6.setBackground(Color.yellow);
		PfixedBudgetResult6.setBounds(100, 150, 110, 25);
		PfixedBudgetResult7 = new Label("원을 받을 수 있습니다.", Label.LEFT);
		PfixedBudgetResult7.setFont(FixedBudgetFont);
		PfixedBudgetResult7.setBounds(210, 150, 200, 25);

		PfixedBudgetResult8 = new Label("현재 ", Label.LEFT);
		PfixedBudgetResult8.setFont(FixedBudgetFont);
		PfixedBudgetResult8.setBounds(10, 180, 50, 25);
		PfixedBudgetResult9 = new Label("", Label.LEFT);
		PfixedBudgetResult9.setFont(FixedBudgetFont);
		PfixedBudgetResult9.setBounds(60, 180, 150, 25);
		PfixedBudgetResult10 = new Label("의 현재가는 ", Label.LEFT);
		PfixedBudgetResult10.setFont(FixedBudgetFont);
		PfixedBudgetResult10.setBounds(210, 180, 80, 25);

		PfixedBudgetResult11 = new Label("", Label.CENTER);
		PfixedBudgetResult11.setFont(FixedBudgetFont);
		PfixedBudgetResult11.setBounds(290, 180, 70, 25);
		PfixedBudgetResult11.setBackground(Color.yellow);

		PfixedBudgetResult12 = new Label("이 종목의 배당금은 주당 , ", Label.LEFT);
		PfixedBudgetResult12.setFont(FixedBudgetFont);
		PfixedBudgetResult12.setBounds(10, 210, 200, 25);

		PfixedBudgetResult13 = new Label("", Label.CENTER);
		PfixedBudgetResult13.setFont(FixedBudgetFont);
		PfixedBudgetResult13.setBounds(210, 210, 70, 25);
		PfixedBudgetResult13.setBackground(Color.yellow);

		PfixedBudgetResult14 = new Label("원 ,", Label.LEFT);
		PfixedBudgetResult14.setFont(FixedBudgetFont);
		PfixedBudgetResult14.setBounds(290, 210, 50, 25);

		PfixedBudgetResult15 = new Label("", Label.RIGHT);
		PfixedBudgetResult15.setFont(FixedBudgetFont);
		PfixedBudgetResult15.setBounds(340, 210, 70, 25);
		PfixedBudgetResult15.setBackground(Color.yellow);

		PfixedBudgetResult16 = new Label("%", Label.LEFT);
		PfixedBudgetResult16.setFont(FixedBudgetFont);
		PfixedBudgetResult16.setBounds(410, 210, 65, 25);

		PMainPanel = new Panel();
		PMainPanel.setLocation(15, 5);
		PMainPanel.setSize(550, 80);
		PMainPanel.setVisible(true);
		PMainPanel.setBackground(Color.green);
		PfixedBudget = new Panel();
		PfixedBudget.setLocation(15, 90);
		PfixedBudget.setSize(550, 300);
		PfixedBudget.setVisible(false);
		PfixedBudget.setBackground(Color.LIGHT_GRAY);
		PreduceBudget = new Panel();
		PreduceBudget.setLocation(15, 90);
		PreduceBudget.setSize(550, 300);
		PreduceBudget.setVisible(false);
		PreduceBudget.setBackground(Color.DARK_GRAY);

		PMainPanel.add(cb1);
		PMainPanel.add(cb2);
		PMainPanel.add(cb1Label);
		PMainPanel.add(cb2Label);
		FirstFrame.add(PMainPanel);
		FirstFrame.add(PfixedBudget);
		FirstFrame.add(PreduceBudget);
		FirstFrame.add(Pvalues);
		PfixedBudget.add(PfixedBudgetIf1);
		PfixedBudget.add(PfixedBudgetIf2);
		PfixedBudget.add(PfixedBudgetIf3);
		PfixedBudget.add(PfixedBudgetIf4);
		PfixedBudget.add(PfixedBudgetIf5);
		PfixedBudget.add(FixedCalculate);
		PfixedBudget.add(PfixedBudegetBugettf1);
		PfixedBudget.add(PfixedBudegetBugettf2);
		PfixedBudget.add(PfixedBudegetBugettf3);
		PfixedBudget.add(PfixedBudgetResult1);
		PfixedBudget.add(PfixedBudgetResult2);
		PfixedBudget.add(PfixedBudgetResult3);
		PfixedBudget.add(PfixedBudgetResult4);
		PfixedBudget.add(PfixedBudgetResult5);
		PfixedBudget.add(PfixedBudgetResult6);
		PfixedBudget.add(PfixedBudgetResult7);
		PfixedBudget.add(PfixedBudgetResult8);
		PfixedBudget.add(PfixedBudgetResult9);
		PfixedBudget.add(PfixedBudgetResult10);
		PfixedBudget.add(PfixedBudgetResult11);
		PfixedBudget.add(PfixedBudgetResult12);
		PfixedBudget.add(PfixedBudgetResult13);
		PfixedBudget.add(PfixedBudgetResult14);
		PfixedBudget.add(PfixedBudgetResult15);
		PfixedBudget.add(PfixedBudgetResult16);

		JohnLeeFrame.add(LJohnleeproverb);
		JohnLeeFrame.add(BJohnleeok);

	}

	public class BodyFrameExit extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	public class FixBudget extends WindowAdapter implements ActionListener, KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == PfixedBudegetBugettf2 || e.getSource() == PfixedBudegetBugettf1
					|| e.getActionCommand().equals("계산하기")) {
				int a = Integer.parseInt(PfixedBudegetBugettf1.getText())
						* Integer.parseInt(PfixedBudegetBugettf2.getText());
				DecimalFormat formatter = new DecimalFormat("###,###");
				PfixedBudegetBugettf3.setText(formatter.format(a));
			}
		}
	}

	public class hanhwaMouseEvent implements ActionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			PfixedBudgetResult1.setText(hanhwa.getText());
			PfixedBudgetResult1.setForeground(Color.red);
			PfixedBudgetResult9.setText(PfixedBudgetResult1.getText());
			PfixedBudgetResult9.setForeground(Color.red);
			int price = 0;
			double divwon = 0;
			try {
				Urlreader reader = new Urlreader(PfixedBudgetResult1.getText());
				sharesInfo info = new sharesInfo(PfixedBudgetResult1.getText());
				if (reader.getPrice().contains(",")) {
					price = Integer.parseInt(reader.getPrice().replace(",", ""));
				} else {
					price = Integer.parseInt(reader.getPrice());
				}
				if (info.divwonprint[3].contains(",")) {
					divwon = Double.parseDouble(info.divwonprint[3].replace(",", ""));
				} else {
					divwon = Double.parseDouble(info.divwonprint[3]);
				}
				DecimalFormat formatter = new DecimalFormat("###,###");

				String divper = String.format("%.1f", (divwon / price) * 100);
				PfixedBudgetResult11.setText(reader.getPrice());
				PfixedBudgetResult13.setText(info.divwonprint[3]);
				PfixedBudgetResult15.setText(divper);
				if (PfixedBudegetBugettf1.getText() != "") {
					int Budget = Integer.parseInt(PfixedBudegetBugettf3.getText().replace(",", ""));
					String pricDivmonthBuget = String.valueOf(Budget / price);
					PfixedBudgetResult3.setText(pricDivmonthBuget);
//					PfixedBudgetResult6.setText(String.valueOf();
					PfixedBudgetResult6.setText(formatter.format(((Budget / price) * divwon) * 0.846));

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			hanhwa.setFont(big);
			hanhwa.setForeground(Color.lightGray);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			hanhwa.setFont(ValuesFont);
			hanhwa.setForeground(Color.white);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class ktandgMouseEvent implements ActionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			PfixedBudgetResult1.setText(ktandg.getText());
			PfixedBudgetResult1.setForeground(Color.red);
			PfixedBudgetResult9.setText(PfixedBudgetResult1.getText());
			PfixedBudgetResult9.setForeground(Color.red);
			int price = 0;
			double divwon = 0;
			try {
				Urlreader reader = new Urlreader(PfixedBudgetResult1.getText());
				sharesInfo info = new sharesInfo(PfixedBudgetResult1.getText());
				if (reader.getPrice().contains(",")) {
					price = Integer.parseInt(reader.getPrice().replace(",", ""));
				} else {
					price = Integer.parseInt(reader.getPrice());
				}
				if (info.divwonprint[3].contains(",")) {
					divwon = Double.parseDouble(info.divwonprint[3].replace(",", ""));
				} else {
					divwon = Double.parseDouble(info.divwonprint[3]);
				}
				DecimalFormat formatter = new DecimalFormat("###,###");

				String divper = String.format("%.1f", (divwon / price) * 100);
				PfixedBudgetResult11.setText(reader.getPrice());
				PfixedBudgetResult13.setText(info.divwonprint[3]);
				PfixedBudgetResult15.setText(divper);
				if (PfixedBudegetBugettf1.getText() != "") {
					int Budget = Integer.parseInt(PfixedBudegetBugettf3.getText().replace(",", ""));
					String pricDivmonthBuget = String.valueOf(Budget / price);
					PfixedBudgetResult3.setText(pricDivmonthBuget);
//					PfixedBudgetResult6.setText(String.valueOf();
					PfixedBudgetResult6.setText(formatter.format((Budget / price) * divwon));

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			ktandg.setFont(big);
			ktandg.setForeground(Color.lightGray);

		}

		@Override
		public void mouseExited(MouseEvent e) {
			ktandg.setFont(ValuesFont);
			ktandg.setForeground(Color.white);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class samsungMouseEvent implements ActionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			PfixedBudgetResult1.setText(samsung.getText());
			PfixedBudgetResult1.setForeground(Color.red);
			PfixedBudgetResult9.setText(PfixedBudgetResult1.getText());
			PfixedBudgetResult9.setForeground(Color.red);
			int price = 0;
			double divwon = 0;
			try {
				Urlreader reader = new Urlreader(PfixedBudgetResult1.getText());
				sharesInfo info = new sharesInfo(PfixedBudgetResult1.getText());
				if (reader.getPrice().contains(",")) {
					price = Integer.parseInt(reader.getPrice().replace(",", ""));
				} else {
					price = Integer.parseInt(reader.getPrice());
				}
				if (info.divwonprint[3].contains(",")) {
					divwon = Double.parseDouble(info.divwonprint[3].replace(",", ""));
				} else {
					divwon = Double.parseDouble(info.divwonprint[3]);
				}
				DecimalFormat formatter = new DecimalFormat("###,###");

				String divper = String.format("%.1f", (divwon / price) * 100);
				PfixedBudgetResult11.setText(reader.getPrice());
				PfixedBudgetResult13.setText(info.divwonprint[3]);
				PfixedBudgetResult15.setText(divper);
				if (PfixedBudegetBugettf1.getText() != "") {
					int Budget = Integer.parseInt(PfixedBudegetBugettf3.getText().replace(",", ""));
					String pricDivmonthBuget = String.valueOf(Budget / price);
					PfixedBudgetResult3.setText(pricDivmonthBuget);
//					PfixedBudgetResult6.setText(String.valueOf();
					PfixedBudgetResult6.setText(formatter.format((Budget / price) * divwon));

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			samsung.setFont(big);
			samsung.setForeground(Color.lightGray);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			samsung.setFont(ValuesFont);
			samsung.setForeground(Color.white);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class hanjatakMouseEvent implements ActionListener, MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			PfixedBudgetResult1.setText(hanjatak.getText());
			PfixedBudgetResult1.setForeground(Color.red);
			PfixedBudgetResult9.setText(PfixedBudgetResult1.getText());
			PfixedBudgetResult9.setForeground(Color.red);
			int price = 0;
			double divwon = 0;
			try {
				Urlreader reader = new Urlreader(PfixedBudgetResult1.getText());
				sharesInfo info = new sharesInfo(PfixedBudgetResult1.getText());
				if (reader.getPrice().contains(",")) {
					price = Integer.parseInt(reader.getPrice().replace(",", ""));
				} else {
					price = Integer.parseInt(reader.getPrice());
				}
				if (info.divwonprint[3].contains(",")) {
					divwon = Double.parseDouble(info.divwonprint[3].replace(",", ""));
				} else {
					divwon = Double.parseDouble(info.divwonprint[3]);
				}
				DecimalFormat formatter = new DecimalFormat("###,###");

				String divper = String.format("%.1f", (divwon / price) * 100);
				PfixedBudgetResult11.setText(reader.getPrice());
				PfixedBudgetResult13.setText(info.divwonprint[3]);
				PfixedBudgetResult15.setText(divper);
				if (PfixedBudegetBugettf1.getText() != "") {
					int Budget = Integer.parseInt(PfixedBudegetBugettf3.getText().replace(",", ""));
					String pricDivmonthBuget = String.valueOf(Budget / price);
					PfixedBudgetResult3.setText(pricDivmonthBuget);
//					PfixedBudgetResult6.setText(String.valueOf();
					PfixedBudgetResult6.setText(formatter.format((Budget / price) * divwon));

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			hanjatak.setFont(big);
			hanjatak.setForeground(Color.lightGray);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			hanjatak.setFont(ValuesFont);
			hanjatak.setForeground(Color.white);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class miraeMouseEvent extends WindowAdapter implements ActionListener, KeyListener, MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			PfixedBudgetResult1.setText(mirae.getText());
			PfixedBudgetResult1.setForeground(Color.red);
			PfixedBudgetResult9.setText(PfixedBudgetResult1.getText());
			PfixedBudgetResult9.setForeground(Color.red);
			int price = 0;
			double divwon = 0;
			try {
				Urlreader reader = new Urlreader(PfixedBudgetResult1.getText());
				sharesInfo info = new sharesInfo(PfixedBudgetResult1.getText());
				if (reader.getPrice().contains(",")) {
					price = Integer.parseInt(reader.getPrice().replace(",", ""));
				} else {
					price = Integer.parseInt(reader.getPrice());
				}
				if (info.divwonprint[3].contains(",")) {
					divwon = Double.parseDouble(info.divwonprint[3].replace(",", ""));
				} else {
					divwon = Double.parseDouble(info.divwonprint[3]);
				}
				DecimalFormat formatter = new DecimalFormat("###,###");

				String divper = String.format("%.1f", (divwon / price) * 100);
				PfixedBudgetResult11.setText(reader.getPrice());
				PfixedBudgetResult13.setText(info.divwonprint[3]);
				PfixedBudgetResult15.setText(divper);
				if (PfixedBudegetBugettf1.getText() != "") {
					int Budget = Integer.parseInt(PfixedBudegetBugettf3.getText().replace(",", ""));
					String pricDivmonthBuget = String.valueOf(Budget / price);
					PfixedBudgetResult3.setText(pricDivmonthBuget);
//					PfixedBudgetResult6.setText(String.valueOf();
					PfixedBudgetResult6.setText(formatter.format((Budget / price) * divwon));

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			mirae.setFont(big);
			mirae.setForeground(Color.lightGray);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			mirae.setFont(ValuesFont);
			mirae.setForeground(Color.white);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class JohnLeeFrame extends WindowAdapter implements ActionListener, KeyListener {
		public void windowClosing(WindowEvent we) {
			JohnLeeFrame.dispose();
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == 10) {
			}
			if (e.getKeyCode() == 27) {
				System.exit(0);
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getActionCommand().equals("확인")) {
				JohnLeeFrame.dispose();
			}
		}
	}
}
