package practicaComic;

import imonsh.Screen;

public class Paneles {
    Screen s = new Screen();

    //Constructor
    public Paneles(Screen s) throws InterruptedException{
        this.s=s;
        s.setVisible(true);
    }

    //Muestra todos los paneles
    public void showAllPanels(Screen s) throws InterruptedException{
        //hilo en runnable
        Runnable panel = new Runnable() {
            @Override
            public void run() {
                try{
                    //Portada
                    currentPanel("src\\practicaComic\\images\\portadaComic.PNG",s);
                    Thread.sleep(6000);//5 segundos delay
                    //Panel #1
                    currentPanel("src\\practicaComic\\images\\Panel1.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel2.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel3.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel4.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel5.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel6.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel7.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel8.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel9.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel10.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel11.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel12.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel13.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel14.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel15.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel16.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel17.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel18.PNG",s);
                    Thread.sleep(6000);//10 segundos delay
                    currentPanel("src\\practicaComic\\images\\Panel19.PNG",s);
                    Thread.sleep(6000);//10 segundos delay

                    //end program
                    System.exit(0);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }; //fin runnable

        //Ejecutar hilo
        Thread panelHilo = new Thread(panel);
        panelHilo.start();
    }

    //Desplegar imagen
    public void currentPanel(String rutaImagen, Screen s){
        s.cls();
        s.repaint();
        s.showImage(rutaImagen);
        s.setBounds(200,50,600,600);
    }
}
