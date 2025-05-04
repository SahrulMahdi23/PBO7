package character;

public class Dragon extends Karakter {
    private int kekuatanApi;

    public Naga(String nama, int level, int kekuatanApi) {
        super(nama, level);
        this.kekuatanApi = kekuatanApi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("🐉 Naga " + getNama() + " (Level " + getLevel() + "), kekuatan api: " + kekuatanApi);
    }
}
