package ui;
import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
/*enum Butt {
	EXIT, INPUT_BMI, OUTPUT_BMI, INPUT_GRADE, OUTPUT_GRADE, INPUT_SALARY, OUTPUT_SALARY;
}*/

public class Main {
	public static void main(String[] args) {
		/*Butt[] buttons = { Butt.EXIT, Butt.INPUT_BMI, Butt.OUTPUT_BMI, Butt.INPUT_GRADE, Butt.OUTPUT_GRADE, 
		Butt.INPUT_SALARY, Butt.OUTPUT_SALARY };*/
		BMI[] arr = new BMI[2];
		BMI bmi = null;
		Grade[] students = new Grade[2];
		Grade info = null;
		Salary[] employee = new Salary[5];
		Salary employeeInfo = null;
		//Lotto[] lotto = new Lotto[5];
		Lotto lotto = null;
		int count = 0, studentCount = 0, employeeCount = 0, lottoCount = 0;
		while(true) {
			/*Butt select = (Butt) JOptionPane.showInputDialog(null, // frame
					"MATRIX PAGE", // frame title
					"SELECT MATRIX MENU", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default*/
			String menu = JOptionPane.showInputDialog("0.종료\n" + "1.input_BMI\n" + "2.output_BMI\n" + "3.input_Garde\n" + "4.output_Grade\n"
														+ "5.input_Salary\n" + "6.output_Salary\n" + "7.input_Lotto\n" + "8.output_Lotto\n");
			switch(menu) {
			case "0": return;
			case "1":
				bmi = new BMI();	// 기존 값 청소
				bmi.setName(JOptionPane.showInputDialog("이름"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				//String name = JOptionPane.showInputDialog("이름");
				//double height = Double.parseDouble(JOptionPane.showInputDialog("키"));
				//double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게"));
				/*bmi.setName(name);
				bmi.setHeight(height);
				bmi.setWeight(weight);*/
				bmi.setResult();
				arr[count]=bmi;
				count++;
				/*String result = String.format("%s, %f mm, %f kg, %s", bmi.getName(), 
																	  bmi.getHeight(), 
																	  bmi.getWeight(), 
																	  bmi.getResult());*/
				
				//arr[0] = result;
				//JOptionPane.showMessageDialog(null, result);
				/*JOptionPane.showMessageDialog(null, String.format("%s, %f mm, %f kg, %s", bmi.getName(), 
						  																  bmi.getHeight(), 
						  																  bmi.getWeight(), 
						  																  bmi.getResult()));*/
				//JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				String output = "";
				for(int i=0; i<arr.length;i++) {
					output += arr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "3":
				info = new Grade();
				info.setName(JOptionPane.showInputDialog("이름"));
				info.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수")));
				info.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수")));
				info.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수")));
				info.setTotal();
				info.setAvg();
				info.setGrade();
				students[studentCount]=info;
				studentCount++;
				break;
			case "4":
				String gradeOutput = "";
				for(int i=0; i<studentCount; i++) {
					gradeOutput += students[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, gradeOutput);
				break;
			case "5":
				employeeInfo = new Salary();
				employeeInfo.setDept(JOptionPane.showInputDialog("부서"));
				employeeInfo.setName(JOptionPane.showInputDialog("이름"));
				employeeInfo.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉")));
				employeeInfo.setBonus(Integer.parseInt(JOptionPane.showInputDialog("보너스")));
				employeeInfo.setSum();
				employee[employeeCount]=employeeInfo;
				employeeCount++;
				break;
			case "6":
				String inFoOutput = "";
				for(int i=0;i<employeeCount;i++) {
					inFoOutput += employee[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, inFoOutput);
				break;
			case "7":
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("가격")));
					//ball.setBall();
					
					//lotto[lottoCount++]=ball;
					//ball.test();
			
				}
				
				break;
			//case "8":
				/*String lottoOutput = "";
				for(int i=0; i< lottoCount; i++) {
					lottoOutput += lotto[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, lottoOutput);*/
				//JOptionPane .showMessageDialog(null, lotto.toString());
				//break;
			}
		}

	}

