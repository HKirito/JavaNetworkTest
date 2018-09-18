import java.io.*;

public class T02 {
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("Source/test.txt");
        FileWriter fw = new FileWriter("Source/test1.txt");

        BufferedReader bufr = new BufferedReader(fr);
        BufferedWriter bufw = new BufferedWriter(fw);
        String line = null;

        while((line = bufr.readLine()) != null){
            bufw.write(line.replace("TMD","***"));
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();

    }
}
