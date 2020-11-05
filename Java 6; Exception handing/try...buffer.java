import java.io.*;

public class Codeforces{
    public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
            while ( (line = br.readLine()) != null ){
                System.out.println("Line: "+ line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
