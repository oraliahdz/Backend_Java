package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class UltimateSpiderman extends Spiderman implements SpidermanActionsCallbacks{
    public UltimateSpiderman(String nombre, int edad, String tipoTraje, int universo) {
        super(nombre, edad, tipoTraje, universo);
    }

    @Override
    public void spidersense(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.BalticSea);
        s.out("Spider Sense \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\ultimate-SpiderSense.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void wallcrawling(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.BalticSea);
        s.out("Wall Crawling \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\ultimate-crawling.png"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void webshooter(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.BalticSea);
        s.out("Web Shooter \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\ultimate-web.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }
}
