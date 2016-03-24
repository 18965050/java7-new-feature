package packet.chapter07;

import java.awt.GraphicsDevice;
import java.awt.GraphicsDevice.WindowTranslucency;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ApplicationDriver2 {

    public static void main(String[] args) {               
      GraphicsEnvironment envmt = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice device = envmt.getDefaultScreenDevice();
        
        if (!device.isWindowTranslucencySupported(WindowTranslucency.PERPIXEL_TRANSLUCENT)) {
         System.out.println("Translucent windows are not supported on your system.");
         System.exit(0);
        }
       JFrame.setDefaultLookAndFeelDecorated(true);
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow2 window = new ApplicationWindow2();
                window.setVisible(true);
            }
        });

    }
}
