package character;

public class Necomander extends Karakter {
    private String elemen;

    public Penyihir(String nama, int level, String elemen) {
        super(nama, level);
        this.elemen = elemen;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("🔮 Penyihir " + getNama() + " (Level " + getLevel() + "), menguasai elemen " + elemen);
    }
}
