import java.util.Scanner;

public class AppLauncher {

	public static void main(String[] args) {
		System.out.println("Enter text in a specific form : action(add, remove, edit) date(DD/MM/YYYY) text");

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		//System.out.println(userInput.length());

		String[] action = userInput.split(" ");
		System.out.println(action[0]); //Tiek atdalīts pirmais vārds no String

		//System.out.println(action.length);

		String[] date = userInput.split(" ");
		System.out.println(date[1]); // //Tiek atdalīts otrais vārds no String
		//System.out.println(date.length);

		int textBefore = ((date.length + action.length)); // Text daļu gribēju atdalīt ar substring f-ju, taču tā atdala zinot konkrēto kārtas Nr.simbolam no kā atdalīt
//Tā kā šis kārtas 'nr. ne vienmŗ būs tāds pats, tad nepieciešams saskaitīt action + date simbolu skaitu un šeit sākas problēma - nesaprotu kāpēc bet lietojot .length rāda rezultātā cik vārdi ir ievadīti nevis cik simboli??!!

		System.out.println(textBefore);

		String taskText = userInput.substring(textBefore);
		System.out.println(taskText);

	}

}
