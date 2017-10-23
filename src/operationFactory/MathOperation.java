package operationFactory;

import java.io.IOException;

public enum MathOperation  {
    MINUS ('-') , PLUS ('+'), DIVISION('/'), MULTIPLYING('*'), GCD('%');

    char znak;

    MathOperation(char znak) {
        this.znak=znak;
    }


}


