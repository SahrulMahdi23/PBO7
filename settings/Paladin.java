package character;

public class Paladin extends Karakter {
    private String senjata;

    public Pahlawan(String nama, int level, String senjata) {
        super(nama, level);
        this.senjata = senjata;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("🛡️ Pahlawan " + getNama() + " (Level " + getLevel() + "), bersenjata " + senjata);
    }
}
