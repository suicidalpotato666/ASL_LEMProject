package DW;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Ascoltatore implements MenuListener {


    @Override
    public void menuSelected(MenuEvent e) {
        JMenu b = (JMenu)e.getSource();
        JOptionPane.showMessageDialog(null,"hai premuto "+ b.getText());

    }

    @Override
    public void menuDeselected(MenuEvent e) {
    }

    @Override
    public void menuCanceled(MenuEvent e){}
}
