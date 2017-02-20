class StaticDemo 
{
	
	public StaticDemo(){

	}

	public static int x;

	public StaticDemo(int x){
		this.x = x;
	}

	public  int getX(){
		return x;
	}


	//声明一个工具方法，工具方法只需要用类名.方法名的方式就可以调用了。不需要创建对象
	public static int getSum(int a,int b){
		return a+b;
	}
}

class TestStaticDemo
{
	public static void main(String[] args) 
	{
		StaticDemo sd = new StaticDemo(100);
		StaticDemo sd1 = new StaticDemo(200);
		System.out.println("sd.x = "+sd.getX());
		System.out.println("sd1.x = "+sd1.x);

		System.out.println("1+1 = "+StaticDemo.getSum(1,1));
	}
}
