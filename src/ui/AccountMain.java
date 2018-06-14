package ui;
/*
 비트뱅크
 기본통장 
 계좌번호: 123-456-789
 이름: 홍길동
 생성일 : 2018년 6월10일
 잔액: 10000원
 ---------------------------
 비트뱅크
 마이너스통장 
 계좌번호: 123-456-789
 이름: 홍길동
 생성일 : 2018년 6월10일
 (대출받으시겠습니까) 물어보기
 잔액: -10000원
 개설하는 것까지만
 * */

import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
enum Butt {
EXIT,Account_Create,Minus_Account_Create;
}
public class AccountMain {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.Account_Create, Butt.Minus_Account_Create};
		Account person1 = null;
		MinusAccount person2 = null;
		while(true) {
			Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"MATRIX PAGE", // frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1]); // default
			switch(select) {
			case EXIT: return;
			case Account_Create:
				person1 = new Account();
				person1.setName(JOptionPane.showInputDialog("이름"));
				person1.setUid(JOptionPane.showInputDialog("아이디"));
				person1.setPass(JOptionPane.showInputDialog("패스워드"));
				person1.setCreateDate();
				person1.setAccountNo();
				JOptionPane.showMessageDialog(null, person1.toString());
				break;
			case Minus_Account_Create:
				person2 = new MinusAccount();
				person2.setName(JOptionPane.showInputDialog("이름"));
				person2.setUid(JOptionPane.showInputDialog("아이디"));
				person2.setPass(JOptionPane.showInputDialog("패스워드"));
				person2.setName("마이너스통장");
				person2.setAccountNo();
				JOptionPane .showMessageDialog(null, person2.toString());
				break;
			}
		}
	}

}
