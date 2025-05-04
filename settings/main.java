package app;

import character.*;
import utils.KoleksiKarakter;

public class Main {
    public static void main(String[] args) {
        KoleksiKarakter<Karakter> duniaFantasy = new KoleksiKarakter<>();

        duniaFantasy.tambah(new Pahlawan("Raja Aditia", 9999, "Hikari no Ken"));
        duniaFantasy.tambah(new Penyihir("Syabila", 1111, "Heal"));
        duniaFantasy.tambah(new Naga("Maou Leviathan", 2000, 9102));

        System.out.println("🌟 Daftar Karakter Dunia Fantasy 🌟");
        for (Karakter k : duniaFantasy.getSemua()) {
            k.tampilkanInfo();
        }
    }
}
