class Employee {
	String name;
	int age;
	String designation;
	double saraly;
	// Employee ��Ĺ�����
	public Employee(String name){
		this.name = name;
	}
//	����age��ֵ
	public void setAge(int age){
		this.age = age;
	}
//	����designation ��ֵ
	public void setDesignation(String designation){
		this.designation = designation;
	}
//	����saraly��ֵ
	public void setSaraly(double saraly){
		this.saraly = saraly;
	}
//	��ӡ��Ϣ
	public void printEmployee(){
		System.out.println("name:"+name);
		System.out.print("age:"+age);
		System.out.print(",designation:" + designation);
		System.out.print(",saraly:"+saraly);
	}
}
class EmployeeTest {
	public static void main(String args[]){
		/*ʹ�ù�����������������*/
		Employee empone = new Employee("Runboo1");
		Employee emptwo = new Employee("Runboo2");
		empone.setAge(2);
		empone.setDesignation("�߼�����ʦ");
		empone.setSaraly(900);
		empone.printEmployee();
		
		emptwo.setAge(2);
		emptwo.setDesignation("���񹤳�ʦ");
		emptwo.setSaraly(900);
		emptwo.printEmployee();
		
	}
}