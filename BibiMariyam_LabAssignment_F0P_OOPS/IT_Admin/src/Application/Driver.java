

package Application;

import CredServices.Employee; // Import Credential details from cred services package
 
// Driver code to run the Application

public class Driver {

	//Main Method
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em1=new Employee("Mariyam","Sardar"); //Generate an email of particular employee.
		
		System.out.println(em1.showinfo()); // display the Credential
		
	}
}
