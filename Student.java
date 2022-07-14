package com;


	public class Student { // another class 
		int id;
		String name;
		Address address; // aggregation (entity ref of address class)
		public Student (int id , Address address,String name) {
			this.id=id;
			this.name=name;
			this.address=address;
		}
		void display() {// method
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
		}
		public static void main(String args[]) {
			Address address1 = new Address("shyamnagar","wb","india");
			Address address2 = new Address("kolkata","wb","india");
			Student s = new Student(10,address1,"Jaita");
			Student s1 = new Student(11,address2,"Arpan");
			s.display();
			s1.display();
		}

	}


