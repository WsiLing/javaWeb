class Bird{

	//无参的构造方法
	public Bird(){
		System.out.println("鸟类的无参构造方法被调用");
	}

	//带参数的构造方法
	public Bird(String n,int a){
		name = n;
		age = a;
		System.out.println("鸟类的带参构造方法被调用  n = "+n+ " a = "+a);
	}

	int age;
	String name;

	//成员方法
	public void setName(String n){	
		name = n;
	}
	
	
}

class TestBird{
	//main方法是java程序执行的入口
	public static void main(String [] args){
		
		//System.out.println("这是我的第一个java程序");
		//创建一个鸟的实例，并且赋值给变量b
		Bird b = new Bird("小明",3);
		
		b.setName("夜莺");
		
		System.out.println("鸟的名字："+b.name+" 年龄:"+b.age);
		
		
	}

}