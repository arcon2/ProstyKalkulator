package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TekstRamkaPierwsza extends JFrame implements ActionListener {
    JButton buttonWyjscie, buttonDodaj, buttonZnajdz, buttonDodajDane;
    JLabel labelPowitanie, labelKomunikatPierwszy;
    JTextField imie, nazwisko;


    public JButton getButtonWyjscie() {
        buttonWyjscie = new JButton("WYJŚCIE");
        buttonWyjscie.setSize(100, 25);
        buttonWyjscie.setPreferredSize(new Dimension(100, 25));
        //buttonWyjscie.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonWyjscie.setVisible(true);
        buttonWyjscie.addActionListener(this);

        return buttonWyjscie;
    }

    public JButton getButtonDodaj() {
        buttonDodaj = new JButton("DODAJ");
        buttonDodaj.setSize(100, 25);
        buttonDodaj.setPreferredSize(new Dimension(100, 25));
        //buttonDodaj.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonDodaj.setVisible(true);
        buttonDodaj.addActionListener(this);

        return buttonDodaj;

    }

    public JButton getButtonDodajDane() {
        buttonDodajDane = new JButton("Dodaj dane");
        buttonDodajDane.setSize(100, 20);
        buttonDodajDane.setPreferredSize(new Dimension(100, 25));
        buttonDodajDane.addActionListener(this);
        buttonDodajDane.setVisible(false);

        return buttonDodajDane;
    }

    public JButton getButtonZnajdz() {
        buttonZnajdz = new JButton("ZNAJDZ");
        buttonZnajdz.setSize(100, 25);
        buttonZnajdz.setPreferredSize(new Dimension(100, 25));
        // buttonZnajdz.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonZnajdz.setVisible(true);
        buttonZnajdz.addActionListener(this);

        return buttonZnajdz;
    }

    public JLabel getLabel() {
        labelPowitanie = new JLabel("WITAJ W PROGRAMIE Co chcesz zrobić".toUpperCase());
        labelPowitanie.setLayout(new FlowLayout(FlowLayout.CENTER));
        //labelPowitanie.setVisible(false);
        labelPowitanie.setFont(new Font("Helvetica", Font.BOLD, 20));

        return labelPowitanie;
    }

    public JLabel getLabelKomunikatPierwszy() {
        labelKomunikatPierwszy = new JLabel("Dodaj osobę:");
        labelKomunikatPierwszy.setFont(new Font("Helvetica", Font.BOLD, 20));
        labelKomunikatPierwszy.setVisible(false);

        return labelKomunikatPierwszy;
    }

    public JTextField getImie() {
        imie = new JTextField("");
        imie.setSize(100, 25);
        imie.setPreferredSize(new Dimension(100, 25));
        imie.setLayout(new FlowLayout(FlowLayout.CENTER));
        imie.setVisible(false);
        imie.addActionListener(this);

        return imie;
    }

    public JTextField getNazwisko() {
        nazwisko = new JTextField("");
        nazwisko.setSize(100, 25);
        nazwisko.setPreferredSize(new Dimension(100, 25));
        nazwisko.setLayout(new FlowLayout(FlowLayout.CENTER));
        nazwisko.setVisible(false);
        nazwisko.addActionListener(this);

        return nazwisko;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();


        tekstRamkaPierwsza.getButtonWyjscie().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonZnajdz().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonDodaj().addActionListener(new Dane());

        Object z = e.getSource();
        {
            if (z == buttonWyjscie) {
                System.exit(0);
            } else if (z == buttonDodaj) {
                System.out.println("Dodaj");

                buttonDodaj.setVisible(false);
                buttonZnajdz.setVisible(false);
                imie.setVisible(true);
                nazwisko.setVisible(true);
                labelPowitanie.setVisible(false);
                buttonDodajDane.setVisible(true);
                labelKomunikatPierwszy.setVisible(true);

            } else if (z == buttonZnajdz) {
                System.out.println("Znajdz");


            }

        }

    }
}

