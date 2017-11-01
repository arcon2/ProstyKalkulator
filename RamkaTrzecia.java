package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamkaTrzecia extends JFrame implements ActionListener {
    TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();

    //JLabel label = tekstRamkaPierwsza.getLabel();


    public JPanel ramkaTrzecia() {
        JPanel ramkaTrzecia = new JPanel();
        ramkaTrzecia.setLayout(new FlowLayout(FlowLayout.CENTER));
        ramkaTrzecia.setSize(100, 600);
        ramkaTrzecia.setBackground(Color.ORANGE);

        //ramkaTrzecia.add(label);


        return ramkaTrzecia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
