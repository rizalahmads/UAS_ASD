package RakBukuDigital;

public class Main {
    public static void main(String[] args) {
        // Deklarasi objek
        Buku buku = new Buku();
        int menu = 0;
        Stack list = new Stack();

        // Menu utama
        while (menu != 5) {
            System.out.println();
            System.out.println("==========================================");
            System.out.println("=== SELAMAT DATANG DI RAK BUKU DIGITAL ===");
            System.out.println("==========================================");
            System.out.println("=== Pilih menu di bawah ini: ");
            System.out.println("=== 1. Tambah Data Buku");
            System.out.println("=== 2. Tampilkan Data Buku");
            System.out.println("=== 3. Cari Data Buku");
            System.out.println("=== 4. Hapus Data Buku");
            System.out.println("=== 5. Keluar");
            System.out.print("=== Pilihan: ");  
            menu = buku.in.nextInt();

            // Pilihan menu
            if (menu == 1) {
                Buku baru = new Buku();
                baru.tambahBuku();
                list.push(baru);
            } else if (menu == 2) {
                list.view();
            } else if (menu == 3) {
                System.out.println();
                System.out.println("=== CARI DATA BUKU ===");
                System.out.print("Masukkan Judul Buku: ");
                String judul = buku.inStr.next();
                System.out.println("");
                list.search(judul);
            } else if (menu == 4) {
                System.out.println();
                System.out.println("=== HAPUS DATA BUKU ===");
                System.out.print("Masukkan ID Buku: ");
                int id = buku.in.nextInt();
                list.pop(id);
            } else if (menu == 5) {
                System.out.println("Terima kasih, sampai jumpa!");
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }
}