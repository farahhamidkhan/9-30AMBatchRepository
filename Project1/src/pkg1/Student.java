package pkg1;
public class Student {	
int age;
int rollno;
public void display1()
{
System.out.println("welcome to all of you");
}
public void display2()
{
System.out.println("automation is very easy");
}
public static void main(String[] args) {
Student Farah=new Student();
Farah.display1();
Farah.display2();
Farah.age=12;
Farah.rollno=1234;
System.out.println(Farah.age);
System.out.println(Farah.rollno);
}
}
