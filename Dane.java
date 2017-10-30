package Program;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dane extends JFrame implements ActionListener {


    public Dane() {
        setSize(800, 600);
        setTitle("Dane");

        Menu menu = new Menu();
        setJMenuBar(menu.menuBar);


        TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
        tekstRamkaPierwsza.getButtonZnajdz().setVisible(true);

        //dodanie ramki pierwszej
        RamkaPierwsza ramkaPierwsza = new RamkaPierwsza();
        add(ramkaPierwsza.ramkaPierwsza());

        RamkaDruga ramkaDruga = new RamkaDruga();


    }

    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dane.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
