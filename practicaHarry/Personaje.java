package practicaHarry;

import imonsh.Screen;

public class Personaje {
    //Atributos
    String nombre, genero, casa, patronus, varita;
    int nacimiento;

    //Constructor
    public Personaje(String nombre, String genero, String casa, String patronus, String varita, int nacimiento){
        this.nombre=nombre;
        this.genero=genero;
        this.casa=casa;
        this.patronus=patronus;
        this.varita=varita;
        this.nacimiento=nacimiento;
    }

    //getters y setters
    public String getNombre(){ return nombre;}
    public String getGenero(){return genero;}
    public String getCasa(){return casa;}
    public String getPatronus(){return patronus;}
    public String getVarita(){return varita;}
    public int getNacimiento(){return nacimiento;}

    //Setters
    public boolean  setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa=casa;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }

    public boolean setVarita(String varita){
        if(!varita.isEmpty()){
            this.varita=varita;
            return true;
        }else
            return false;
    }

    public boolean setNacimiento(int nacimiento){
        if(nacimiento>0){
            this.nacimiento=nacimiento;
            return true;
        }else
            return false;
    }

    //Métodos
    public void printMage(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Año de Nacimiento: "+nacimiento);
        System.out.println("Género: "+genero);
        System.out.println("Casa: "+casa);
        System.out.println("Varita: "+varita);
        System.out.println("Patronus: "+patronus+"\n");
        return;
    }

    //MAIN
    public static void main(String[] args) {
        Personaje harry = new Personaje("Harry Potter","Masculino","Gryffindor","Ciervo",
                "Acebo, 27'94cm, flexible, pluma de fénix",1980);
        Personaje ron = new Personaje("Ronald Weasley","Masculino","Gryffindor",
                "Jack Russell Terrier","Fresno, 30,4 cm, pelo de cola de unicornio",1980);
        Personaje hermione = new Personaje("Hermione Granger ","Femenino","Gryffindor",
                "Nutria","Vid, 10 ¾, nervio de corazón de dragón",1979);
        Personaje minerva = new Personaje("Minerva McGonagall","Femenino","Gryffindor",
                "Gato","Abeto y fibra de corazón de dragón, veinticuatro centímetros, rígida[",1940);
        Personaje albus = new Personaje("Albus Dumbledore","Masculino","Gryffindor",
                "Fenix","38'1 cm, Saúco, núcleo de pelo de cola de Thestral",1881);

        harry.printMage();
        ron.printMage();
        hermione.printMage();
        minerva.printMage();
        albus.printMage();
    }


}


