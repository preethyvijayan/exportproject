package aggregation;

public class Company {

	public static void main(String[] args) {
		Employee obj=new Employee();//creating an object of another class employee in this class company, and then using employee object 
									//we access the functions of class employee
		obj.printEmpname();
		obj.printEmpid();

	}
}

/* Aggregation has no parent child relation, 
 but here accessing the function or method of another class by creating the object of another class
 In inheritance classes have parent - child relation */
 