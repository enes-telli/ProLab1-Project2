package NewJFrame1;

public class Jigglypuff extends Pokemon {

    private int hasarPuani = 70;
    private boolean kartKullanildiMi = false;

    public Jigglypuff() {
    }

    public Jigglypuff(String PokemonAdi, String PokemonTip, String resim) {
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
