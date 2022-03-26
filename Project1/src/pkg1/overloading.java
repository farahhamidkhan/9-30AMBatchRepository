package pkg1;

public class overloading {
public void calcutate(int a, int b) {
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
}
public void calculate(int a1, int a2, int a3) {
	int a4;
	a4=a1+a2+a3;
	System.out.println("Sum result is "+a4);
}
public void calcutate(int a, float b) {
	float c;
	c=a+b;
	System.out.println("sum result is "+c);
}
public static void main(String[] args) {
	overloading obj=new overloading();
	obj.calcutate(12, 2);
	obj.calculate(11, 12, 13);
	obj.calcutate(1, 2.22f);
}
}
