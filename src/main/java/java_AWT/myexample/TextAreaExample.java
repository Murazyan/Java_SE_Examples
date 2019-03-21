package java_AWT.myexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends Frame {
    Label label_1 = new Label("Worlds: ");
    Label label_2 = new Label("Characters: ");
    TextArea textArea = new TextArea();
    Button button = new Button("Click");

    public TextAreaExample() {
        label_1.setBounds(50, 50, 100, 30);
        label_2.setBounds(160, 50, 100, 30);
        textArea.setBounds(20,100,300,300);
        button.setBackground(Color.GREEN);
        button.setBounds(100,410,100,30);
        add(label_1);
        add(label_2);
        add(textArea);
        add(button);
        setSize(400, 500);
        setBackground(Color.cyan);
        setLayout(null);
        setVisible(true);
        button.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = textArea.getText();
            String words[] = text.split("\\s");
            label_1.setText("Words: " + words.length);
            label_2.setText("Characters: " + text.length());
        }
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
}

