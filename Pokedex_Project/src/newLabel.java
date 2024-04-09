import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class newLabel extends JLabel{

    newLabel(String pMon_Index)
    {
        ImageIcon pMon_Image = new ImageIcon("Images/pokemon_"+pMon_Index+".png");
        Border border = BorderFactory.createLineBorder(new Color(139,151,187), 3);

        this.setIcon(pMon_Image);
        this.setBorder(border);
        
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
