class Student{
//instance variable
int id;
String name;
int age;

//method to display student detail

void displayDetail(){
	//local variable in method 
	String status = "Active";
System.out.println("student id:"+id);
System.out.println("student name:"+name);
System.out.println("student age:"+age);
}

//main method

public static void main(String[] args) {

//object creation
Student s1 = new Student ();

//assigning value to instance variable

s1.id = 101;
s1.name = "krishna";
s1.age = 20;

//methods calls

s1.displayDetail();
}
}