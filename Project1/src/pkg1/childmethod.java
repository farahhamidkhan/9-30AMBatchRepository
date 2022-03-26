package pkg1;

public class childmethod extends Parentmethod{
public void defaultmethod() {
	super.two(1, 2);
	System.out.println("child default method");
	this.threeparameterizedmethod(1, 2, 3);
	this.oneparameterizedmethod(1);
	this.twoparameterizedmethod(1, 2);
}
public void oneparameterizedmethod(int a) {
	System.out.println("child 1 parameterized method");
}
public void twoparameterizedmethod(int a, int b) {
	System.out.println("child 2 parameterized method");
}
public void threeparameterizedmethod(int a, int b, int c) {
	System.out.println("child 3 parameterized method");
}
public static void main(String[] args) {
childmethod object=new childmethod();
object.defaultmethod();
}
}
