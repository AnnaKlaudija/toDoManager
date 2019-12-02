import java.util.HashMap;
import java.util.Scanner;

import action.TaskStorage;

public class AppLauncher {

	public static void main(String[] args) {
		System.out.println("Enter text in a specific form : action(add, remove, edit) date(DD/MM/YYYY) :text");

		TaskStorage taskStorage = new TaskStorage();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		//while (userInput != "exit") {

		String[] action = userInput.split(" ");
		System.out.println(action[0]);

		//System.out.println(action.length);


		String[] date = userInput.split(" ");
		System.out.println(date[1]);
		//System.out.println(date.length);

		int textBefore = (action[0].length() + date[1].length()+1);


		String taskText = userInput.substring(textBefore);

		System.out.println(taskText.trim());

		if(action[0].equals("add") ) {
			taskStorage.addTask(date[1], taskText);
		}

	}
}




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
