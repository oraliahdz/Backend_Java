package practicaComic;

import imonsh.Screen;

import java.util.ArrayList;

public class Comic_Main {
    public static void main(String[] args) throws InterruptedException{
        Thread.sleep(6100);
        Screen s = new Screen();
        Screen sCalamargo = new Screen();
        Screen sBob = new Screen();
        Screen sPatricio = new Screen();

        //Dialogo Personajes
        ArrayList<String> listCalamargo = new ArrayList<String>();
        ArrayList<String> listBob = new ArrayList<String>();
        ArrayList<String> listPatricio = new ArrayList<String>();
        scriptCalamargo(listCalamargo);
        scriptBob(listBob);
        scripPat(listPatricio);

        //Crear main Panel y desplegar viñetas
        Paneles mainPanel = new Paneles(s);
        mainPanel.showAllPanels(s);

        //Desplegar dialogos de Personaje1
        Calamargo calamargo = new Calamargo(sCalamargo);
        SpongeBob bob = new SpongeBob(sBob);
        Patricio pat = new Patricio(sPatricio);

        //delay de portada
        Thread.sleep(6100);
        //Mostrar dialogos
        calamargo.showDialog(listCalamargo);
        bob.showDialog(listBob);
        pat.showDialog(listPatricio);

    }//fin main

    public static void scriptCalamargo(ArrayList<String> ListaDialogo){
        //Dialogos de Calamargo Panel 1-7
        /*Pane #01*/ ListaDialogo.add("DONE!");
        /*Pane #02*/ ListaDialogo.add("ANOTHER MASTERPIECE. HOW DO I DO IT?");
        /*Pane #03*/ ListaDialogo.add("AAAAH!");
        /*Pane #04*/ ListaDialogo.add("OF COURSE.IT'S GREAT! \nI PAINTED IT,DIDN'T I?");
        /*Pane #05*/ ListaDialogo.add("TRAINING, SPONGEBOB!,\nI STUDIED THE CRAFT");
        /*Pane #06*/ ListaDialogo.add(""); //empty
        /*Pane #07*/ ListaDialogo.add("IF YOU WANT TO LEARN, TO PAINT \nGO PAINT IN YOUR YARD");
        /*Pane #08*/ ListaDialogo.add("");//empty
        /*Pane #09*/ ListaDialogo.add("WELL, AT LEAST THEY'RE OUT OF MY HAIR!");
        /*Pane #10*/ ListaDialogo.add("NOW I CAN CONCETRATE");
        /*Pane #11*/ ListaDialogo.add("AAAH!");
        /*Pane #12*/ ListaDialogo.add("HOW CAN YOU PAINT LOUD?!");
        /*Pane #13*/ ListaDialogo.add("IT WOULD BE MY PLEASURE");
        /*Pane #14*/ ListaDialogo.add("THAT'S NOT ART PATRICK! \nIT'S A TIC-TAC-TOE BOARD");
        /*Pane #15*/ ListaDialogo.add("THAT DOESN'T LOOK LIKE YOUR HOUSE!");
        /*Pane #16*/ ListaDialogo.add(""); //EMPTY
        /*Pane #17*/ ListaDialogo.add("YOU CAN'T BE CREATIVE WHEN YOU'RE PAINTING!");
        /*Pane #18*/ ListaDialogo.add("YOU HAVE TO PAINT WHAT'S REALLY THERE");
        /*Pane #19*/ ListaDialogo.add("");//EMPTY
        return;
    }

    public static void scriptBob(ArrayList<String> ListaDialogo){
        //Dialogos de Bob Panel 1-19
        /*Pane #01*/ ListaDialogo.add("");
        /*Pane #02*/ ListaDialogo.add("");
        /*Pane #03*/ ListaDialogo.add("THAT'S A GREAT PAINTING SQUIDWARD!");
        /*Pane #04*/ ListaDialogo.add("");
        /*Pane #05*/ ListaDialogo.add("SQUIRDWARD, HOW DID YOU LEARN TO PAINT SO GOOD?");
        /*Pane #06*/ ListaDialogo.add("WILL YOU TEACH US THE CRAFT OF PAINTING SQUIDWARD?");
        /*Pane #07*/ ListaDialogo.add("");
        /*Pane #08*/ ListaDialogo.add("OUR FIRST LESSON!");
        /*Pane #09*/ ListaDialogo.add("WE'R UNDER SQUIDWARD'S WING!");
        /*Pane #10*/ ListaDialogo.add("");
        /*Pane #11*/ ListaDialogo.add("");
        /*Pane #12*/ ListaDialogo.add("");
        /*Pane #13*/ ListaDialogo.add("ARE YOU GOING TO CONSTRUCTIVELY CRITIQUE OUR WORK, SQUIDWARD?");
        /*Pane #14*/ ListaDialogo.add("");
        /*Pane #15*/ ListaDialogo.add("I PAINTED MY HOUSE LIKE YOU DID");
        /*Pane #16*/ ListaDialogo.add("I ALWAYS WANTED A SPIRAL STAIRCASE AND OUT LIGHTNING. SO I GOT CREATIVE!");
        /*Pane #17*/ ListaDialogo.add("");
        /*Pane #18*/ ListaDialogo.add("LESSON NUMBER TWO. GOT IT SQUIWARD. ´PAINT WHAT'S REALLY THERE´ ");
        /*Pane #19*/ ListaDialogo.add("");
    }

    public static void scripPat(ArrayList<String> ListaDialogo){
        //Dialogos de Bob Panel 1-19
        /*Pane #01*/ ListaDialogo.add("");
        /*Pane #02*/ ListaDialogo.add("");
        /*Pane #03*/ ListaDialogo.add("ART!");
        /*Pane #04*/ ListaDialogo.add("");
        /*Pane #05*/ ListaDialogo.add("");
        /*Pane #06*/ ListaDialogo.add("LEARNING!");
        /*Pane #07*/ ListaDialogo.add("");
        /*Pane #08*/ ListaDialogo.add("");
        /*Pane #09*/ ListaDialogo.add("");
        /*Pane #10*/ ListaDialogo.add("");
        /*Pane #11*/ ListaDialogo.add("");
        /*Pane #12*/ ListaDialogo.add("");
        /*Pane #13*/ ListaDialogo.add("ARE YOU GOING TO CONSTRUCTIVELY CRITIQUE OUR WORK, SQUIDWARD?");
        /*Pane #14*/ ListaDialogo.add("INTERESTING INTERPRETATION");
        /*Pane #15*/ ListaDialogo.add("");
        /*Pane #16*/ ListaDialogo.add("");
        /*Pane #17*/ ListaDialogo.add("");
        /*Pane #18*/ ListaDialogo.add("");
        /*Pane #19*/ ListaDialogo.add("IF I HAVE A WEDGIE WHILE I'M PAINTING, DO I HAVE TO PAINT THAT, TOO?");
    }


}
