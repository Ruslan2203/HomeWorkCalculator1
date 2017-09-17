

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the first simbol");
        Simbol first = new Simbol();
        double a = Double.parseDouble(first.simbol());

        System.out.println("Please enter the mathematical operation");
        Simbol sing = new Simbol();
        String simbol = sing.simbol();

        System.out.println("Please enter the second simbol");
        Simbol second = new Simbol();
        double b = Double.parseDouble(second.simbol());


        MyOpFactory result = new MyOpFactory();
        Operation operation = result.getOpInstance(simbol);
        double c = operation.exec(a,b);

        System.out.println("Result = " + c);


    }
}
