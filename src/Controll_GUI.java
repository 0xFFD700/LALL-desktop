import javax.swing.*;
import java.awt.*;

/**
 * Created by jennyhofbauer on 25.05.17.
 */
public class Controll_GUI extends JFrame {
    static private Custom_JSliders redSlider, greenSlider, blueSlider, brightnessSLider;

    private Controll_GUI() {
        setTitle("LALL");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400, 250));
        setLayout(new GridLayout(4, 1));

        redSlider = new Custom_JSliders(255, 0, "Red");
        add(redSlider);

        greenSlider = new Custom_JSliders(255, 0, "Green");
        add(greenSlider);

        blueSlider = new Custom_JSliders(255, 0, "Blue");
        add(blueSlider);

        brightnessSLider = new Custom_JSliders(100, 1, "Brightness");
        add(brightnessSLider);

    }


    static void getAllValues() {
        int r = redSlider.getValue();
        int g = greenSlider.getValue();
        int b = blueSlider.getValue();
        int brigth = brightnessSLider.getValue();
        redSlider.setBackground(new Color(r, g, b));
        greenSlider.setBackground(new Color(r, g, b));
        blueSlider.setBackground(new Color(r, g, b));
        brightnessSLider.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new Controll_GUI().pack();
        new Portchooser_GUI().pack();

    }
}
