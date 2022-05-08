package practicaLineUp;

import imonsh.Screen;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.io.File;

public class Cantante implements CantanteActions{
    String nombre, posterNombre, cancionNombre;
    String rutaImgFolder = "src\\practicaLineUp\\images\\";
    String rutaSongFolder = "src\\practicaLineUp\\songs\\";


    //Constructor
    public Cantante(String nombre, String posterNombre, String cancionNombre){
        this.nombre=nombre;
        this.posterNombre=posterNombre;
        this.cancionNombre=cancionNombre;
    }

    //getters
    public String getNombre(){return nombre;}
    public String getPosterNombre(){return posterNombre;}
    public String getCancionNombre(){return cancionNombre;}

    //Setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setPosterNombre(String posterNombre){
        if(!posterNombre.isEmpty()){
            this.posterNombre=posterNombre;
            return true;
        }else
            return false;
    }

    public boolean setCancionNombre(String cancionNombre){
        if(!cancionNombre.isEmpty()){
            this.cancionNombre=cancionNombre;
            return true;
        }else
            return false;
    }

    //Métodos de Interface//
    @Override
    public void showPoster(Screen s) {
        s.cls();
        s.repaint();
        s.changeStyle("Onyx",30, Color.green);
        s.out("                                       "); //Centrar texto
        s.out("Presentando a ");
        s.out("\n");//Salto de línea
        s.out("                                        "); //Centrar texto
        s.out(nombre);
        s.out("\n");//Salto de línea
        s.out("           ");//Centrar Imagen 350px W
        s.showImage(rutaImgFolder +posterNombre);
        s.out("\n");//Salto de línea
    }

    @Override
    public void playSong(int SleepTime) {
        //ONLY WAV music files
        Runnable rplay = new Runnable() {
            @Override
            public void run() {
                try{
                    File file = new File(rutaSongFolder+cancionNombre);
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream ais = AudioSystem.getAudioInputStream(file);
                    clip.open(ais);
                    clip.start();
                    Thread.sleep(SleepTime);
                    clip.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        Thread hplay =new Thread(rplay);
        hplay.start();

    }


}
