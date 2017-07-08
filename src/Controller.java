import javax.swing.*;

/**
 * Created by xfdd700 on 08.07.17.
 */
public class Controller {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new Controller_GUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
