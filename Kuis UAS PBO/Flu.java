import java.util.ArrayList;
import java.util.Scanner;

class Flu extends Pembeli {
    int totalHarga = 0;
    ArrayList<String> belanjaan = new ArrayList<>();

    // Override method untuk menambahkan parameter no telp
    @Override
    void inputNoTelp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan No Telpn : ");
        int noTelp = scanner.nextInt();
    }

    // Method untuk menampilkan pilihan daftar obat flu dan menghitung total harga
    void beliObatFlu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
            System.out.println("-------------------------------------------------------");
            System.out.println("                  DAFTAR OBAT FLU                      ");
            System.out.println("-------------------------------------------------------");
            System.out.println("1. Procold \t\tRp 5000");
            System.out.println("2. Influenza\t\tRp 6000");
            System.out.println("3. Decolgen  \t\tRp 7000");
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
        } while (pilihan != 9); // Ubah kondisi loop
        System.out.print("Obat Tidak Ada");
    }

    // Method untuk menambahkan item ke keranjang belanja
    void tambahBelanjaan(int pilihan, int qty) {
        switch (pilihan) {
            case 1:
                belanjaan.add("Procold \t\t" + qty + "Strip");
                totalHarga += (5000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            case 2:
                belanjaan.add("Influenza\t\t" + qty +"Strip");
                totalHarga += (6000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            case 3:
                belanjaan.add("Decolgen  \t\t" + qty + "Strip");
                totalHarga += (7000 * qty);
                System.out.println("Berhasil ditambahkan");
                break;
            default:
                System.out.print("Obat Tidak Ada");
        }
    }

    // Method untuk menampilkan struk belanja
    void tampilkanStruk() {
        System.out.println("\n=================== STRUK BELANJA ===================");
        System.out.println("Item\t\t banyak barang");
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
