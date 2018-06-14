package domain;

import javax.swing.JOptionPane;

public class MinusAccount extends Account{
	public String toString() {
		super.setAccountType("마이너스통장");
		super.setName(name);
		public void setName(String name) {
			super.name = name;
			switch(JOptionPane.showInputDialog("대출받으시겠습니까\n1네\n2아니오")) {
			case "1":
				setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출금액")));
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

		
		return String.format("%s\n%s\n계좌번호: %s\n이름: %s\n생성일: %s\n잔액: %d", BANK_NAME, super.getAccountType(), super.getAccountNo(), super.getName(), super.getCreateDate());
	}
}
}
