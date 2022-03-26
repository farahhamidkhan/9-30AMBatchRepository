package pkg1;

public class class1 {
public void method1() {
	System.out.println("create object of class in same class and call");
}
public void method2() {
	System.out.println("create object in other class same package and call");
}
public void method3() {
	System.out.println("create object in other class other package and call");
}
public static void main(String[] args) {
	class1 obj=new class1();
	obj.method1();
}

}
