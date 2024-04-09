import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class newFrame extends JFrame{

    newFrame(int size, JPanel pMonDisplay, JPanel searchButton){

        this.setTitle("Group 9's Pokedex");
        this.setSize(size, size);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(230,232,139));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(pMonDisplay);
        this.add(searchButton);

        ImageIcon titleImage = new ImageIcon("Images/titleIcon.png");
        this.setIconImage(titleImage.getImage());
    }
}