package domain;
public class CellPhone extends Phone{
	public static final String BRAND = "��Ű��", KIND = "�޴���";
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
		/*if(portable) {
			setMove("�̵� ����");
		}else {
			setMove("�̵� �Ұ���");
		}*/
		//String f = (portable) ? "�̵� ����" : "�̵� �Ұ���";
		setMove((portable) ? "�̵� ����" : "�̵� �Ұ���");
		this.portable = portable;
	}
	public boolean isPortable() {
		return portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	public String toString() {
		setPortable(true);
		return String.format("%s ���� %s ��ȣ�� %s ��ǰ %s�� ����ؼ� %s ��� ��ȭ�ߴ�", 
								super.getName(), 
								super.getPhoneNum(), 
								move,BRAND, KIND, 
								super.getCall()); // ȫ�浿, 010-1234-5678,�Ｚ,����ȭ��,2�ÿ�����
	}
}
