package practicaComic;

import imonsh.Screen;

import java.awt.*;
import java.util.ArrayList;

public class Patricio extends Personajes{

    public Patricio(Screen dialogoScreen) {
        super(dialogoScreen);
    }

    //Formato de dialogo de texto y posición
    @Override
    public void formatoEstilo(Screen dialgoScreen) {
        //Formato del Font
        dialgoScreen.changeStyle("Helvetica",16, Color.MAGENTA);
        //Posición inical del cuadro de texto
        dialgoScreen.setBounds(20,260,200,150);
    }

    @Override
    public void CurrentDialog(String dialogo) {
        super.CurrentDialog(dialogo);
    }

    @Override
    public void showDialog(ArrayList<String> dialogTexto) {
        super.showDialog(dialogTexto);
    }
}
