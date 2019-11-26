package NewJFrame1;

public class Kullanici extends Oyuncu {

    public Kullanici(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public Kullanici() {
    }

    @Override
    public int KartSec() {
        return 0;
    }
}
