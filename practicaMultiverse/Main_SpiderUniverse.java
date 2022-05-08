package practicaMultiverse;

import imonsh.Colors;
import imonsh.Dialog;
import imonsh.Screen;

public class Main_SpiderUniverse {
    public static void main(String[] args) throws InterruptedException{

        //Superior Spiderman
        Screen s = new Screen();

        runSuperiorSPM(s);
        runUltimateSPM(s);
        runSpiderGwen(s);

        //end program
        System.exit(0);

        return;
    }

    public static void runSuperiorSPM(Screen s)throws InterruptedException{
        SuperiorSpiderman superior1 = new SuperiorSpiderman("Otto Octavius",63,"Superior Spiderman",616);
        superior1.spidersense(s);
        Thread.sleep(3000);//3 segundos de pausa
        superior1.wallcrawling(s);
        Thread.sleep(3000);//3 segundos de pausa
        superior1.webshooter(s);
        Thread.sleep(3000);//3 segundos de pausa
        return;
    }

    public static void runUltimateSPM(Screen s)throws InterruptedException{
        UltimateSpiderman ultimate1 = new UltimateSpiderman ("Milles Morales",14,"Ultimate Spiderman",1610);
        ultimate1.spidersense(s);
        Thread.sleep(3000);//3 segundos de pausa
        ultimate1.wallcrawling(s);
        Thread.sleep(3000);//3 segundos de pausa
        ultimate1.webshooter(s);
        Thread.sleep(3000);//3 segundos de pausa
        return;
    }

    public static void runSpiderGwen(Screen s)throws InterruptedException{
        SpiderGwen gwen1 = new SpiderGwen("Gwen Stacy",16,"Spider Gwen",65);
        gwen1.spidersense(s);
        Thread.sleep(3000);//3 segundos de pausa
        gwen1.wallcrawling(s);
        Thread.sleep(3000);//3 segundos de pausa
        gwen1.webshooter(s);
        Thread.sleep(3000);//3 segundos de pausa
        return;
    }
}
