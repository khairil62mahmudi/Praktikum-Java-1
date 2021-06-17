package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String [] args) throws ParseException {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(polaTanggal);
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630324";
        mahasiswa.nama = "Khairil Mahmudi";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("14-05-2000");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usia : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19630324","Khairil Mahmudi","14-05-2000");
        mahasiswa2.tampilkanAtribut();

    }
}
