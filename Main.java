package baliZoo;

public class Main {
    public static void main (String[] args){
        Kucing k = new Kucing("miko",4,"Meong meong", "Coklat");
        k.displayData();
        System.out.println();
        Gajah g = new Gajah("Jajah",4,"Toreet toreet", "Abu-abu");
        g.displayData();
        System.out.println();
        Beruang b = new Beruang("Bluang",4,"Groooa groooa", "Coklat");
        b.displayData();
        System.out.println();

    }
}
