import java.io.*;

public class Io {
    public static void main(String args[]) throws IOException {
        File f1 = new File("Source/test");
        InputStream i1 = new FileInputStream(f1);

        File f2 = new File("Source/test.txt");
        OutputStream o1 = new FileOutputStream(f2);
        byte[] bs = new byte[1024];
        int len = 0;
        while ( (len = i1.read(bs)) != -1) {
            if (len != 1024) {
                byte[] b = new byte[len];
                System.arraycopy(bs, 0, b, 0, len);
                o1.write(b);
                continue;
            }
            o1.write(bs);
        }
        i1.close();
        o1.close();
    }
}
