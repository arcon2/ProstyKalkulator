package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamkaDruga extends JFrame implements ActionListener {
    TekstRamkaPierwsza  tekstRamkaPierwsza = new TekstRamkaPierwsza();
    RamkaTrzecia ramkaTrzecia = new RamkaTrzecia();
    GridBagConstraints grid = new GridBagConstraints();


    JButton buttonWyjscie = tekstRamkaPierwsza.getButtonWyjscie();
    JButton buttonDodaj = tekstRamkaPierwsza.getButtonDodaj();
    JButton buttonDodajDane = tekstRamkaPierwsza.getButtonDodajDane();
    JButton buttonZnajdz = tekstRamkaPierwsza.getButtonZnajdz();
    JButton buttonPowrot = tekstRamkaPierwsza.getButtonPowrot();
    JButton buttonZnajdzDane = tekstRamkaPierwsza.getButtonZnajdzDane();



    JTextField imie = tekstRamkaPierwsza.getImie();
    JTextField nazwisko = tekstRamkaPierwsza.getNazwisko();
    JLabel label = tekstRamkaPierwsza.getLabel();
    JLabel labelKomunikatPierwszy = tekstRamkaPierwsza.getLabelKomunikatPierwszy();
    JLabel labelKomunikatDrugi = tekstRamkaPierwsza.getLabelKomunikatDrugi();





    public JPanel ramkaDruga() {

        JPanel ramkaDruga = new JPanel();
        ramkaDruga.setLayout(null);
        ramkaDruga.setPreferredSize(new Dimension(300, 100));
        ramkaDruga.setBackground(Color.BLUE);
        ramkaDruga.setLayout(new BorderLayout());

        JPanel prawy = new JPanel();
        JPanel lewy = new JPanel();
        JPanel dol = new JPanel();
        JPanel gora = new JPanel();
        JPanel centralny = new JPanel();
        //gora.setBackground(Color.cyan);
        //dol.setBackground(Color.MAGENTA);
        //prawy.setBackground(Color.yellow);
        centralny.setBackground(Color.RED);

        gora.setPreferredSize(new Dimension(300, 30));
        prawy.setPreferredSize(new Dimension(150, 30));
        dol.setPreferredSize(new Dimension(150, 30));
        lewy.setPreferredSize(new Dimension(150, 30));

        ramkaDruga.add(prawy, BorderLayout.EAST);
        ramkaDruga.add(gora, BorderLayout.NORTH);
        ramkaDruga.add(dol, BorderLayout.SOUTH);
        ramkaDruga.add(lewy, BorderLayout.WEST);
        ramkaDruga.add(centralny, BorderLayout.CENTER);

        gora.setLayout(new FlowLayout());
        prawy.setLayout(new FlowLayout());
        dol.setLayout(new FlowLayout());
        lewy.setLayout(new FlowLayout());
        centralny.setLayout(new FlowLayout());

        gora.add(label);
        gora.add(labelKomunikatPierwszy);
        gora.add(labelKomunikatDrugi);



        centralny.add(imie);
        centralny.add(nazwisko);
        centralny.add(buttonDodajDane);
        centralny.add(buttonZnajdzDane);





        grid.insets = new Insets(5, 5, 5, 5);
        dol.setLayout(new GridBagLayout());
        grid.gridx = 1;
        grid.gridy = 0;
        dol.add(buttonDodaj, grid);
        grid.gridx = 2;
        grid.gridy = 0;
        dol.add(buttonZnajdz, grid);
        grid.gridx = 3;
        grid.gridy = 0;
        dol.add(buttonWyjscie, grid);
        grid.gridx = 4;
        grid.gridy = 0;
        dol.add(buttonPowrot, grid);

        return ramkaDruga;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
