package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpiderGwen extends Spiderman implements SpidermanActionsCallbacks{
    public SpiderGwen(String nombre, int edad, String tipoTraje, int universo) {
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
        s.out(ShowMessage(),"Helvetica",28, Colors.GloomyPurple);
        s.out("Spider Sense \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\gwen-spidersense.PNG"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void wallcrawling(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.GloomyPurple);
        s.out("Wall Crawling \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\gwen-crawling.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }

    @Override
    public void webshooter(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(ShowMessage(),"Helvetica",28, Colors.GloomyPurple);
        s.out("Web Shooter \n\n","Helvetica",25, Colors.Desire);
        s.showImage("src\\practicaMultiverse\\images\\gwen-web.jpg"); //Imagen
        s.setBounds(20,20,1000,1000); //Size & Position
    }
}
