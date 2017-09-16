import java.io.IOException;

public enum MathOperation  {
    MINUS ("-") , PLUS ("+"), DIVISION("/"), MULTIPLYING("*");

    String znak;

    MathOperation(String znak) {
        this.znak=znak;
    }

}

