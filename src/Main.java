import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih;
        int input;

        do {
            input = 0;
            Scanner keyboard = new Scanner(System.in);

            System.out.println("==== Menu ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            pilih = keyboard.nextInt();

            switch (pilih){
                case 1:
                    System.out.print("Masukan nama mahasiswa : ");
                    String nama = keyboard.next();

                    System.out.print("Masukan NIM mahasiswa : ");
                    long nim = keyboard.nextLong();

                    while(String.valueOf(nim).length() != 15){
                        System.out.println("NIM harus 15 digit");
                        System.out.print("Masukan NIM mahasiswa : ");
                        nim = keyboard.nextLong();
                    }

                    System.out.print("Masukan jurusan mahasiswa : ");
                    String jurusan = keyboard.next();

                    classMahasiswa.addDaftarMahasiswa(nama, nim, jurusan);

                    System.out.print("\n");
                    input = 1;
                    break;
                case 2:
                    System.out.println("Data Mahasiswa :");

                    classMahasiswa.tampilUniversitas();
                    classMahasiswa.tampilDataMahasiswa();


                    System.out.print("\n");
                    input = 1;
                    break;
                case 3:
                    System.out.println("Sayonara~");

                    break;
                default:
                    System.out.println("Input anda salah");
                    input = 1;
                    break;
            }
        } while (input == 1);

    }
    }
