package DW;

import javax.swing.*;
import java.awt.*;

public class finestra extends JFrame {

   private JFrame window;
   private Container c;
   private Ascoltatore listen;

    public finestra() {
        window = new JFrame();
        c = new Container();
        listen =new Ascoltatore();

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
        m1.addMenuListener(listen);
        bar.add(m2);
        m2.addMenuListener(listen);
        bar.add(m3);
        m3.addMenuListener(listen);
        bar.add(m4);
        m4.addMenuListener(listen);
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

