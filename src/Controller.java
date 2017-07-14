import javax.swing.*;
import java.io.IOException;

/**
 * Created by xfdd700 on 08.07.17.
 */
public class Controller {
    static Controller_GUI cl = new Controller_GUI();
    static BlueCove_SP blue = new BlueCove_SP();

    static Controller_GUI getCl() {
        return cl;
    }

    static BlueCove_SP getBlue() {
        return blue;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LALL");
        frame.setContentPane(cl.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
