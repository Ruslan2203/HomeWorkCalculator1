package operationFactory;

import operation.Operation;

public interface OperationFactory
    {
        Operation getOpInstance(MathOperation op );
    }


