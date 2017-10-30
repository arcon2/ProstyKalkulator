package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TekstRamkaPierwsza extends JFrame implements ActionListener {
    JButton buttonWyjscie, buttonDodaj, buttonZnajdz;
    JLabel labelPowitanie;

    public JButton getButtonWyjscie() {
        buttonWyjscie = new JButton("WYJŚCIE");
        buttonWyjscie.setSize(100, 30);
        buttonWyjscie.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonWyjscie.setVisible(true);
        buttonWyjscie.addActionListener(this);

        return buttonWyjscie;
    }

    public JButton getButtonDodaj() {
        buttonDodaj = new JButton("DODAJ");
        buttonDodaj.setSize(100, 30);
        buttonDodaj.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonDodaj.setVisible(true);
        buttonDodaj.addActionListener(this);

        return buttonDodaj;

    }

    public JButton getButtonZnajdz() {
        buttonZnajdz = new JButton("ZNAJDZ");
        buttonZnajdz.setSize(100, 30);
        buttonZnajdz.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonZnajdz.setVisible(true);
        buttonZnajdz.addActionListener(this);

        return buttonZnajdz;
    }

    public JLabel getLabel() {
        labelPowitanie = new JLabel("WITAJ W PROGRAMIE Co chcesz zrobić".toUpperCase());
        labelPowitanie.setLayout(new FlowLayout(FlowLayout.CENTER));
        //labelPowitanie.setVisible(true);
        labelPowitanie.setFont(new Font("Helvetica", Font.BOLD, 20));


        return labelPowitanie;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
        RamkaDruga ramkaDruga = new RamkaDruga();
        RamkaPierwsza ramkaPierwsza = new RamkaPierwsza();
        RamkaTrzecia ramkaTrzecia = new RamkaTrzecia();


        tekstRamkaPierwsza.getButtonWyjscie().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonZnajdz().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonDodaj().addActionListener(new Dane());


        Object z = e.getSource();
        {

            if (z == buttonWyjscie) {
                System.exit(0);
            } else if (z == buttonDodaj) {
                System.out.println("Dodaj");
                buttonZnajdz.setVisible(false);
                buttonDodaj.setVisible(false);




            } else if (z == buttonZnajdz) {
                System.out.println("Znajdz");
            }


        }

    }
}

