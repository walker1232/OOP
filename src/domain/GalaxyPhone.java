package domain;
public class GalaxyPhone extends IPhone{
	private String size;
			// ȫ�浿���� 010 ��ȣ�� �Ｚ ��ǰ 6��ġ �����ó�Ʈ���� ����ؼ� �̵������� ���·� 
			// �ȳ��̶�� ���ڸ� ī���ߴ�
			// data�� �������̵�
	static String BRAND = "�Ｚ", KIND = "�����ó�Ʈ��";
	public void setSize(String size) {
		this.size = size;
	}
	public void setData(String data) {
		super.data = data+"ī���ߴ�";
	}
	public String getSize() {
		return size;
	}
	public String toString() {
		super.setPortable(true);
		return String.format("%s ���� %s ��ȣ�� %s ��ǰ %s��ġ %s�� ����ؼ� %s�� ���·� %s", 
								super.getName(), super.getPhoneNum(), BRAND, size ,KIND, super.getMove(), super.getData());
	}
}
