package domain;

import javax.swing.JOptionPane;

public class MinusAccount extends Account{
	public String toString() {
		super.setAccountType("���̳ʽ�����");
		super.setName(name);
		public void setName(String name) {
			super.name = name;
			switch(JOptionPane.showInputDialog("��������ðڽ��ϱ�\n1��\n2�ƴϿ�")) {
			case "1":
				setMoney(Integer.parseInt(JOptionPane.showInputDialog("����ݾ�")));
				break;
			case "2":
				break;
			}
		}
		super.setUid(uid);
		super.setPass(pass);
		super.setCreateDate();
		super.setAccountNo();
		public void setMoney(int money) {
			super.money -= money;
		}

		
		//super.setUid(String uid);
		return String.format("%s\n%s\n���¹�ȣ: %s\n�̸�: %s\n������: %s\n�ܾ�: %d", BANK_NAME, super.getAccountType(), super.getAccountNo(), super.getName(), super.getCreateDate());
	}
}
}
