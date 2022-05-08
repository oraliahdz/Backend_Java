package practicaComic;

import imonsh.Screen;

import java.util.ArrayList;

public class Personajes {
    Screen dialgoScreen = new Screen();

    //Constructor
    public Personajes(Screen dialogoScreen){
        this.dialgoScreen =dialogoScreen;
        formatoEstilo(dialgoScreen);
    }
    public  void formatoEstilo(Screen dialgoScreen){
        //Crear estilo para cada personaje
    }



    public void CurrentDialog(String dialogo){
        dialgoScreen.cls();
        dialgoScreen.repaint();
        dialgoScreen.out(dialogo);
    }

    public void showDialog(ArrayList<String> dialogTexto){
        Runnable talk = new Runnable() {
            @Override
            public void run() {
                try{
                    //Screen visible

                    //Start Dialog
                    for(int i=0; i<dialogTexto.size(); i++){
                        if(!dialogTexto.get(i).isEmpty()){
                            //Si no está vacio
                            dialgoScreen.setVisible(true);
                            CurrentDialog(dialogTexto.get(i));
                            Thread.sleep(6000);//5 segundos delay
                        }else{
                            //Ocultar pantalla
                            dialgoScreen.setVisible(false);
                            Thread.sleep(6000);//5 segundos delay
                        }

                    }
                    //hide panel
                    dialgoScreen.setVisible(false);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread talkHilo = new Thread(talk);
        talkHilo.start();
    }

}
