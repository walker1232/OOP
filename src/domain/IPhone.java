package domain;
public class IPhone extends CellPhone{
	protected String data;
	static String BRAND = "����", KIND = "������";
	public void setData(String data) {
		this.data = data+"�̶�� �����ߴ�";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		// ȫ�浿���� 010 ��ȣ�� ���� ��ǰ �������� ����ؼ� �̵������� ���·� 
		// �ȳ��̶�� ���ڸ� �����ߴ�
		super.setPortable(true);
		return String.format("%s ���� %s ��ȣ�� %s ��ǰ %s�� ����ؼ� %s�� ���·� %s", 
								super.getName(), super.getPhoneNum(), BRAND, KIND, super.getMove(), data);
	}
}
