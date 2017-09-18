import java.io.IOException;

public enum MathOperation  {
    MINUS ("-") , PLUS ("+"), DIVISION("/"), MULTIPLYING("*"), GCD("%");

    String znak;

    MathOperation(String znak) {
        this.znak=znak;
    }

    public String getZnak() {
        return znak;
    }

}


