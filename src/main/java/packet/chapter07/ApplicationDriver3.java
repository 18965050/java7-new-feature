package packet.chapter07;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ApplicationDriver3 {

    public static void main(String[] args) {               
//        JFrame.setDefaultLookAndFeelDecorated(true);
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow3 window = new ApplicationWindow3();
                window.setVisible(true);
            }
        });

    }
}
