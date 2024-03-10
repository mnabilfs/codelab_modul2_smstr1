public class classMahasiswa {
    String nama, jurusan;
    long nim;

    classMahasiswa(String nama, long nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static String tampilUniversitas() {
        return "Universitas Muhammadiyah Malang";
    }

    static classMahasiswa[] daftarMahasiswa = new classMahasiswa[100];
    static int jumlahMahasiswa = 0;

    public static void addDaftarMahasiswa(String nama, long nim, String jurusan) {
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            classMahasiswa mhswBaru = new classMahasiswa(nama, nim, jurusan);
            daftarMahasiswa[jumlahMahasiswa] = mhswBaru;
            jumlahMahasiswa++;
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas data mahasiswa penuh.");
        }
    }

    public static void tampilDataMahasiswa() {
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada data mahasiswa yang dimasukkan.");
        } else {
            System.out.println("Data Mahasiswa:");
            System.out.println( tampilUniversitas());
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Nama: " + daftarMahasiswa[i].nama + ", NIM: " + daftarMahasiswa[i].nim + ", Jurusan: " + daftarMahasiswa[i].jurusan);
            }
        }
    }
}