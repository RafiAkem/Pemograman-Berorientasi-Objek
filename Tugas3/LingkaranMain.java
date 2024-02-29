package Tugas3;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(5);
        Lingkaran lingkaran2 = lingkaran1;
        System.out.println(lingkaran1.getJari2());
        System.out.println(lingkaran2.getJari2());
        ubahJari2(lingkaran2);
        System.out.println(lingkaran1.getJari2());
        System.out.println(lingkaran2.getJari2());
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }
}

class Lingkaran {
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
}
