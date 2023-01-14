package RakBukuDigital;

public class Stack {
    // Deklarasi variabel
    Buku top;
    
    // Konstruktor
    public Stack() {
        top = null;
    }

    // Method untuk menambah data buku
    public void push(Buku baru) {
        if (top == null) {
            top = baru;
        } else {
            Buku current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }

    // Method untuk menampilkan data buku
    public void view() {
        Buku current = top;
        if (current == null) {
            System.out.println("Maaf, Data buku kosong");
        } else {
            while (current != null) {
                current.tampilBuku();
                current = current.next;
            }
        }
    }

    // Method untuk mencari data buku sesuai judul dan huruf awal
    public void search(String judul) {
        Buku current = top;
        if (current == null) {
            System.out.println("Maaf, Data buku tidak ditemukan");
        } else {
            while (current != null) {
                if (current.cariBuku(judul)) {
                    current.tampilBuku();
                }
                current = current.next;
            }
        }
    }

    // Method untuk menghapus data buku
    public void pop(int id) {
        Buku current = top;
        Buku previous = null;
        if (current == null) {
            System.out.println("Maaf, Data buku sudah kosong");
        } else {
            while (current != null) {
                if (current.hapusBuku(id)) {
                    if (previous == null) {
                        top = current.next;
                    } else {
                        previous.next = current.next;
                    }
                    System.out.println("Buku ID " + id + " berhasil dihapus");
                    break;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        }
    }
}