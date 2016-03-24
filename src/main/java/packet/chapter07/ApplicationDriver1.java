package packet.chapter07;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ApplicationDriver1 {

    public static void main(String[] args) {               
//        JFrame.setDefaultLookAndFeelDecorated(true);
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow1 window = new ApplicationWindow1();
                window.setVisible(true);
            }
        });

    }
}
