public class Employee {     //parent/base class
	float salary = 400000;
}
class Inherit extends Employee {    //child/derived/extended
	int bonus =10000;
	public static void main(String[] args) {
		Inherit i = new Inherit();      //obj. or child class
		System.out.println("Salary is:" + i.salary);
		System.out.println("Bonus is:" + i.bonus);
	}
}
