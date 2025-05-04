package char;

public abstract class Karakter {
    private String nama;
    private int level;

    public Karakter(String nama, int level) {
        this.nama = nama;
        this.level = level;
    }

    public String getNama() { return nama; }
    public int getLevel() { return level; }

    public abstract void tampilkanInfo();
}
