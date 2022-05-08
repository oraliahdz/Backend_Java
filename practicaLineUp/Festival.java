package practicaLineUp;

import imonsh.Screen;

import java.awt.*;
import java.util.ArrayList;

public class Festival implements FestivalActions{
    //Atributos
    String nombreFestival;
    String posterFestival;
    String fechaFestival;
    ArrayList<Cantante> listaCantantes = new ArrayList<Cantante>();
    String rutaBase = "src\\practicaLineUp\\images\\";
    String welcomeMessage = "Bievenidos al ";
    int sleepTime=6000; //6 segundos

    //Constructor
    public Festival(String nombreFestival, String fechaFestival, String posterFestival, ArrayList<Cantante> listaCantantes){
        this.nombreFestival=nombreFestival;
        this.fechaFestival=fechaFestival;
        this.posterFestival=posterFestival;
        this.listaCantantes=listaCantantes;
    }

    @Override
    public void ShowLineUp(Screen s) {
        Runnable conciertos = new Runnable() {
            @Override
            public void run() {
                try{
                    //Estilo de la pantalla
                    estiloFestival(s);
                    //Poster Inicial
                    ShowWelcome(s);
                    Thread.sleep(sleepTime);
                    //Por cada cantante, mostrar poster
                    for(int i=0; i < listaCantantes.size();i++){
                        estiloFestival(s);
                        listaCantantes.get(i).showPoster(s); //poster
                        listaCantantes.get(i).playSong(sleepTime); //canción
                        Thread.sleep(sleepTime);
                    }
                    //end program al final del loop
                    System.exit(0);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread hiloConcierto = new Thread(conciertos);
        hiloConcierto.start();

    }

    @Override
    public void estiloFestival(Screen s) {
        s.setVisible(true);
        s.changeStyle("Onyx",30, Color.green,Color.black);
        s.setSize(450,485); //tamaño
        s.setLocationRelativeTo(null); //centrar ventana
    }

    @Override
    public void ShowWelcome(Screen s) {
        //Shows  Welcome Page
        s.out("\n ");//Salto de línea
        s.out("                           ");//Centrar texto
        s.out(welcomeMessage +nombreFestival+"\n");
        s.out("\n ");//Salto de línea
        s.out("   ");//Centrar Imagen (400w)
        s.showImage(rutaBase+posterFestival);
        s.out("\n ");//Salto de línea
        estiloFestival(s);
        s.out("\t\n                                           ");//Centrar texto
        s.out(fechaFestival+"\n");
    }
}
