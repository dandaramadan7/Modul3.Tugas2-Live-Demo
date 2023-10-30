import java.util.Scanner;

public class KelilingBalok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double keliling = hitungKelilingBalok(panjang, lebar, tinggi);
        System.out.println("Keliling balok adalah: " + keliling);

        input.close();
    }

    /**
     *
     * @param panjang salah satu rumus untuk menghitung keliling balok
     * @param lebar   salah satu rumus untuk menghitung keliling balok
     * @param tinggi  salah satu rumus untuk menghitung keliling balok
     * @return        mengembalikan nilai dari suatu metode (fungsi) ke pemanggilnya
     */
    public static double hitungKelilingBalok(double panjang, double lebar, double tinggi) {
        double keliling = 2 * (panjang + lebar + tinggi);
        return keliling;
    }
}
