package array_object;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();

		emp1.id = 204;emp1.name = "Lipi";emp1.salary = 70000;
		emp2.id = 207;emp2.name = "Kalu";emp2.salary = 50000;
		emp3.id = 201;emp3.name = "Papu";emp3.salary = 40000;
		emp4.id = 208;emp4.name = "Anil";emp4.salary = 20000;
		
		Employee [] arr = new Employee[4];
		arr[0]=emp1;
		arr[1]=emp2;
		arr[2]=emp3;
		arr[3]=emp4;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i].id +" "+ arr[i].name +" "+ arr[i].salary);
		}
	}
}