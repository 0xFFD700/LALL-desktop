import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jennyhofbauer on 25.05.17.
 */
class Custom_SLIDER implements ChangeListener {


    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        //changing background color
        Controller_GUI con = Controller.getCl();
        Color backColor = new Color(con.getrSliderV(), con.getgSliderV(), con.getbSliderV());
        con.getMainPanel().setBackground(backColor);
        con.getBrightnessSlider().setBackground(backColor);
        con.getrSlider().setBackground(backColor);
        con.getgSlider().setBackground(backColor);
        con.getbSlider().setBackground(backColor);

        //get value and create isostream
        JSlider source = (JSlider) changeEvent.getSource();
        if (!source.getValueIsAdjusting())
            try {
                switch (source.getName()) {
                    case "R":
                        Controller.getBlue().go(1, source.getValue());
                        break;
                    case "G":
                        Controller.getBlue().go(2, source.getValue());
                        break;
                    case "B":
                        Controller.getBlue().go(3, source.getValue());
                        break;
                    case "H":
                        Controller.getBlue().go(4, source.getValue());
                        break;
                }
                //
            } catch (Exception ex) {
                Logger.getLogger(BlueCove_SP.class.getName()).log(Level.SEVERE, null, ex);
            }

        {

        }
    }
}
