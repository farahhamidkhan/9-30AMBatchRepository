package pkg1;

public class constructer {
public constructer() {
	System.out.println("default constructor");
}
public constructer(int a) {
	this(1,2,3);
	System.out.println("1 parameterized constructor");
}
public constructer(int a, int b) {
	this();
	System.out.println("2 parameterized constructor");
}
public constructer(int a, int b, int c) {
	this(1,2);
	System.out.println("3 parameterized constructor");
}
public constructer(int a, int b, int c, int d) {
	System.out.println("4 parameterized constructor");
}
public static void main(String[] args) {
	constructer object=new constructer(1);
}
}
