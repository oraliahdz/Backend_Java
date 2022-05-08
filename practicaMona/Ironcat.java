package practicaMona;

public class Ironcat extends Mona{
    String tipoArmadura;
    public Ironcat(String nombre, String colorCuerpo, String colorOjos, String ocupacion, String props,String tipoArmadura) {
        super(nombre, colorCuerpo, colorOjos, ocupacion, props);
        this.tipoArmadura=tipoArmadura;
    }

    public String getTipoArmadura(){return tipoArmadura;}

    public boolean setTipoArmadura(String tipoArmadura){
        if(!tipoArmadura.isEmpty()){
            this.tipoArmadura=tipoArmadura;
            return true;
        }else
            return false;
    }

    public void volar(){
        System.out.println("Volando");
        return;
    }

    public void disparar(){
        System.out.println("Disparando");
        return;
    }

    public void ShowMessage(){
        System.out.println("nombre: "+nombre+
                " color: "+colorCuerpo+
                " ojos: "+colorOjos+
                " ocupación: "+ocupacion+
                " props: " +props+
                " Armadura: "+tipoArmadura
        );
        return;
    }
}
