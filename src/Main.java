///Scrivere un programma che contenga una classe che definisce un Auto
// che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.

public class Main {
    public static void main(String[] args) {
        Auto car1 = new Auto(750, "YZ97CN9", "JEEP","Discovery 2021");
        Auto car2 = new Auto(750, "YZ91CN0", "OPEL","Astra");
        System.out.println("Auto: "+car1);
        System.out.println("Auto: "+car2);
        System.out.println(car1.getMarca());
        System.out.println(car2.getMarca());
        Auto[] autos = new Auto[2];
        autos[0] = car1;
        autos[1] = car2;
        Garage garage1 = new Garage(autos);
    }
}