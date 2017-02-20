class Computer{
	
	public String pinpai;
	public int price;
	public String type;

	public Computer(){
		System.out.println("电脑类的无参构造方法被调用");
	}

	public Computer(String pinpai,int p,String t){
		this.pinpai = pinpai;
		price = p;
		type = t;
		System.out.println("电脑类带参构造方法被调用");
	};
//成员方法：
	public void setPinpai(String m){
		pinpai = m;
	}
	public void setPrice(int p){
		price = p;
	}
	public void setPrice(String t){
		type = t;
	}

	public String getPinpai(){
		return pinpai;
	}
	public int getPrice(){
		return price;
	}
	public String getType(){
		return type;
	}
}

class TestComputer{
	public static void main(String []args){
		System.out.println("Hello World");
		Computer t = new Computer();
		Computer c = new Computer("联想",3000,"T400");
		c.setPinpai("华硕");		
		System.out.println("电脑的品牌:"+c.getPinpai()+",价格为："+c.getPrice()+",类型为："+c.getType());
		
	}
	
}