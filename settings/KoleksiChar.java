package utils;

import java.util.ArrayList;

public class KoleksiChar<T> {
    private ArrayList<T> daftar = new ArrayList<>();

    public void tambah(T item) {
        daftar.add(item);
    }

    public ArrayList<T> getSemua() {
        return daftar;
    }

    public void tampilkanSemua() {
        for (T item : daftar) {
            System.out.println(item);
        }
    }
}
