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


	//����һ�����߷��������߷���ֻ��Ҫ������.�������ķ�ʽ�Ϳ��Ե����ˡ�����Ҫ��������
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
