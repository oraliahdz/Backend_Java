package practicaMona;

public class Saketocat extends Mona{
     String tipoSake;
    public Saketocat(String nombre, String colorCuerpo, String colorOjos, String ocupacion, String props,String tipoSake) {
        super(nombre, colorCuerpo, colorOjos, ocupacion,props);
        this.tipoSake=tipoSake;
    }

    //Métodos
    public void ServirSake(){
        System.out.println("Sirviendo Sake");
        return;
    }

    public void BeberSake(){
        System.out.println("Bebiendo Sake");
        return;
    }

    public void ShowMessage(){
        System.out.println("nombre: "+nombre+
                " color: "+colorCuerpo+
                " ojos: "+colorOjos+
                " ocupación: "+ocupacion+
                " props: " +props+
                " tipoSake: "+tipoSake
        );
        return;
   }
}
