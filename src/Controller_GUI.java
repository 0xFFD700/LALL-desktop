import javax.swing.*;

/**
 * Created by jenny on 12.06.17.
 * LALL-desktop
 * https://github.com/0xFFD700
 */
public class Controller_GUI extends JFrame {
    private JPanel mainPanel;
    private JSlider brightnessSlider, rSlider, gSlider, bSlider;
    private JLabel brightnessLabel, rLabel, gLabel, bLabel;

    Controller_GUI() {
        brightnessSlider.addChangeListener(new Custom_SLIDER());
        brightnessSlider.setName("H");
        rSlider.addChangeListener(new Custom_SLIDER());
        rSlider.setName("R");
        gSlider.addChangeListener(new Custom_SLIDER());
        gSlider.setName("G");
        bSlider.addChangeListener(new Custom_SLIDER());
        bSlider.setName("B");
    }

    JPanel getMainPanel() {
        return mainPanel;
    }

    //Slider values
    int getrSliderV() {
        return rSlider.getValue();
    }

    int getgSliderV() {
        return gSlider.getValue();
    }

    int getbSliderV() {
        return bSlider.getValue();
    }

    //Slider objects
    JSlider getBrightnessSlider() {
        return brightnessSlider;
    }

    JSlider getrSlider() {
        return rSlider;
    }

    JSlider getgSlider() {
        return gSlider;
    }

    JSlider getbSlider() {
        return bSlider;
    }
}
