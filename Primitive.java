package finalKeyword;

class Prim
{
	final  static int  c;// when we declare  a instance variable as final we have to intialize it in the same line 
	
	static
	{
		c=30;
		
	}
	
}

public class Primitive {

	public static void main(String[] args) {
		final int a;
		a=10;
		
		int b=20;
		b++;
		System.out.println(Prim.c);// c is a class variable
		System.out.println(a);
		System.out.println(b);
	}

}
