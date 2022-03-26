package pkg1;

public class Parentmethod {
public void defaultparent() {
	System.out.println("parent default method");
}
public void one(int a) {
	System.out.println("parent one parameterized method");
}
public void two(int a, int b) {
	this.three(1, 2, 3);
	this.defaultparent();
	this.one(1);
	System.out.println("parent two parameterized method");
	
}
public void three(int a, int b, int c) {
	System.out.println("parent three parameterized method");
}
}
