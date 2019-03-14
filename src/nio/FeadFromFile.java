package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FeadFromFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile ("data / nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel ();

// создаем буфер емкостью 48 байт
        ByteBuffer buf = ByteBuffer.allocate (48); int bytesRead = inChannel.read (buf); // читать в буфер.
        while (bytesRead>0) {
            buf.flip ();   // сделать буфер готовым для чтения
            while (buf.hasRemaining ()) {
                System.out.print ((char) buf.get () ); // читаем 1 байт за раз
            } buf.clear (); // сделать буфер готовым для записи
            bytesRead = inChannel.read (buf);
        }
        aFile.close ();
    }
}
