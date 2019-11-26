package NewJFrame1;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public Bilgisayar() {
    }

    @Override
    public int KartSec() {
        while (true) {
            int a = (int) (Math.random() * 3); // 0-1-2
            if (this.getKartDestesi().size() > a) {
                Pokemon secilen = this.getKartDestesi().get(a);
                return a;
            }
        }
    }

}
