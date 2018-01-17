package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class TekstRamkaPierwsza extends JFrame implements ActionListener {
    JButton buttonWyjscie, buttonDodaj, buttonZnajdz, buttonDodajDane, buttonPowrot, buttonZnajdzDane;
    JLabel labelPowitanie, labelKomunikatPierwszy, labelKomunikatDrugi;
    JTextField imie, nazwisko;
    String imieTextRamka, nazwiskoTextRamka;


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
    public JButton getButtonZnajdzDane() {
        buttonZnajdzDane = new JButton("Znajdz dane");
        buttonZnajdzDane.setSize(120, 20);
        buttonZnajdzDane.setPreferredSize(new Dimension(120, 25));
        buttonZnajdzDane.addActionListener(this);
        buttonZnajdzDane.setVisible(false);

        return buttonZnajdzDane;
    }

    public JButton getButtonZnajdz() {
        buttonZnajdz = new JButton("ZNAJDZ");
        buttonZnajdz.setSize(100, 235);
        buttonZnajdz.setPreferredSize(new Dimension(100, 25));
        // buttonZnajdz.setLayout(new FlowLayout(FlowLayout.CENTER));
        //buttonZnajdz.setVisible(true);
        buttonZnajdz.addActionListener(this);

        return buttonZnajdz;
    }

    public JButton getButtonPowrot(){
        buttonPowrot = new JButton("POWRÓT");
        buttonPowrot.setSize(100,25);
        buttonPowrot.setPreferredSize(new Dimension(100,25));
        buttonPowrot.setVisible(false);
        buttonPowrot.addActionListener(this);

        return buttonPowrot;
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
    public JLabel getLabelKomunikatDrugi() {
        labelKomunikatDrugi = new JLabel("Znajdz osobę:");
        labelKomunikatDrugi.setFont(new Font("Helvetica", Font.BOLD, 20));
        labelKomunikatDrugi.setVisible(false);

        return labelKomunikatDrugi;
    }

    public JTextField getImie() {
        this.imie = new JTextField("");
        this.imie.setSize(100, 25);
        this.imie.setPreferredSize(new Dimension(100, 25));
        this.imie.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.imie.setVisible(false);
        this.imie.addActionListener(this);

        return this.imie;

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
        Program.OsobaDoBazy osobaDoBazy = new Program.OsobaDoBazy();



        tekstRamkaPierwsza.getButtonWyjscie().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonZnajdz().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonDodaj().addActionListener(new Dane());
        tekstRamkaPierwsza.getButtonZnajdz().addActionListener(new Dane());


        Object z = e.getSource();
        {
            if (z == buttonWyjscie) {
                System.exit(0);
            } else if (z == buttonDodaj) {
                System.out.println("Dodaj");

                buttonDodaj.setVisible(false);
                buttonZnajdz.setVisible(false);
                buttonPowrot.setVisible(true);
                imie.setVisible(true);
                nazwisko.setVisible(true);
                labelPowitanie.setVisible(false);
                buttonDodajDane.setVisible(true);
                labelKomunikatPierwszy.setVisible(true);
                labelKomunikatDrugi.setVisible(false);




            } else if (z == buttonZnajdz) {
                System.out.println("Znajdz");

                buttonDodaj.setVisible(false);
                buttonZnajdz.setVisible(false);
                buttonPowrot.setVisible(true);
                imie.setVisible(true);
                nazwisko.setVisible(true);
                labelPowitanie.setVisible(false);
                buttonDodajDane.setVisible(false);
                buttonZnajdzDane.setVisible(true);
                labelKomunikatPierwszy.setVisible(false);
                labelKomunikatDrugi.setVisible(true);



            }
            else if(z == buttonDodajDane)
            {


                System.out.println("Dodaj Dane");
                String imieTextRamka=imie.getText();
                String nazwiskoTextRamka=nazwisko.getText();
                System.out.println(imieTextRamka);
                System.out.println(nazwiskoTextRamka);
                BazaDanych bazaDanych = new BazaDanych();
                bazaDanych.insertOsoba(null,imieTextRamka,nazwiskoTextRamka);

            }
            else if(z == buttonPowrot)
            {
                System.out.println("Powrót");
                buttonDodaj.setVisible(true);
                buttonZnajdz.setVisible(true);
                buttonPowrot.setVisible(false);
                imie.setVisible(false);
                nazwisko.setVisible(false);
                labelPowitanie.setVisible(true);
                buttonDodajDane.setVisible(false);
                labelKomunikatPierwszy.setVisible(false);
                labelKomunikatDrugi.setVisible(false);
                buttonZnajdzDane.setVisible(false);

            }
            else if (z == buttonZnajdzDane)
            {
                System.out.println("Szukaj danych");
            }


        }

    }


}

