package practicaLineUp;

import imonsh.Screen;

import java.util.ArrayList;

public class Concierto_Main {

    public static void main(String[] args) {
        Screen s = new Screen();
        //Lista de Cantantes
        ArrayList<Cantante> listaCantantes = new ArrayList<Cantante>();
        listaCantantes.add(new Cantante("Beyonce","beyoncePoster.jpg","beyonce2.wav"));
        listaCantantes.add(new Cantante("Billy Idol","BillyIdolPoster.jpg","billy.wav"));
        listaCantantes.add(new Cantante("The Soft Moon","TheSoftMoon.jpg","softmoon.wav"));
        listaCantantes.add(new Cantante("Gary Clark Jr","GaryPoster.jpg","gary.wav"));
        listaCantantes.add(new Cantante("Taylor Swift","taylorPoster.jpg","taylor.wav"));
        //Crear festivar y correr lineup
        Festival palnorte = new Festival("PalNorte 2022","20 de Junio","PalNorte-Poster.jpg",listaCantantes);
        palnorte.ShowLineUp(s);



    }//fin main

}
