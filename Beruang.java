package baliZoo;

public class Beruang extends Binatang implements Karnifora, Herbifora{
    private String suara;
    private String warnaBulu;
    public Beruang (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis: "+jenisK + " + " + jenisH);
        System.out.println("Makanan: "+makananK+ " + " + makananH );
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