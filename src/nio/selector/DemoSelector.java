package nio.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class DemoSelector {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        Set<SelectionKey> selectedKeys = selector.selectedKeys ();
        SocketChannel channel = SocketChannel.open();
        SocketAddress socketAddr = new InetSocketAddress("localhost", 9000);
        channel.connect(socketAddr);
        channel.configureBlocking(false);
        Iterator<SelectionKey> keyIterator = selectedKeys.iterator ();
        while (keyIterator.hasNext ()) {
            SelectionKey key = keyIterator.next ();
            if (key.isAcceptable ()) {
                // соединение было принято ServerSocketChannel.
                System.out.println("соединение было принято ServerSocketChannel.");

            } else if (key.isConnectable ()) {
                // было установлено соединение с удаленным сервером.
                System.out.println("было установлено соединение с удаленным сервером.");

            } else if (key.isReadable ()) {
                // канал готов к чтению
                System.out.println("канал готов к чтению");

            } else if (key.isWritable ()) {
                // канал готов к записи
                System.out.println("канал готов к записи");

            }

            keyIterator.remove ();
        }

    }
}
