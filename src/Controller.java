import javax.swing.*;

/**
 * Created by xfdd700 on 08.07.17.
 * LALL-desktop
 * https://github.com/0xFFD700
 */
public class Controller {
    private static Controller_GUI cl = new Controller_GUI();
    private static BlueCove_SP blue = new BlueCove_SP();

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
