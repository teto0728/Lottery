/*
* TxtField.java
*/
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TxtField extends JFrame {

    public static void frame(int[] mainnum, int[] subnum, int[] buy, int sum) {

    	TxtField frame = new TxtField();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel( new BorderLayout(3, 1) );
        JLabel label = new JLabel();
        TextField textfield = new TextField(40);
        textfield.setText("テキストフィールドに表示したテキスト");

        JButton button = new JButton("クリック!");
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 String s = textfield.getText();
                 label.setText(s);;
            }
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(textfield, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(panel);
        frame.setTitle("TxtField");
        frame.pack();
        frame.setVisible(true);
    }
}
