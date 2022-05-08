package practicaMona;

public class Octogato {
    String nombre, colorCuerpo, colorOjos;

    public Octogato(String nombre, String colorCuerpo, String colorOjos) {
        this.nombre=nombre;
        this.colorCuerpo=colorCuerpo;
        this.colorOjos=colorOjos;
    }

    public String getNombre() { return nombre;}
    public String getColorCuerpo(){return colorCuerpo;}
    public String getColorOjos(){return colorOjos;}

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setColorCuerpo(String colorCuerpo){
        if(!colorCuerpo.isEmpty()){
            this.colorCuerpo=colorCuerpo;
            return true;
        }else
            return false;
    }

    public boolean setcolorOjos(String colorOjos){
        if(!colorOjos.isEmpty()){
            this.colorOjos=colorOjos;
            return true;
        }else
            return false;
    }

    //Métodos
    public void ShowMessage(){
        System.out.println("nombre: "+nombre+
                " color: "+colorCuerpo+
                " ojos: "+colorOjos
        );
        return;
    }
}

