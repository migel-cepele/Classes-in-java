package chapter8_9;
/*Te krijohet nje klase Drejtekendesh e cila krijon objekte te tipit drejtekendesh dhe ben te mundur llogaritjen e perimetrit dhe siperfaqes se nje drejtekendesh,
 ku brinjet e drejtkendeshit jane variabla perfaqesues per cdo objekt te kesaj klase.
 Klasa duhet te kete dy konstruktor(per drejtekendesh dhe katror). Klasa duhet te kete metodat per dhenie apo marrje te vlerave te variablave te
  fushes(getBrinjet-setBrinjet). Te llogariten me funksione siperfaqja dhe perimetri. Gjithashtu klasa te kete funksion i cili te ktheje pergjigje 
  per llojin e drejtkendeshit, nese ai eshte katror. 

Klasa DrejtekendeshTest te krijoj nje vektor me 4 objekte te tipit drejtekendesh. Brinjet e 4 objekteve te jepen me input(scanner, joptionpane, ..), 
te kontrollohen qe te plotesojne kriter per te qene pozitive,  veprime te bera ne main. Te afishohen siperfaqe dhe perimeter per te gjithe elementet
 e vektorit me drejtekendesha. Te tregohet nese elementi i fundit i vektorit eshte katror apo jo.  */



public class Drejtkendesh {


    private double gjatesia;
    private double gjeresia;


    public Drejtkendesh(double x) { //konsktruktori i pare(katror)
        this(x,x);
    }


    public Drejtkendesh(double x, double y) {  //argumenti i pare eshte gjatesia, ndersa i dyti gjeresia 
        setGjatesia(x);
        setGjeresia(y);
    }


    public void setGjatesia(double x) {

        if(x <0)
        System.out.println("argument invalid");
        else
        gjatesia = x;

    }

    public void setGjeresia(double y) {
        if(y <0)
        System.out.println("argument invalid");
        else
        gjeresia = y;

    }

    public final double getGjatesia() { //fjala celes final nenkupton qe kjo metode nuk mund te rishkruhet nga nenklasat e kesaj klase
        return gjatesia;                //kthen gjatesine
    }

    public final double getGjeresia() {return gjeresia;} //kthen gjeresine

    public double perimetri() { //llogaritja perimetrit
        return 2*getGjatesia() + 2 * getGjeresia();
    }


    public double siperfaqa() {  //llogaritja siperfaqes
        return getGjatesia() * getGjeresia();
    }

    public boolean eshteKatror() {  //kthen true nese eshte katror dhe false nese nuk eshte
        return getGjatesia() == getGjeresia();
    }


    public String toString() {
        return String.format("%.2fGjatesia: %n%.2fGjeresia: %n%bEshte katror: %n%.2fSiperfaqja: %n%.2fPerimetri: ", getGjatesia(),
        getGjeresia(), eshteKatror(),siperfaqa(),perimetri() );
    }


    
}
