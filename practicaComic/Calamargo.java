package practicaComic;

import imonsh.Screen;

import java.awt.*;
import java.util.ArrayList;

public class Calamargo extends Personajes{


    public Calamargo(Screen dialogoScreen) {
        super(dialogoScreen);
    }

    //Formato de dialogo de texto y posición
    @Override
    public void formatoEstilo(Screen dialgoScreen) {
        //Formato del Font
        dialgoScreen.changeStyle("Helvetica",16, Color.blue);
        //Posición inical del cuadro de texto
        dialgoScreen.setBounds(790,60,200,200);
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
