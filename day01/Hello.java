class Bird{
	//�޲Σ�ûһ������static����һ��������ʱ��ÿ�����Ĭ�ϴ�һ���޲εķ���
	public Bird(){
		System.out.println("������޲ι��췽��������");
	}
	//���Σ�
	public Bird(String n,int a){
		name = n;
		age = a;
		System.out.println("����Ĵ��ι��췽��������");
	}
	int age;
	String name;
//������java���еķ���������ĳ�Ա������
//��Ա������Ȩ�����η� ����ֵ���� ���������β�1���β�2...��
//Ȩ�����η����� public / protected default ,private����
//��Ա������
	public void setName(String n){	
		name = n;
	}

}



class TestBird{
//main ������java�����ִ�����
	public static void main(String []args) {	
	 	System.out.println("hello world");
		Bird b = new Bird("С��",3);
		b.setName("ҹݺ");
		System.out.println("������֣�"+b.name+" ����:"+b.age);
	}
}
