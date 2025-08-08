/* This class represents a small personal
 * profile presenting all the necessary
 * information about a specific person.
 * In this example we take 5 different 
 * pieces of information, so every variable
 * has a different type. The result is printed
 * out in a single output line. */


public class PersonalData {

	public static void main(String[] args) {
		// Creating a fullName variable
		String fullName = "Ron Weasley";
		// Creating an age variable
		int age = 34;
		// Creating a gender variable. M stands for male
		char gender = 'M';
		// Creating an annualSalary variable
		double annualSalary = 50000.00;
		// Creating an isMarried variable
		boolean isMarried = true;
		
		/* I decided to write this if-else statement
		 * because I want to add a different piece
		 * of information in my desired output. Neither
		 * true or false would not look good. */
		String marriageStatus;
		if(isMarried) {
			/* Variable manipulation. I didn't want
			 * to use String variables for outputs only */
			marriageStatus = fullName + " is happily married";
			
		} else {
			marriageStatus = fullName + " is single.";
		}
		
		// Final output including variable manipulation again
		System.out.println("His name is " + fullName + "." + " He is " + age + " years old."
		+ " The gender of " + fullName + " is " + gender + "." + " He earns " + annualSalary
		+ " per year. " + marriageStatus);
		
	}

}
