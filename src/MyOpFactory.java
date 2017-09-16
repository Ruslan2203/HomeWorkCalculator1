public class MyOpFactory implements OperationFactory {

    @Override
    public Operation getOpInstance(String op) {
        Operation operation=null;
        if (op.equals(MathOperation.MINUS))  operation = new OpMinus();
        else if (op.equals(MathOperation.PLUS)) operation = new OpPlus();
        else if (op.equals(MathOperation.DIVISION)) operation = new OpDiv();
        else if (op.equals(MathOperation.MULTIPLYING)) operation = new OpMul();

        return operation;

    }
}
