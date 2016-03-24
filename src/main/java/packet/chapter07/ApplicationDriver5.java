package packet.chapter07;

import java.awt.GraphicsDevice;
import java.awt.GraphicsDevice.WindowTranslucency;
import java.awt.GraphicsEnvironment;
import javax.swing.SwingUtilities;

public class ApplicationDriver5 {

    public static void main(String[] args) {               
        GraphicsEnvironment envmt = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = envmt.getDefaultScreenDevice();
        
        if (!device.isWindowTranslucencySupported(
                WindowTranslucency.PERPIXEL_TRANSLUCENT)) {
            System.out.println("Shaped windows are not supported on"
                    + "your system.");
            System.exit(0);
        }
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow5 window = new ApplicationWindow5();
                window.setVisible(true);
            }
        });

    }
}
