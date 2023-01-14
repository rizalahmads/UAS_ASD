package RakBukuDigital;
import java.util.Scanner;

public class Buku {
    // Deklarasi variabel
    int id, tahun;
    String judul, pengarang, penerbit;

    // Deklarasi objek
    Buku next;
    Scanner in = new Scanner(System.in);
    Scanner inStr = new Scanner(System.in);

    // Konstruktor agar objek next tidak null
    public Buku() {
        next = null;
    }

        // Method untuk menambah data buku
        public void tambahBuku() {
            System.out.println();
            System.out.println("=== TAMBAH DATA BUKU ===");
            System.out.print("Masukkan ID Buku: ");
            id = in.nextInt();
            System.out.print("Masukkan Judul Buku: ");
            judul = inStr.next();
            System.out.print("Masukkan Pengarang Buku: ");
            pengarang = inStr.next();
            System.out.print("Masukkan Penerbit Buku: ");
            penerbit = inStr.next();
            System.out.print("Masukkan Tahun Terbit Buku: ");
            tahun = in.nextInt();
            System.out.println();
            System.out.println("Data buku berhasil ditambahkan!");
        }

    // Method untuk menampilkan data buku
    public void tampilBuku() {
        System.out.println("-----");
        System.out.println("ID Buku: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahun);
    }

    // Method untuk mencari data buku berdasarkan judul dan substring judul
    public boolean cariBuku(String judul) {
        if (this.judul.contains(judul)) {
            return true;
        } else if (this.judul.equals(judul)) {
            return true;
        } else {
            return false;
        }
    }

    // Method untuk menghapus data buku
    public boolean hapusBuku(int id) {
        if (this.id == id) {
            return true;
        } else {
            return false;
        }
    }
}
