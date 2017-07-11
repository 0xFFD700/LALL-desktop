import javax.swing.*;

/**
 * Created by xfdd700 on 08.07.17.
 */
public class Controller {
    static Controller_GUI cl = new Controller_GUI();

    public static Controller_GUI getCl() {
        return cl;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LALL");
        frame.setContentPane(cl.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
