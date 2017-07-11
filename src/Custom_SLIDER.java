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
        con.getMainPanel().setBackground(new Color(con.getrSlider(), con.getgSlider(), con.getbSlider()));

        //get value and create isostream
        JSlider source = (JSlider) changeEvent.getSource();
        if (!source.getValueIsAdjusting())
            //Controll_GUI.getAllValues();
            try {
                //new BlueCove_SP().go(mode, getValue());
            } catch (Exception ex) {
                Logger.getLogger(BlueCove_SP.class.getName()).log(Level.SEVERE, null, ex);
            }

        {
            switch (source.getName()) {
                case "R":
                    break;
                case "G":
                    break;
                case "B":
                    break;
                case "H":
                    break;
            }
        }
    }
}
