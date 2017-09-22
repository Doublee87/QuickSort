
/*
	<Ameen Almiftah>		<5/4/2011>
	<class name: UserInterface
	 description: this class provides a keyboard based user interface>
*/


import java.util.Scanner;

public class UserInterface {
	private Scanner usi = new Scanner(System.in);
	

	
	
	/*
	<method name: validInt
	 description: validates entered number if its between loVal and hiVal  by calling getString>
	<preconditions: none>
	<postconditions: none>
*/
	public int validInt (String prompt,int loVal, int hiVal) {
		int enteredValue = 0;
		do{
			String str = getString(prompt);
			enteredValue = Integer.parseInt(str);
			if (enteredValue <= loVal || enteredValue >= hiVal){
				System.out.println("Enter A Value Between" + loVal+ " and "+ hiVal);
			}
		}while (enteredValue <= loVal || enteredValue >= hiVal);
		
		return enteredValue;
	}

	public String getString(String prompt) {
			System.out.print(prompt);
			return usi.nextLine();
	}
	
}
