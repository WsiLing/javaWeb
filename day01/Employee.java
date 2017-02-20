class Employee {
	String name;
	int age;
	String designation;
	double saraly;
	// Employee 类的构造器
	public Employee(String name){
		this.name = name;
	}
//	设置age的值
	public void setAge(int age){
		this.age = age;
	}
//	设置designation 的值
	public void setDesignation(String designation){
		this.designation = designation;
	}
//	设置saraly的值
	public void setSaraly(double saraly){
		this.saraly = saraly;
	}
//	打印信息
	public void printEmployee(){
		System.out.println("name:"+name);
		System.out.print("age:"+age);
		System.out.print(",designation:" + designation);
		System.out.print(",saraly:"+saraly);
	}
}
class EmployeeTest {
	public static void main(String args[]){
		/*使用构造器创建两个对象*/
		Employee empone = new Employee("Runboo1");
		Employee emptwo = new Employee("Runboo2");
		empone.setAge(2);
		empone.setDesignation("高级工程师");
		empone.setSaraly(900);
		empone.printEmployee();
		
		emptwo.setAge(2);
		emptwo.setDesignation("菜鸟工程师");
		emptwo.setSaraly(900);
		emptwo.printEmployee();
		
	}
}