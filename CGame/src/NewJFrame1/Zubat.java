package NewJFrame1;

public class Zubat extends Pokemon {

    private int hasarPuani = 50;
    private boolean kartKullanildiMi = false;

    public Zubat() {
    }

    public Zubat(String PokemonAdi, String PokemonTip, String resim) {
        super(PokemonAdi, PokemonTip, resim);
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    public boolean getKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    public int hasarPuaniGoster() {
        return this.hasarPuani;
    }
}
