package java_AWT.example2;

import java.awt.*;

class First2 {
    First2() {
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setName("myapp");
        f.setVisible(true);
    }

    public static void main(String args[]) {
        First2 f = new First2();
    }
}