package in.sp.bean;

public class Student {
	
	private String name;
	private int rollno;
	private float marks;
	private Address address;
	private Subject subj;	
	
	public Student(String name, int rollno, float marks,Address address, Subject subj) {
		
		this.name = name;
		this.rollno=rollno;
		this.marks=marks;
		this.address=address;
		this.subj=subj;
		
	}
	
	public void display() {

		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollno);
		System.out.println("Marks : "+marks);
		System.out.println(address);
		System.out.println(subj);
	}

}
