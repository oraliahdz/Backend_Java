package practicaMona;

public class Mona extends Octogato{
    //Atributos
    String ocupacion,props;

    //Constructor
    public Mona(String nombre, String colorCuerpo, String colorOjos,String ocupacion,String props) {
        super(nombre, colorCuerpo, colorOjos);
        this.ocupacion=ocupacion;
        this.props=props;
    }
    //getters & setters
    public String getOcupacion(){return ocupacion;}
    public String getProps(){return props;}

    public boolean setOcupacion(String ocupacion){
        if(!ocupacion.isEmpty()){
            this.ocupacion=ocupacion;
            return true;
        }else
            return false;
    }

    public boolean setProps(String props){
        if(!props.isEmpty()){
            this.props=props;
            return true;
        }else
            return false;
    }

    //Métodos
    public void BeCute(){
        System.out.println("Being cute");
        return;
    }

    public void ShowMessage(){
        System.out.println("nombre: "+nombre+
                " color: "+colorCuerpo+
                " ojos: "+colorOjos+
                " ocupación: "+ocupacion+
                " props: " +props);
        return;
    }

}



