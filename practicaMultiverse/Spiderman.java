package practicaMultiverse;

public class Spiderman {
    String nombre, tipoTraje;
    int edad,universo;

    public Spiderman(String nombre, int edad, String tipoTraje, int universo){
        this.nombre=nombre;
        this.edad=edad;
        this.tipoTraje =tipoTraje;
        this.universo=universo;
    }

    //getters
    public String getNombre(){return nombre;}
    public String getTipoTraje(){return tipoTraje;}
    public int getEdad(){return edad;}
    public int getUniverso(){return universo;}

    //Setters
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setTipoTraje(String tipoTraje){
        if(!tipoTraje.isEmpty()){
            this.tipoTraje =tipoTraje;
            return true;
        }else
            return false;
    }

    public boolean setEdad(int edad){
        if(edad>0){
            this.edad=edad;
            return true;
        }else
            return false;
    }

    public boolean setUniverso(int universo){
        if(universo>0){
            this.universo=universo;
            return true;
        }else
            return false;
    }

    //ShowMessage
    public String ShowMessage(){
        return "Nombre: "+nombre+
                ", Edad: "+edad+
                ", Traje: "+ tipoTraje +
                ", Universo: "+universo+" \n"
                ;

    }
}
