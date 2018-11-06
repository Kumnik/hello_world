class Demo2 extends Demo1
{
	void disp1()
	{
		System.out.println("level1");
	}
}

class Demo1 extends Demo2
{
	void disp2()
	{
		System.out.println("level2");
	}
}

class Demo
{
	public static void main(String args[])
	{
		Demo2 d=new Demo2();
		d.disp1(); 
	}
}  