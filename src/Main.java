import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import operation.IllegalOperationExceprion;
import operation.Operation;
import operationFactory.MathOperation;
import operationFactory.MyOpFactory;
import singletonDataBase.StatisticsKeeper;

public class Main {
	public static void main(String[] args) throws IOException {

		ArrayList<String> listOfTasks = new ArrayList<>();

		try {

			BufferedReader reader = new BufferedReader(new FileReader("src/textexample.txt"));
			String exercise = reader.readLine();

			while (exercise != null) {
				listOfTasks.add(exercise);
				exercise = reader.readLine();
			}

			reader.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			StatisticsKeeper.getInstance().writer("Nok");
		}
		catch (IOException e) {
			e.printStackTrace();
			StatisticsKeeper.getInstance().writer("Nok");
		}

		try {
			File file = new File("newFile");
			FileWriter writer = new FileWriter(file);

			if (!file.exists()) {
				file.createNewFile();
			}

			for (int i = 0; i < listOfTasks.size(); i++) {
				String text;
				String exerciseLine = listOfTasks.get(i);

				String arithmeticExercise = listOfTasks.get(i);
				try {
					int arithmeticOpSymbolIndex = findArithmeticOpSymbol(arithmeticExercise);
					double firstNumber = Double.parseDouble(arithmeticExercise.substring(0, arithmeticOpSymbolIndex));
					double secondNumber = Double.parseDouble(arithmeticExercise.substring(arithmeticOpSymbolIndex + 1));
					MathOperation mathOperation =
							MathOperation.parseMathOperation(String.valueOf(arithmeticExercise.charAt(arithmeticOpSymbolIndex)));
					MyOpFactory result = new MyOpFactory();
					Operation operation = result.getOpInstance(mathOperation);
					double c = operation.exec(firstNumber, secondNumber);
					text = "\n" + firstNumber + mathOperation.getZnak() + secondNumber + "=" + c;
					writer.append(text);
				}
				catch (IllegalOperationExceprion ex) {
					System.out.println(ex);
					StatisticsKeeper.getInstance().writer("Nok");
				}
			}

			StatisticsKeeper.getInstance().writer("ok");
			writer.close();

		}
		catch (IOException e) {
			System.out.println(e);
			StatisticsKeeper.getInstance().writer("Nok");
		}

	}

	private static int findArithmeticOpSymbol(String allExampleLine) throws IllegalOperationExceprion {
		if (allExampleLine.indexOf("+") != -1) {
			return allExampleLine.indexOf("+");
		} else if (allExampleLine.indexOf("-") != -1) {
			return allExampleLine.indexOf("-");
		} else if (allExampleLine.indexOf("/") != -1) {
			return allExampleLine.indexOf("/");
		} else if (allExampleLine.indexOf("*") != -1) {
			return allExampleLine.indexOf("*");
		} else if (allExampleLine.indexOf("%") != -1) {
			return allExampleLine.indexOf("%");
		}
		throw new IllegalOperationExceprion("Operation not found in the line" + allExampleLine);
	}
}