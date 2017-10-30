package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamkaDruga extends JFrame implements ActionListener {
    TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
    JButton buttonWyjscie = tekstRamkaPierwsza.getButtonWyjscie();
    JButton buttonDodaj = tekstRamkaPierwsza.getButtonDodaj();
    JButton buttonZnajdz = tekstRamkaPierwsza.getButtonZnajdz();


    public JPanel ramkaDruga() {

        JPanel ramkaDruga = new JPanel();

        ramkaDruga.setLayout(new FlowLayout(FlowLayout.CENTER));
        ramkaDruga.setSize(100, 600);
        ramkaDruga.setBackground(Color.BLUE);
        ramkaDruga.add(buttonDodaj);
        ramkaDruga.add(buttonZnajdz);
        ramkaDruga.add(buttonWyjscie);


        ramkaDruga.setVisible(true);


        return ramkaDruga;


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
