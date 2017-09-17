public class MyOpFactory implements OperationFactory {

    @Override
    public Operation getOpInstance(String op) {

        if (op.equals(MathOperation.MINUS)) {
            OpMinus operation = new OpMinus();
            return operation;
        } else if (op.equals(MathOperation.PLUS)) {
            OpPlus operation = new OpPlus();
            return operation;
        } else if (op.equals(MathOperation.DIVISION)) {
            OpDiv operation = new OpDiv();
            return operation;
        } else if (op.equals(MathOperation.MULTIPLYING)) {
            OpMul operation = new OpMul();
            return operation;
        }
        else return null;


    }
}
