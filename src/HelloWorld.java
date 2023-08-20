import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton clickMeButton;

    public HelloWorld() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickMeButton, txtName.getText() + " Hello");
            }
        });
    }

    public static void main (String[] args) {

        HelloWorld h = new HelloWorld();
        h.setContentPane(h.panelMain);
        h.setTitle("Hi Penner");
        h.setSize(300,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
