import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("textexample.txt"));

            list.add(reader.readLine());

            while (reader.readLine()!=null){
                list.add(reader.readLine());
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("textexample.txt");

            for (int i = 0;i<list.size();i++){
                String text;

                char [] charsList = list.get(i).toCharArray();
                String znak = String.valueOf(charsList[1]);

                double a = (double)charsList[0];
                double b = (double)charsList[2];

                MyOpFactory result = new MyOpFactory();
                Operation operation = result.getOpInstance(znak);

                double c = operation.exec(a,b);

                text = a+" "+znak+" "+b+"="+c;
                writer.append(text);

            }


        }
        catch (IOException e) {
            System.out.println(e);
        }


    }
}
