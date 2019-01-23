package stream.io;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class JavaDownloadFileFromURL {

    public static void main(String[] args) {
        String url = "https://scontent.fevn1-1.fna.fbcdn.net/v/t1.0-9/49199941_794083930945626_327804127507644416_n.jpg?_nc_cat=108&_nc_ht=scontent.fevn1-1.fna&oh=ff0f05acc9bdaf58fc1894b49450a6ed&oe=5CBF50A1";

        try {
            downloadUsingNIO(url, "C:\\Users\\muraz\\Desktop\\image.jpg");

            downloadUsingStream(url, "C:\\Users\\muraz\\Desktop\\image_stream.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}