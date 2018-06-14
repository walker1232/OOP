package domain;

public class BMI {
	String name, result;
	double height, weight;
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setResult() {
		height = height/100;
		double res = weight / (height * weight);
		if(res >= 35){
			result = "thrid fat";
		}else if(res >= 18.5 && res < 23){
			result = "normal";
		}else if(res >= 23 && res < 25){
			result = "before fat";
		}else if(res >= 25 && res < 30){
			result = "first fat";
		}else if(res >= 30 && res < 35){
			result = "second fat";
		}else{
			result = "low";
		}
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("| %s | %f | %f | %s |", name, height, weight, result);
	}
}
