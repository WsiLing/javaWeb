class Bird{

	//�޲εĹ��췽��
	public Bird(){
		System.out.println("������޲ι��췽��������");
	}

	//�������Ĺ��췽��
	public Bird(String n,int a){
		name = n;
		age = a;
		System.out.println("����Ĵ��ι��췽��������  n = "+n+ " a = "+a);
	}

	int age;
	String name;

	//��Ա����
	public void setName(String n){	
		name = n;
	}
	
	
}

class TestBird{
	//main������java����ִ�е����
	public static void main(String [] args){
		
		//System.out.println("�����ҵĵ�һ��java����");
		//����һ�����ʵ�������Ҹ�ֵ������b
		Bird b = new Bird("С��",3);
		
		b.setName("ҹݺ");
		
		System.out.println("������֣�"+b.name+" ����:"+b.age);
		
		
	}

}