import java.util.ArrayList;
import java.util.Scanner;

abstract class Pembeli {
    String nama;

    // Abstract method
    abstract void inputNoTelp();
}

class Diare extends Pembeli {
    int totalHarga = 0;
    ArrayList<String> belanjaan = new ArrayList<>();

    // Override method untuk menambahkan parameter no telp
    @Override
    void inputNoTelp() {
        Scanner scanner = new Scanner(System.in);

    }

    // Method untuk menampilkan pilihan daftar obat diare dan menghitung total harga
    void beliObatDiare() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("-------------------------------------------------------");
        System.out.println("                    DAFTAR OBAT DIARE                  ");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Diapet\t\tRp 6000");
        System.out.println("2. Entrostop\t\tRp 8000");
        System.out.println("3. Diatabs\t\tRp 10000");
        System.out.println("9. Check Out");
        System.out.println("-------------------------------------------------------");

        do {
            System.out.print("Pilihan Anda : ");
            pilihan = scanner.nextInt();

            if (pilihan != 9) {
                System.out.print("Banyaknya item yang dibeli : ");
                int qty = scanner.nextInt();
                tambahBelanjaan(pilihan, qty);
            }
        } while (pilihan != 9);

        if (belanjaan.isEmpty()) {
            System.out.println("Obat Tidak Ada");
        }
    }

    // Method untuk menambahkan item ke keranjang belanja
    void tambahBelanjaan(int pilihan, int qty) {
        switch (pilihan) {
            case 1:
                belanjaan.add("Diapet   \t\t" + qty + " Strip");
                totalHarga += (6000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            case 2:
                belanjaan.add("Entrostop\t\t" + qty + " Strip");
                totalHarga += (8000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            case 3:
                belanjaan.add("Diatabs  \t\t" + qty + " Strip");
                totalHarga += (10000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            default:
                System.out.println("Obat Tidak Ada");
        }
    }

    // Method untuk menampilkan struk belanja
    void tampilkanStruk() {
        System.out.println("\n================= STRUK BELANJA =====================");
        System.out.println("Item \t\t banyak barang");
        for (String item : belanjaan) {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Total Yang Harus dibayar Rp " + totalHarga);
        System.out.println("-------------------------------------------------------");
        System.out.println("=========Terima Kasih Telah Berbelanja, " + nama + "=========\n");
        System.out.println("=======================================================");
    }

}
