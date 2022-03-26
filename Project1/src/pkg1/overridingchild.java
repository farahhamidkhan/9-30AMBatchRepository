package pkg1;

public class overridingchild extends overridingparent{
public void calculate(int a1, int a2) {
	int a3;
	a3=a1-a2;
	System.out.println("child result is "+a3);
}
public static void main(String[] args) {
	overridingchild obj=new overridingchild();
	obj.calculate(12,2);
}
}
