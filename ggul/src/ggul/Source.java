package ggul;

import java.awt.*;
import java.util.*;

public class Source {

	///// SHARING Sources
	ArrayList<sharesVo> shareslist, select_proverb, show_trade_val, Load_user_interest_list;
	sharesDAO sharesDao;
	Font big = new Font("¸¼Àº °íµñ", Font.BOLD, 23);
	/////////////////////// StartFrame Sources
	Date date = new Date();
	int monthFixed = 11 - date.getMonth();
	Font titleText = new Font("Dialog", Font.BOLD, 20);
	Font FixedBudgetFont = new Font("Monospaced", Font.BOLD, 16);
	Font ValuesFont = new Font("¸¼Àº °íµñ", Font.BOLD, 20);
	Frame FirstFrame, SecondFrame, JohnLeeFrame;
	Label LJohnleeproverb;

	Panel PMainPanel, PfixedBudget, PreduceBudget, Pvalues;
	Button BJohnleeok;
	CheckboxGroup CBGselectyourfavor;
	Checkbox cb1;
	Checkbox cb2;
	Label cb1Label, cb2Label;

	////////////////////////// bodyFrame Sources
	// ¹è´ç±Ý Â¬Â©ÇÑ Á¾¸ñµé
	Label mirae, hanhwa, samsung, hanjatak, ktandg;

	// ÆÐ³Î ¿ù ¾ó¸¶¾¿ °è¼Ó¸ðÀ»¶§
	TextField PfixedBudegetBugettf1, PfixedBudegetBugettf2, PfixedBudegetBugettf3;
	Label PfixedBudgetIf1, PfixedBudgetIf2, PfixedBudgetIf3, PfixedBudgetIf4;
	Label PfixedBudgetIf5;
	Label PfixedBudgetResult1, PfixedBudgetResult2, PfixedBudgetResult3, PfixedBudgetResult5, PfixedBudgetResult6,
			PfixedBudgetResult7, PfixedBudgetResult4, PfixedBudgetResult8, PfixedBudgetResult9, PfixedBudgetResult10,
			PfixedBudgetResult11, PfixedBudgetResult12, PfixedBudgetResult13, PfixedBudgetResult14,
			PfixedBudgetResult15, PfixedBudgetResult16;
	Button FixedCalculate;
}
