package Program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JMenuBar menuBar; //pasek menu
    JMenu menuPlik, menuNarzedzia, menuPomoc;
    public JMenuItem menuItemOtworz, menuItemOProgramie, menuItemWyjscie, menuItemDodaj;

    public Menu() {
        menuBar = new JMenuBar();

        //tworzymy poszczegółne główne kategorie menu
        menuPlik = new JMenu("Plik");
        menuNarzedzia = new JMenu("Narzędzia");
        menuPomoc = new JMenu("Pomoc");

        //tworzymy poszczegulne podkategorie
        menuItemOtworz = new JMenuItem("Otwórz");
        menuItemOProgramie = new JMenuItem("O Programie");
        menuItemWyjscie = new JMenuItem("Wyjście");
        menuItemDodaj = new JMenuItem("Dodaj");

        //dodajemy poszczegolne menu do paska menu
        menuBar.add(menuPlik);
        menuBar.add(menuNarzedzia);

        //ustawienie po prawej stronie pozostałych menu
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(menuPomoc);

        //dodawanie przyciakow do meny plik
        menuPlik.add(menuItemWyjscie);

        //dodawanie przyciakow do meny narzedzia
        menuNarzedzia.add(menuItemDodaj);

        //dodawanie przycisków do menu pomoc
        menuPomoc.add(menuItemOProgramie);

        //dodawabieactionLisnera
        menuItemOProgramie.addActionListener(this);
        menuItemWyjscie.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Menu menu = new Menu();

        menu.menuItemWyjscie.addActionListener(new Dane());//pozwonienie na action lisnera w innej klasie w tym przypadku w klasie dane


        Object z = e.getSource();
        if (z == menuItemOProgramie) {
            JOptionPane.showMessageDialog(null, "Wercja 1.0");
        }
        else if (z == menuItemWyjscie) {
            System.exit(0);
        }
    }
}
