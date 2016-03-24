package packet.chapter07;

import javax.swing.SwingUtilities;

public class ApplicationDriver7 {

    public static void main(String[] args) {               
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationWindow7 window = new ApplicationWindow7();
                window.setVisible(true);
            }
        });

    }
}

