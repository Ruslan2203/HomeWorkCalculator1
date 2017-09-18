public class MyOpFactory implements OperationFactory {

    @Override
    public Operation getOpInstance(String op) {

        if (op.equals(MathOperation.MINUS.getZnak())) {
            OpMinus operation = new OpMinus();
            return operation;
        } else if (op.equals(MathOperation.PLUS.getZnak())) {
            OpPlus operation = new OpPlus();
            return operation;
        } else if (op.equals(MathOperation.DIVISION.getZnak())) {
            OpDiv operation = new OpDiv();
            return operation;
        } else if (op.equals(MathOperation.MULTIPLYING.getZnak())) {
            OpMul operation = new OpMul();
            return operation;
        } else if (op.equals(MathOperation.GCD.getZnak())){
            GreatestDivisor operation = new GreatestDivisor();
            return operation;
        }

        else return null;


    }
}
