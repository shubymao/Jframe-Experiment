package JframeExperiment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstApp {
    private JButton closeButton;
    private JPanel panelMain;

    public FirstApp() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setContentPane(new FirstApp().panelMain);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
