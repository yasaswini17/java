package programs;

public class Program15 {
	private String firstName;
	 private String lastName;
	 private double salary;
	 
	 public void Employee(String fName, String lName, double sal) {
	 if (fName != null) firstName =fName; 
	 if (lName != null) lastName = lName; 
	 if (sal > 0.0) {
	 salary=sal; 
	 }
	 else {
	 salary=0.0;
	 }
	 }
	 //set methods 
	 public String getFirstName(){
	 return firstName;
	 }
	 public String getLastName(){
	 return lastName;
	 }
	 public double getSalary(){
	 return salary;
	 }
	 public void setFirstName(String fName){
		 if (fName != null) 
		 firstName = fName; 
		 }
		 
		 public void setLastName(String lName){
		 if (lName != null)
		 lastName = lName; 
		 }
		 
		 public void setSalary(double sal){
		 if (sal > 0.0){
		 salary = sal;
		 }
		 else {
		 salary = 0.0;
		 }
		 }
		}


