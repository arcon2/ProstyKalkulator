package Program;

import javax.swing.*;

public class TabbedPanel extends JFrame
{
    RamkaPierwsza ramkaPierwsza01= new RamkaPierwsza();
    RamkaDruga ramkaDruga = new RamkaDruga();
    JTabbedPane tabbedPane = new JTabbedPane();
    TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();

    public TabbedPanel()
    {
        tabbedPane.setSize(800,600);
        tabbedPane.add(ramkaDruga.ramkaDruga());
        ramkaPierwsza01.ramkaPierwsza().add(tabbedPane);
        tabbedPane.add(tekstRamkaPierwsza );
        tabbedPane.setVisible(true);
        add(tabbedPane);
    }
}
