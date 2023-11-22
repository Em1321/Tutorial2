import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.KeyStore;

public class Main {
    public static void main(String[] args){
        Frame f = new Frame();
        Drawings d = new Drawings();

        f.add(d);
        d.setSize(500, 500);
        d.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){// Ends program if close window is clicked
             public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });


    }
}
