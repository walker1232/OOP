package domain;
public class Phone {
	private String name, phoneNum, call;
	static String BRAND = "�Ｚ";
	static String KIND = "����ȭ";
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setCall(String call) {
		this.call = call;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getCall() {
		return call;
	}
	public String toString() {
		return String.format("%s ���� %s ��ȣ�� %s ��ǰ %s�� ����ؼ� %s ��� ��ȭ�ߴ�", 
								name, phoneNum, BRAND, KIND, call); // ȫ�浿, 010-1234-5678,�Ｚ,����ȭ��,2�ÿ�����
	}
}
