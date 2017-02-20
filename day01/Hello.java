class Bird{
	//无参：没一个有用static声明一个方法的时候，每个类会默认带一个无参的方法
	public Bird(){
		System.out.println("鸟类的无参构造方法被调用");
	}
	//带参：
	public Bird(String n,int a){
		name = n;
		age = a;
		System.out.println("鸟类的带参构造方法被调用");
	}
	int age;
	String name;
//声明在java类中的方法叫做类的成员方法；
//成员方法：权限修饰符 返回值类型 方法名（形参1，形参2...）
//权限修饰符包括 public / protected default ,private四种
//成员方法：
	public void setName(String n){	
		name = n;
	}

}



class TestBird{
//main 方法是java程序的执行入口
	public static void main(String []args) {	
	 	System.out.println("hello world");
		Bird b = new Bird("小明",3);
		b.setName("夜莺");
		System.out.println("鸟的名字："+b.name+" 年龄:"+b.age);
	}
}
