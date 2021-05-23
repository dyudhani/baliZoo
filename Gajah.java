package baliZoo;

import static baliZoo.Karnifora.jenisK;
import static baliZoo.Karnifora.makananK;

public class Gajah extends Binatang implements Herbifora{
    private String suara;
    private String warnaBulu;
    public Gajah (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis: "+jenisK);
        System.out.println("Makanan: "+makananK);
    }
    public void displayBinatang(){
        System.out.println("Nama: "+getNama());
        System.out.println("Jumlah Kaki: "+getKaki());
    }
    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("Suara: "+suara);
        System.out.println("Warna Bulu: "+warnaBulu);
    }
}
