package the_exam;

interface I
{
	public void i();
}

class L
{
	private int a;
	private M m;
	
	public L(M m ,int a)
	{
		this.m = m;
		this.a = a;
	}
	public void b() {}
	public void i() {}
}

class A
{
	
}

class B
{
	
}
class M
{
	private A a;
	private B b;
	public M(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
}

class X
{
	public void met(L I) {}
}

public class Diagramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
