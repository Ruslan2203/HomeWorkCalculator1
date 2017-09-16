import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simbol {

    public String simbol() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String simb = null;
        try {
            simb = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return simb;
    }
}
