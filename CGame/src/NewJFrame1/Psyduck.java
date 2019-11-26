package NewJFrame1;

public class Psyduck extends Pokemon {

    private int hasarPuani = 20;
    private boolean kartKullanildiMi = false;

    public Psyduck() {
    }

    public Psyduck(String PokemonAdi, String PokemonTip, String resim) {
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
