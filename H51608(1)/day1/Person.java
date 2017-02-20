class  Person
{
	private String name;

	private int age;

	private char sex;


	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		if(age < 0||age>200){
			return ;
		}

		this.age = age;
	}

	/**
	*获取0到num之间所有数的和
	*/
	public int getSum(int num){
		int sum= 0;
			for(int i=1;i<=num;i++){
				sum+=i;
			}
			return sum;
	}
	
}


class TestPerson
{
	public static void main(String [] args){
			
			Person p = new Person();
			int sum = p.getSum(1500);
			System.out.println("sum = "+sum);

			
			sum = p.getSum(10000);
			System.out.println("sum = "+sum);

			
//			p.age = -100;
			p.setAge(-100);

			System.out.println("p.age = "+p.getAge());

	}



}