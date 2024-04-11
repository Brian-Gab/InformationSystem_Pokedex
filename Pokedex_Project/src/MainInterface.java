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
    static JPanel searchBar;
    static JButton searchButton;
    static int pokemonIndex = 0;
    public static void main(String[] args){

        Border border = BorderFactory.createLineBorder(new Color(139,151,187), 3);

        //Fucking Panels - should make a new class for this
        pokemon_Display = new JPanel();
        pokemon_Display.setBackground(Color.WHITE);
        pokemon_Display.setBounds(0, 100, 500, 661);
        pokemon_Display.setLayout(new BorderLayout());
        pokemon_Display.setBorder(border);

        searchButtonPanel = new JPanel();
        searchButtonPanel.setBackground(Color.WHITE);
        searchButtonPanel.setBounds(685, 5, 93, 40);
        searchButtonPanel.setLayout(new BorderLayout());

        //Search Bar
        searchBar = new JPanel();
        searchBar.setBackground(Color.WHITE);
        searchBar.setBounds(5, 10, 675, 30);
        searchBar.setLayout(new BorderLayout());

        //Search Button
        searchButton = new JButton();
        searchButton.setBounds(0, 0, 93, 40);
        searchButton.addActionListener(e -> newPokemon());
        searchButton.setText("Search");
        searchButton.setFocusable(false);



        searchButtonPanel.add(searchButton);


        //newPokemon();
        pokemon = new newLabel("");
        pokemon_Display.add(pokemon);

        
        new newFrame(800, pokemon_Display, searchButtonPanel, searchBar);
    }

    //Button test
    static void newPokemon(){

        if(pokemonIndex < 10){
            ImageIcon pMon_Image = new ImageIcon("Images/hires/00"+pokemonIndex+".png");
            pokemon.setIcon(pMon_Image);
        }
        else if(pokemonIndex < 100 && pokemonIndex > 9){
            ImageIcon pMon_Image = new ImageIcon("Images/hires/0"+pokemonIndex+".png");
            pokemon.setIcon(pMon_Image);
        }
        else{
            ImageIcon pMon_Image = new ImageIcon("Images/hires/"+pokemonIndex+".png");
            pokemon.setIcon(pMon_Image);
        }

        System.out.println(pokemonIndex);
        pokemonIndex = pokemonIndex + 1;
    }
}