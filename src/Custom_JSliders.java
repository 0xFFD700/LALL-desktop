import javax.swing.*;
import java.util.Hashtable;

/**
 * Created by jennyhofbauer on 25.05.17.
 */
class Custom_JSliders extends JSlider {

    Custom_JSliders(int max, int min, String sliderName) {
        Hashtable<Integer, JLabel> labels = new Hashtable<>();
        labels.put(0, new JLabel("0"));
        labels.put(100, new JLabel(String.valueOf(max)));

        new JSlider(min, max);
        setPaintLabels(true);
        setLabelTable(labels);
        setOpaque(true);
        setBorder(BorderFactory.createTitledBorder(sliderName));
        setName(sliderName);
        addChangeListener(e -> Controll_GUI.getAllValues());
    }

}
