package pkg1;

public class usingthisinmethod {
public void methoda()
{
	this.methodd(1, 2, 3);
	System.out.println("default method a");
	this.methodb(1);
}
public void methodb(int a)
{
	System.out.println("1 perametrised method b");
	this.methode(1, 2, 3, 4);
	this.methodc(1, 2);
}
public void methodc(int a, int b)
{
	System.out.println("2 perametrised method c");
}
public void methodd(int a, int b, int c)
{
	System.out.println("3 perametrised method d");
}
public void methode(int a, int b, int c, int d)
{
	System.out.println("4 perametrised method e");
}
public static void main(String[] args) {
	usingthisinmethod objectcreated=new usingthisinmethod();
	objectcreated.methoda();
}
}