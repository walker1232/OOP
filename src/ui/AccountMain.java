package ui;
/*
 ��Ʈ��ũ
 �⺻���� 
 ���¹�ȣ: 123-456-789
 �̸�: ȫ�浿
 ������ : 2018�� 6��10��
 �ܾ�: 10000��
 ---------------------------
 ��Ʈ��ũ
 ���̳ʽ����� 
 ���¹�ȣ: 123-456-789
 �̸�: ȫ�浿
 ������ : 2018�� 6��10��
 (��������ðڽ��ϱ�) �����
 �ܾ�: -10000��
 �����ϴ� �ͱ�����
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
				person1.setName(JOptionPane.showInputDialog("�̸�"));
				person1.setUid(JOptionPane.showInputDialog("���̵�"));
				person1.setPass(JOptionPane.showInputDialog("�н�����"));
				person1.setCreateDate();
				person1.setAccountNo();
				JOptionPane.showMessageDialog(null, person1.toString());
				break;
			case Minus_Account_Create:
				person2 = new MinusAccount();
				person2.setName(JOptionPane.showInputDialog("�̸�"));
				person2.setUid(JOptionPane.showInputDialog("���̵�"));
				person2.setPass(JOptionPane.showInputDialog("�н�����"));
				person2.setName("���̳ʽ�����");
				person2.setAccountNo();
				JOptionPane .showMessageDialog(null, person2.toString());
				break;
			}
		}
	}

}
