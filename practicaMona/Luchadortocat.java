package practicaMona;

public class Luchadortocat extends Mona{
    String mascara;
    public Luchadortocat(String nombre, String colorCuerpo, String colorOjos, String ocupacion, String props, String mascara) {
        super(nombre, colorCuerpo, colorOjos, ocupacion, props);
        this.mascara=mascara;
    }

    //Getters & Setters
    public String getMascara(){return mascara;}

    public boolean setMascara(String mascara){
        if(!mascara.isEmpty()){
            this.mascara=mascara;
            return true;
        }else
            return false;
    }

    @Override
    public void ShowMessage() {
        System.out.println("nombre: "+nombre+
                " color: "+colorCuerpo+
                " ojos: "+colorOjos+
                " ocupación: "+ocupacion+
                " props: " +props+
                " Mascara: "+mascara
        );
        return;
    }

    public void ataque1(){
        System.out.println("Ataque 1");
    }

    public void ataque2(){
        System.out.println("Ataque 2");
    }
}
