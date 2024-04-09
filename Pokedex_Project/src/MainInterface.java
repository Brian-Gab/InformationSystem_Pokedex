import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainInterface{

    static newLabel pokemon;

    public static void main(String[] args){
        
        Border border = BorderFactory.createLineBorder(new Color(139,151,187), 3);
        JPanel pokemon_Display = new JPanel();
        pokemon_Display.setBackground(Color.WHITE);
        pokemon_Display.setBounds(0, 100, 500, 661);
        pokemon_Display.setLayout(new BorderLayout());

        newPokemon();
        pokemon_Display.add(pokemon);
        pokemon_Display.setBorder(border);
        
        newFrame mainFrame = new newFrame(800, pokemon_Display);
    }

    static void newPokemon(){
        pokemon = new newLabel("000");
    }
}
