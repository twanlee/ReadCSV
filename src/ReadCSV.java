import java.io.*;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        try {
            String path = "D:\\Code Gym\\Git\\Module 2\\Java\\ReadCSV\\ABC.csv";
            String line = "";
            String split = ",";
            File file = new File(path);
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while ((line = bf.readLine()) != null){
                String[] country = line.split(split);
                System.out.println("Country = [code = " + country[0]+" , name : "+ country[5]+"]");
            }
            bf.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
