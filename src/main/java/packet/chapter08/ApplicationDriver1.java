package packet.chapter08;

import javax.swing.SwingUtilities;

public class ApplicationDriver1 {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow1 window = new ApplicationWindow1();
                window.setVisible(true);
            }
        });

    }
}
