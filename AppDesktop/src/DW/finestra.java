package DW;

import javax.swing.*;
import java.awt.*;

public class finestra extends JFrame {

   private JFrame window;
   private Container c;

    public finestra() {
        window = new JFrame();
        c = new Container();


        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        setBottone(c);
    }

    public void setBottone(Container c){
        JButton bottone1 = new JButton("Classi");
        JButton bottone2 = new JButton("Calendario");
        JButton bottone3 = new JButton("Agenda");
        JButton bottone4 = new JButton("Registro");
        c.add(bottone1);
        c.add(bottone2);
        c.add(bottone3);
        c.add(bottone4);
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

}
