class Computer{

	private String brand;
	private int price;
	private String type;

	public Computer(String brand,int p,String t){
		this.brand = brand;
		//brand = brand;
		price = p;
		type = t;
	}

	public void setBrand(String b){
		this.brand = b;
	}

	public String getBrand(){
		return this.brand;
	}

	public void setPrice(int p ){
		System.out.println("this = "+this);
		this.price = p;
	}

	public int getPrice(){
		return this.price;
	}

	public void setType(String t){
		this.type = t;
	}

	public String getType(){
		return this.type;
	}
}



class TestComputer
{
	public static void main(String []args){
		
		Computer c =new Computer("����",3000,"T400");

		Computer c1 = new Computer("Hasee",2000,"SL-z7");
		System.out.println(" c = "+c);
		System.out.println(" c1 = "+c1);

		c1.setPrice(5000);

		System.out.println("Ʒ��:"+c.getBrand()+" �۸�:"+c.getPrice()+" �ͺ�:"+c.getType());
	}
}

