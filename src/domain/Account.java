package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Account {
	public final static String BANK_NAME="��Ʈ��ũ";
	public final static String ACCOUNT_TYPE="�⺻����";
	public final static String WITHDRAW_SUCCESS="��ݼ���";
	public final static String WITHDRAW_FAIL="�ܾ׺���";
	public final static String DEPOSIT_SUCCESS="�Աݼ���";
	public final static String DEPOSIT_FAIL="������ �Է°��� �ƴ�";
	protected int money=0;
	protected String name,uid,pass,accountType,createDate,accountNo="";
	// ���� 123-345-678 �� ���°� �ǵ��� �ڵ�
	// ��α׿��� ���� ��¥ �̴� ���� ������ ����
	public void setName(String name) {
		this.name = name;
		setMoney(Integer.parseInt(JOptionPane.showInputDialog("�Աݱݾ�")));
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
		SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM��dd��");
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
		return String.format("%s\n%s\n���¹�ȣ: %s\n�̸�: %s\n������: %s\n�ܾ�: %d", BANK_NAME, ACCOUNT_TYPE, accountNo, name, createDate, money);
	}
}
