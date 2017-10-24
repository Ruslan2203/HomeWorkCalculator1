package operationFactory;

import operation.IllegalOperationExceprion;

public enum MathOperation {
	MINUS('-'), PLUS('+'), DIVISION('/'), MULTIPLYING('*'), GCD('%');

	char znak;

	MathOperation(char znak) {
		this.znak = znak;
	}

	public char getZnak() {
		return znak;
	}

	public static MathOperation parseMathOperation(String symbol) throws IllegalOperationExceprion {
		switch (symbol) {
			case "+":
				return MathOperation.PLUS;
			case "-":
				return MathOperation.MINUS;
			case "/":
				return MathOperation.DIVISION;
			case "*":
				return MathOperation.MULTIPLYING;
			case "%":
				return MathOperation.GCD;
		}
		throw new IllegalOperationExceprion("Operation " + symbol + " not found");
	}
}


