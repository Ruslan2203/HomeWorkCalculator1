import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src/textexample.txt"));
            String text =reader.readLine();

            while (text!=null){
                list.add(text);
                text = reader.readLine();
            }

         reader.close();
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            File file = new File("newFile");
            FileWriter writer = new FileWriter(file);

            if (!file.exists()){
                file.createNewFile();
            }

            for (int i = 0;i<list.size();i++){
                String text;

                char [] charsList = list.get(i).toCharArray();
                String znak = String.valueOf(charsList[1]);

                double a = (double) Character.getNumericValue(charsList[0]);
                double b = (double) Character.getNumericValue(charsList[2]);

                MyOpFactory result = new MyOpFactory();
                Operation operation = result.getOpInstance(znak);

                double c = operation.exec(a,b);

                text = "\n"+a+znak+b+"="+c;

                writer.append(text);

            }
            System.out.println();
        writer.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }


    }
}
