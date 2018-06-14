package domain;
/*
 로또를 추첨
 1~45 까지 랜덤숫자
 볼갯수는 총 6개
 출력은 [5, 23, 2, 40, 19, 22]
 얼마치를 구입하십니까?
 5200
 5	7	14	25	29	43
 3	23	33	34	38	40
 ball 변수 하나로 
 로또 input 돈받기
 로또 output 출력
 1줄에 천원
 * */
public class Lotto {
	//int ball1, ball2, ball3, ball4, ball5, ball6, money;
	int[] ball = new int[6];
	int money;
	String result;
	public void setBall() {
		for(int i=0; i<6; i++) {
			this.ball[i] = (int)(Math.random() * 45)+1;
		}
	}
	
	public void setResult() {
		for(int i=0; i<6; i++) {
			result += ball[i]+" ";
		}
	}
	public void setMoney(int money) {
		this.money = money/1000;
	}
	public String toString() {
		for(int i=0; i<money; i++) {
			setBall();
			result += String.format("[%d %d %d %d %d %d]\n", ball[0], ball[1], ball[2], ball[3], ball[4], ball[5]);
		}
		return result;
	}
	/*public String toString() {
		return String.format("[%d %d %d %d %d %d]", ball[1], ball[2], ball[3], ball[4], ball[5], ball[6]);
	}*/
	/*public void test() {
		System.out.printf("[%d %d %d %d %d %d]", ball1, ball2, ball3, ball4, ball5, ball6);
	}*/
	
}



/*public void setBall1() {
this.ball1 = (int)(Math.random() * 45)+1;
}
public void setBall2() {
this.ball2 = (int)(Math.random() * 45)+1;
}
public void setBall3() {
this.ball3 = (int)(Math.random() * 45)+1;
}
public void setBall4() {
this.ball4 = (int)(Math.random() * 45)+1;
}
public void setBall5() {
this.ball5 = (int)(Math.random() * 45)+1;
}
public void setBall6() {
this.ball6 = (int)(Math.random() * 45)+1;
}
public void setMoney(int money) {
this.money = money;
}*/