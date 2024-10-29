package polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        // Persegi
        bangunDatar = new Persegi(4);
        System.out.println("Luas persegi : " + bangunDatar.luas());
        System.out.println("Keliling persegi : " + bangunDatar.keliling());

        // Lingkaran
        bangunDatar = new Lingkaran(7);
        System.out.println("Luas lingkaran : " + bangunDatar.luas());
        System.out.println("Keliling lingkaran : " + bangunDatar.keliling());

        // Segitiga Sama Sisi
        bangunDatar = new SegitigaSamaSisi(5);
        System.out.println("Luas segitiga sama sisi : " + bangunDatar.luas());
        System.out.println("Keliling segitiga sama sisi : " + bangunDatar.keliling());
    }
}
