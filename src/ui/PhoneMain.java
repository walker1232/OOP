package ui;
import javax.swing.JOptionPane;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.GalaxyPhone;
/*enum Butt {
EXIT,Home_phone_Input,CellPhone,IPhone,GalaxyPhone;
}*/
/*public class PhoneMain {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.Home_phone_Input, Butt.CellPhone,Butt.IPhone,Butt.GalaxyPhone};
		Phone phone = null;
		CellPhone cp = null;
		IPhone user = null;
		GalaxyPhone galaxy = null;
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
			case Home_phone_Input:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("�̸�"));
				phone.setPhoneNum(JOptionPane.showInputDialog("��ȭ��ȣ"));
				phone.setCall(JOptionPane .showInputDialog("����"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CellPhone:
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("�̸�"));
				cp.setPhoneNum(JOptionPane.showInputDialog("��ȭ��ȣ"));
				cp.setCall(JOptionPane .showInputDialog("����"));
				
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPhone:
				user = new IPhone();
				user.setName(JOptionPane.showInputDialog("�̸�"));
				user.setPhoneNum(JOptionPane.showInputDialog("��ȭ��ȣ"));
				user.setData(JOptionPane .showInputDialog("���ڳ���"));
				JOptionPane.showMessageDialog(null, user.toString());
				break;
			case GalaxyPhone:
				galaxy = new GalaxyPhone();
				galaxy.setName(JOptionPane.showInputDialog("�̸�"));
				galaxy.setPhoneNum(JOptionPane.showInputDialog("��ȭ��ȣ"));
				galaxy.setSize(JOptionPane.showInputDialog("������"));
				galaxy.setData(JOptionPane .showInputDialog("ī�峻��"));
				JOptionPane.showMessageDialog(null, galaxy.toString());
			}
			
		}

	}

}*/
