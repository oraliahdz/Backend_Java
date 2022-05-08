package practicaComic;

import imonsh.Screen;

import java.awt.*;
import java.util.ArrayList;

public class SpongeBob extends Personajes{
    ArrayList<String> dialogTexto = new ArrayList<String>();

    public SpongeBob(Screen dialogoScreen) {
        super(dialogoScreen);
    }

        @Override
    public void CurrentDialog(String dialogo) {
        super.CurrentDialog(dialogo);
    }

    @Override
    public void formatoEstilo(Screen dialgoScreen) {
        //Formato del Font
        dialgoScreen.changeStyle("Helvetica",16, Color.ORANGE);
        dialgoScreen.setBounds(20,60,200,150);
    }

    @Override
    public void showDialog(ArrayList<String> dialogTexto) {
        super.showDialog(dialogTexto);
    }
}
