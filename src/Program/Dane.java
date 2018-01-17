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

        //dodanie ramki pierwszej
        RamkaPierwsza ramkaPierwsza = new RamkaPierwsza();
        add(ramkaPierwsza.ramkaPierwsza());

        RamkaTrzecia ramkaTrzecia = new RamkaTrzecia();
        //add(ramkaTrzecia.ramkaTrzecia());

        RamkaDruga ramkaDruga = new RamkaDruga();
        //add(ramkaDruga.ramkaDruga());


        setExtendedState(MAXIMIZED_BOTH);//otwiera maksymalne okno


    }

    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dane.setVisible(true);
        OsobaDoBazy osobaDoBazy = new OsobaDoBazy();
        //System.out.println(osobaDoBazy.getImie());


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
