package NewJFrame1;

import java.util.ArrayList;

public abstract class Oyuncu {

    private int oyuncuID;
    private int skor;
    private String oyuncuAdi;
    private ArrayList<Pokemon> kartDestesi = new ArrayList<>();

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public Oyuncu() {
        this.skor = 0;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public ArrayList<Pokemon> getKartDestesi() {
        return kartDestesi;
    }

    public void setKartDestesi(ArrayList<Pokemon> kartDestesi) {
        this.kartDestesi = kartDestesi;
    }

    public abstract int KartSec();

    public void KartDagit(ArrayList<Pokemon> deste) {
        int a = (int) (Math.random() * deste.size()); // 0-10 arası sayı
        Pokemon secilen = deste.get(a); // deste'den 0-10 indisten birini secilen'e at
        this.kartDestesi.add(secilen); // ilgili oyuncunun eline ilgili kartı ekle
        deste.remove(secilen); // oyuncuların eline her kart eklenişinde asıl desteden siliniyor (kullanılmaması için)
    }

}
