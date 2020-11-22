/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan51.gajikaryawan;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan Gaji Karyawan
 */
public class IF110119004Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Manager manager = new Manager();
        Karyawan karyawan = new Karyawan();
        
        System.out.println("====PROGRAM PERHITUNGAN GAJI KARYAWAN====");
        System.out.print("Masukkan NIK : ");
        karyawan.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        karyawan.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        karyawan.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        System.out.println();
        
        int golongan = karyawan.getGolongan();
        String jabatan = karyawan.getJabatan();
        int kehadiran = manager.getKehadiran();
        System.out.println("====HASIL PERHITUNGAN====");
        System.out.println("NIK\t : " + karyawan.getNik());
        System.out.println("NAMA\t : " + karyawan.getNama());
        System.out.println("GOLONGAN : " + golongan);
        System.out.println("JABATAN\t : " + jabatan);
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN\t: " + manager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN\t: " + manager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + manager.tunjanganKehadiran(kehadiran));
        
        System.out.println("Gaji Total\t\t: " + manager.gajiTotal());
    }
    
}
