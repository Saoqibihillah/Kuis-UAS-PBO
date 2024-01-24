import java.util.Scanner;

public class Apotek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t        APOTEK HOTARU             ");
        System.out.println("           MENJUAL OBAT FLU DAN OBAT DIARE       ");
        System.out.println("-------------------------------------------------------");

        // Input data pembeli
        Flu pembeliFlu = new Flu();
        pembeliFlu.nama = inputNama(scanner);
        pembeliFlu.inputNoTelp  ();

        // Pilihan jenis obat
        System.out.println("-------------------------------------------------------");
        System.out.println("Jenis obat yang ingin dibeli : ");
        System.out.println("1. FLU");
        System.out.println("2. DIARE ");
        System.out.print("Pilihan : ");
        int jenisObat = scanner.nextInt();
        System.out.println("-------------------------------------------------------");

        // Proses belanja obat sesuai pilihan
        if (jenisObat == 1) {
            pembeliFlu.beliObatFlu();
            pembeliFlu.tampilkanStruk();
        } else if (jenisObat == 2) {
            Diare pembeliDiare = new Diare();
            pembeliDiare.nama = pembeliFlu.nama;
            pembeliDiare.inputNoTelp();
            pembeliDiare.beliObatDiare();
            pembeliDiare.tampilkanStruk();
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }

    // Method untuk input nama
    static String inputNama(Scanner scanner) {
        System.out.print("Masukan Nama\t: ");
        return scanner.next();
    }
}
