package DW;

import javax.swing.*;
import java.awt.*;

public class finestra extends JFrame {

   private JFrame window;
   private Container c;

    public finestra() {
        window = new JFrame();
        c = new Container();

        this.setTitle("Registro");
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        menu(c);
    }

    public void menu(Container c){
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu m1 = new JMenu("Registro");
        JMenu m2 = new JMenu("Classi");
        JMenu m3 = new JMenu("Server");
        JMenu m4 = new JMenu("Calendario");
        bar.add(m1);
        bar.add(m2);
        bar.add(m3);
        bar.add(m4);
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
