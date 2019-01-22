package stream.io;

import java.io.*;

public class ReadLineFromFIle {

    public static void main(String[] args) throws IOException {
        readLineFromFile("C:\\Users\\muraz\\Desktop\\myfile1.txt");
    }


//ֆայլի ընթերցումը ըստ տողերի
    public static void readLineFromFile(String path) throws IOException {
        File file = new File(path);
        InputStreamReader inputStreamReader = null;
        BufferedReader br =null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file));
             br = new BufferedReader(inputStreamReader);
            String thisLine ="";
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            inputStreamReader.close();
            br.close();
        }
    }

}
