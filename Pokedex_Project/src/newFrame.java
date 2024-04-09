import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class newFrame extends JFrame implements ActionListener{

    JButton search; 
    newFrame(int size, JPanel panel){

        search = new JButton();
        search.setBounds(683, 0, 100, 40);
        search.addActionListener(this);
        search.setText("Search");
        search.setFocusable(false);

        this.setTitle("Group 9's Pokedex");
        this.setSize(size, size);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(230,232,139));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(panel);
        this.add(search);

        ImageIcon titleImage = new ImageIcon("Images/titleIcon.png");
        this.setIconImage(titleImage.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            System.out.println("Gumana, nigga");
        }
    }
}
