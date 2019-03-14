package nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo {
    public static void main(String[] args) throws IOException {

        String myString = "Hello world";
        byte[] bytes = myString.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1048);
        byteBuffer.put(bytes);
        byteBuffer.flip();
//        String result="";
//        for (int i = 0; i < byteBuffer.limit(); i++) {
//            byte b = byteBuffer.get(i);
//            result+=(char)b;
//        }
//        System.out.println(result);
//        while (byteBuffer.hasRemaining()){
//            result +=byteBuffer.get();
//        }

        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\muraz\\Desktop\\mydocument.txt","rw");

        FileChannel channel = randomAccessFile.getChannel();
        channel.write(byteBuffer);
        channel.close();


//        byteBuffer.clear();
//        }

//        ByteBuffer newbyteBuffer = ByteBuffer.allocate(1048);
//        channel.read(newbyteBuffer);
//                String result="";
//        for (int i = 0; i < newbyteBuffer.limit(); i++) {
//            byte b = newbyteBuffer.get(i);
//            result+=(char)b;
//        }
//        System.out.println(result);


    }
}
