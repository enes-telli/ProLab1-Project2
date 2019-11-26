package NewJFrame1;

public class Snorlax extends Pokemon {

    private int hasarPuani = 30;
    private boolean kartKullanildiMi = false;

    public Snorlax() {
    }

    public Snorlax(String PokemonAdi, String PokemonTip, String resim) {
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
