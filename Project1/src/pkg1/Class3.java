package pkg1;

public class Class3 {
	public int div(int a, int b) {
		int c=a/b;
		return c;
		}
		public int sub(int a, int b) {
			int c=a-b;
			return c;
		}
		public int sum(int a, int b) {
			int c=a+b;
			return c;
		}
		public void multi(int a, int b) {
			int c=a*b;
			System.out.println("Result is ="+c);
		}
		public static void main(String[] args) {
			Class3 referenceVariable=new Class3();
			int returndiv=referenceVariable.div(10, 2);
			int returnsub=referenceVariable.sub(returndiv, 2);
			int returnsum=referenceVariable.sum(returnsub, 2);
			int returnsub1=referenceVariable.sub(returnsum, 2);
			referenceVariable.multi(returnsub1, 2);
		}
		}
