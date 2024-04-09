import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainInterface{

    static newLabel pokemon;
    static JPanel searchButtonPanel;
    static JPanel pokemon_Display;
    static JButton searchButton;

    public static void main(String[] args){

        Border border = BorderFactory.createLineBorder(new Color(139,151,187), 3);
        pokemon_Display = new JPanel();
        pokemon_Display.setBackground(Color.WHITE);
        pokemon_Display.setBounds(0, 100, 500, 661);
        pokemon_Display.setLayout(new BorderLayout());
        pokemon_Display.setBorder(border);

        searchButtonPanel = new JPanel();
        searchButtonPanel.setBackground(Color.WHITE);
        searchButtonPanel.setBounds(691, 0, 100, 40);
        searchButtonPanel.setLayout(new BorderLayout());

        searchButton = new JButton();
        searchButton.setBounds(0, 0, 100, 40);
        searchButton.addActionListener(e -> newPokemon());
        searchButton.setText("Search");
        searchButton.setFocusable(false);

        searchButtonPanel.add(searchButton);


        //newPokemon();
        pokemon = new newLabel("");
        pokemon_Display.add(pokemon);

        
        newFrame mainFrame = new newFrame(800, pokemon_Display, searchButtonPanel);
    }

    static void newPokemon(){
        String pokemonIndex = "000";
        ImageIcon pMon_Image = new ImageIcon("Images/pokemon_"+pokemonIndex+".png");
        pokemon.setIcon(pMon_Image);
    }
}