import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the first simbol");
        double a = Double.parseDouble(reader.readLine());

        System.out.println("Please enter the mathematical operation");
        System.out.println("If you want to find the greatest common divisor please enter % ");

        String simbol = reader.readLine();

        System.out.println("Please enter the second simbol");
        double b = Double.parseDouble(reader.readLine());


        MyOpFactory result = new MyOpFactory();
        Operation operation = result.getOpInstance(simbol);
        double c = operation.exec(a,b);

        System.out.println("Result = " + c);


    }
}
