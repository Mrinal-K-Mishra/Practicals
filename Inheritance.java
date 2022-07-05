public class Employee {
	float salary = 400000;
}
class Inherit extends Employee {
	int bonus =10000;
	public static void main(String[] args) {
		Inherit i = new Inherit();
		System.out.println("Salary is:" + i.salary);
		System.out.println("Bonus is:" + i.bonus);
	}
}