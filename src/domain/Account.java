package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money=0;
	/*protected*/public String name,uid,pass,accountType,createDate,accountNo="";
	// 통장 123-345-678 의 형태가 되도록 코딩
	// 블로그에서 오늘 날짜 뽑는 로직 가져다 쓰기
	public void setName(String name) {
		this.name = name;
		setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setCreateDate() {
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일");
		this.createDate = format.format(today);
	}
	public void setAccountNo() {
		for(int i=1; i<10; i++) {
			this.accountNo += (i==3 || i==6) ? (int)(Math.random()*9)+"-" : (int)(Math.random()*9);
		}
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String toString() {
		return String.format("%s\n%s\n계좌번호: %s\n이름: %s\n생성일: %s\n잔액: %d", BANK_NAME, ACCOUNT_TYPE, accountNo, name, createDate, money);
	}
}
