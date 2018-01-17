package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamkaPierwsza extends JFrame implements ActionListener {


    RamkaDruga ramkaDruga = new RamkaDruga();
    RamkaTrzecia ramkaTrzecia = new RamkaTrzecia();



    public JPanel ramkaPierwsza() {

        JPanel ramkaPierwsza = new JPanel();
        GridLayout loyautPierwszy = new GridLayout(5, 4, 10, 10);
        ramkaPierwsza.setLayout(loyautPierwszy);

        ramkaPierwsza.setSize(800, 600);
        ramkaPierwsza.setBackground(Color.green);
        ramkaPierwsza.setBounds(0, 0, 0, 0);
        //ramkaPierwsza.add(ramkaTrzecia.ramkaTrzecia());
        ramkaPierwsza.add(ramkaDruga.ramkaDruga());

        return ramkaPierwsza;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
