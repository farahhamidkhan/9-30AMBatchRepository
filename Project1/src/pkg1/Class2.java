package pkg1;

public class Class2 {
public int sum(int a, int b) {
int c=a+b;
return c;
}
public int sub(int a, int b) {
	int c=a-b;
	return c;
}
public int multi(int a, int b) {
	int c=a*b;
	return c;
}
public void div(int a, int b) {
	int c=a/b;
	System.out.println("Result is ="+c);
}
public static void main(String[] args) {
	Class2 referenceVariable=new Class2();
	int returnsum=referenceVariable.sum(10, 2);
	int returnsum1=referenceVariable.sum(returnsum, 2);
	int returnsub=referenceVariable.sub(returnsum1, 2);
	int returnmulti=referenceVariable.multi(returnsub, 2);
	referenceVariable.div(returnmulti, 2);
}
}
