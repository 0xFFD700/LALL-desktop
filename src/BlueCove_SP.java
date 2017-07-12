import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;

/**
 * Created by xfdd700 on 27.05.17.
 */
class BlueCove_SP {

    void go(char slider, int value) throws Exception {
        System.out.println("Slider " + slider + " value " + value);
        StreamConnection streamConnection = (StreamConnection)
                Connector.open("btspp://98D331709E69:1;authenticate=false;encrypt=false;master=false");
        OutputStream os = streamConnection.openOutputStream();
        InputStream is = streamConnection.openInputStream();
        os.write(slider);
        if (is.read() == '1') {
            os.write(value);
            os.close();
            System.out.println("in");
        }
        is.close();
        streamConnection.close();
    }
}
