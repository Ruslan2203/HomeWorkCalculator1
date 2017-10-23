package operationFactory;

import operation.*;
import operationFactory.OperationFactory;

public class MyOpFactory implements OperationFactory {

    @Override
    public Operation getOpInstance(MathOperation op) throws IllegalArgumentException {

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
            } else if (op.equals(MathOperation.GCD)) {
                OpNok operation = new OpNok();
                return operation;
            }
            else  throw new IllegalArgumentException();

    }}
