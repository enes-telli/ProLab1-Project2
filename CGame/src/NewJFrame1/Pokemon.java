package NewJFrame1;

import javax.swing.ImageIcon;

public abstract class Pokemon {

    private int PokemonID;
    private String PokemonAdi;
    private String PokemonTip;
    private boolean kartKullanildiMi = false;
    ImageIcon resim;

    public Pokemon() {

    }

    public Pokemon(String PokemonAdi, String PokemonTip, String resim) {
        this.PokemonAdi = PokemonAdi;
        this.PokemonTip = PokemonTip;
        this.resim = new ImageIcon(getClass().getResource(resim));
    }

    public int getPokemonID() {
        return PokemonID;
    }

    public void setPokemonID(int PokemonID) {
        this.PokemonID = PokemonID;
    }

    public String getPokemonAdi() {
        return PokemonAdi;
    }

    public void setPokemonAdi(String PokemonAdi) {
        this.PokemonAdi = PokemonAdi;
    }

    public String getPokemonTip() {
        return PokemonTip;
    }

    public void setPokemonTip(String PokemonTip) {
        this.PokemonTip = PokemonTip;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    

    public abstract int hasarPuaniGoster();

}
