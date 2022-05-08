package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SuperiorSpiderman extends Spiderman implements SpidermanActionsCallbacks{

    public SuperiorSpiderman(String nombre, int edad, String tipoTraje, int universo) {
        super(nombre, edad, tipoTraje, universo);
    }

    @Override
    public String ShowMessage() {
        return super.ShowMessage();
    }

    @Override
    public void spidersense(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.AgalFuel);
        s.out("Spider Sense \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\Superior-SpiderSense.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void wallcrawling(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.AgalFuel);
        s.out("Wall Crawling \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\superior-wall.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void webshooter(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.AgalFuel);
        s.out("Web Shooter \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\superior-web.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }
}
