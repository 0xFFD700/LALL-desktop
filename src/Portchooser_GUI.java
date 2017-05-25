import com.fazecast.jSerialComm.SerialPort;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jennyhofbauer on 25.05.17.
 */
class Portchooser_GUI extends JFrame {

    Portchooser_GUI() {
        setTitle("SerialPort");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200, 100));
        setLayout(new GridLayout(2, 1));


        // Array für unsere JComboBox
        SerialPort[] allPortsArray = SerialPort.getCommPorts();
        ArrayList<String> serialPortNames = new ArrayList<>();
        for (SerialPort j : allPortsArray) {
            serialPortNames.add(j.getDescriptivePortName());
        }

        //JComboBox mit Bundesländer-Einträgen wird erstellt
        JComboBox<Object> serialPortCB = new JComboBox<>(serialPortNames.toArray());
        add(serialPortCB);
        JButton submitSerialPort = new JButton("Connect");
        add(submitSerialPort);
    }
}
