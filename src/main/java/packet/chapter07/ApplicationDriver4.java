package packet.chapter07;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ApplicationDriver4 {

    public static void main(String[] args) {               
        JFrame.setDefaultLookAndFeelDecorated(true);

        GraphicsEnvironment graphicsEnvironment = 
            GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();

        if (!graphicsDevice.isWindowTranslucencySupported(
                GraphicsDevice.WindowTranslucency.TRANSLUCENT)) {
            System.err.println(
                "Translucency is not supported on this platform");
                System.exit(0);
        }   
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow4 window = new ApplicationWindow4();
                window.setOpacity(0.75f);
                window.setVisible(true);
            }
        });

    }
}
