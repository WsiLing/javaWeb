class Computer{
	
	public String pinpai;
	public int price;
	public String type;

	public Computer(){
		System.out.println("��������޲ι��췽��������");
	}

	public Computer(String pinpai,int p,String t){
		this.pinpai = pinpai;
		price = p;
		type = t;
		System.out.println("��������ι��췽��������");
	};
//��Ա������
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
		Computer c = new Computer("����",3000,"T400");
		c.setPinpai("��˶");		
		System.out.println("���Ե�Ʒ��:"+c.getPinpai()+",�۸�Ϊ��"+c.getPrice()+",����Ϊ��"+c.getType());
		
	}
	
}