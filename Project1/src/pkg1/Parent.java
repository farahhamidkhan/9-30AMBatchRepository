package pkg1;

public class Parent {
public Parent(){
	System.out.println("Parent Default condtructor");
}
public Parent(int a){
	this(1,1,1);
	System.out.println("Parent one parameterized condtructor");
}
public Parent(int a, int b){
	this();
	System.out.println("Parent two parameterized condtructor");
}
public Parent(int a, int b, int c){
	this(1,1);
	System.out.println("Parent three parameterized condtructor");
}
}
