import javax.swing.*;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jennyhofbauer on 25.05.17.
 */
class Custom_SLIDER extends JSlider {

    Custom_SLIDER(int max, int min, String sliderName, byte mode) {
        Hashtable<Integer, JLabel> labels = new Hashtable<>();
        labels.put(0, new JLabel("0"));
        labels.put(100, new JLabel(String.valueOf(max)));

        new JSlider(min, max);
        setOrientation(VERTICAL);
        setPaintLabels(true);
        setLabelTable(labels);
        setOpaque(true);
        setBorder(BorderFactory.createTitledBorder(sliderName));
        addChangeListener(changeEvent -> {
            //Controll_GUI.getAllValues();
            try {
                new BlueCove_SP().go(mode, getValue());
            } catch (Exception ex) {
                Logger.getLogger(BlueCove_SP.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

}
