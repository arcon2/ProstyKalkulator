package Program;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RamkaDruga extends JFrame implements ActionListener {
    TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
    RamkaTrzecia ramkaTrzecia = new RamkaTrzecia();
    GridBagConstraints grid = new GridBagConstraints();


    JButton buttonWyjscie = tekstRamkaPierwsza.getButtonWyjscie();
    JButton buttonDodaj = tekstRamkaPierwsza.getButtonDodaj();
    JButton buttonZnajdz = tekstRamkaPierwsza.getButtonZnajdz();
    JTextField imie = tekstRamkaPierwsza.getImie();
    JTextField nazwisko = tekstRamkaPierwsza.getNazwisko();
    JLabel label = tekstRamkaPierwsza.getLabel();



    public JPanel ramkaDruga() {
        JPanel lewy = new JPanel();
        JPanel prawy = new JPanel();
        JPanel centralny = new JPanel();
        centralny.setBackground(Color.cyan);
        prawy.setBackground(Color.MAGENTA);
        lewy.setBackground(Color.yellow);

        JPanel ramkaDruga = new JPanel();
        //ramkaDruga.setLayout(new FlowLayout(FlowLayout.CENTER));
        ramkaDruga.setLayout(null);
        //ramkaDruga.setSize(100, 600);
        ramkaDruga.setPreferredSize(new Dimension(300,100));
        ramkaDruga.setBackground(Color.BLUE);
        //ramkaDruga.add(label);

        centralny.setPreferredSize(new Dimension(300,30));
        lewy.setPreferredSize(new Dimension(150,30));
        prawy.setPreferredSize(new Dimension(150,30));
        ramkaDruga.setLayout(new BorderLayout());

        ramkaDruga.add(centralny,BorderLayout.NORTH);
        ramkaDruga.add(lewy,BorderLayout.EAST);
        ramkaDruga.add(prawy,BorderLayout.SOUTH);



        centralny.setLayout(new FlowLayout());
        lewy.setLayout(new FlowLayout());
        prawy.setLayout(new FlowLayout());



        grid.insets=new Insets(5,5,5,5);
        centralny.add(label);
        prawy.setLayout(new GridBagLayout());
        grid.gridx=0;
        grid.gridy=0;
        prawy.add(buttonDodaj);
        grid.gridx=0;
        grid.gridy=1;
        prawy.add(buttonZnajdz);
        grid.gridx=0;
        grid.gridy=2;
        prawy.add(buttonWyjscie);







        //label.setBounds(550,50,500,25);
        //ramkaDruga.setLayout(new BorderLayout());
        //ramkaDruga.add(label,BorderLayout.NORTH);
        ramkaDruga.add(imie);
        ramkaDruga.add(nazwisko);
        //ramkaDruga.add(buttonDodaj,BorderLayout.EAST);
        //buttonDodaj.setBounds(500,100,100,25);
        //ramkaDruga.add(buttonWyjscie,BorderLayout.EAST);
       // buttonWyjscie.setBounds(900,100,100,25);
        //ramkaDruga.add(buttonZnajdz,BorderLayout.EAST);
        //buttonZnajdz.setBounds(700,100,100,25);

        return ramkaDruga;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
