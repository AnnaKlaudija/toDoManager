import java.util.HashMap;
import java.util.Scanner;

public class AppLauncher {

	public static void main(String[] args) {
		System.out.println("Enter text in a specific form : action(add, remove, edit) date(DD/MM/YYYY) :text");

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		if (userInput != "exit") {

			String[] action = userInput.split(" ");
			System.out.println(action[0]);

			//System.out.println(action.length);


		} else {
			System.out.println("done");
			//break;
		}




		//System.out.println(userInput.length());



		String[] date = userInput.split(" ");
		System.out.println(date[1]);
		//System.out.println(date.length);


		String[] arrOfStr = userInput.split(":");

		for (String a : arrOfStr)
			System.out.println(a);

		String taskText = userInput.substring(3);
		// System.out.println(taskText);

		HashMap<String [], String> taskList = new HashMap<>();
		taskList.put(date, taskText);




		System.out.println("Task List: " + taskList);
	}
}




}
