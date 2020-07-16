package com.example.recyclerview_ryan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Rendang");
        fotoMahasiswa.add("https://uprint.id/blog/wp-content/uploads/2016/11/resep-rendang-padang.jpg");
        infoMahasiswa.add("Tersedia Rendang :\n\n" +
                "1.\tRendang Ayam\n\n" +
                "2.\tRendang Daging\n\n" +
                "3.\tRendang Ular\n\n" +
                "4.\tRendang Kambing\n\n" +
                "5.\tRendang Kelinci\n\n");
        kelasMahasiswa.add("");

        namaMahasiswa.add("Soto");
        fotoMahasiswa.add("https://cdns.klimg.com/merdeka.com/i/w/news/2019/09/16/1109675/540x270/3-resep-soto-medan-mulai-soto-medan-daging-ayam-sampai-bening-rev-1.jpg");
        infoMahasiswa.add("Tersedia Soto :\n\n" +
                "1.\tSoto Babat\n\n" +
                "2.\tSoto Ayam\n\n" +
                "3.\tSoto Daging\n\n" +
                "4.\tSoto Betawi\n\n" +
                "5.\tSoto Lamongan\n\n");
        kelasMahasiswa.add("");

        namaMahasiswa.add("Sate");
        fotoMahasiswa.add("https://lh3.googleusercontent.com/proxy/ghgcvpzCc41lXJiSits1Hchja1H0c9b357x5g9GAV4dogp7bQCAZz2dl1PtGGdKz0FRdH4NNzJ9bHoPhV0IRaaj_kBst93pkGHb7M85HEDTkKgA");
        infoMahasiswa.add("Tersedia Sate :\n\n" +
                "1.\tSate Ayam\n\n" +
                "2.\tSate Sapi\n\n" +
                "3.\tSate Kambing\n\n" +
                "4.\tSate Kadal\n\n" +
                "5.\tSate Kelinci\n\n" +
                "6.\tSate Ular\n\n");
        kelasMahasiswa.add("");

        namaMahasiswa.add("Ayam Bakar");
        fotoMahasiswa.add("https://www.masakapahariini.com/wp-content/uploads/2018/04/resep_ayam_bakar_kecap_manis_MAHI-780x440.jpg");
        infoMahasiswa.add("Tersedia Ayam Bakar :\n\n" +
                "1.\tAyam Bakar Ikan\n\n" +
                "2.\tAyam Bakar Madu\n\n" +
                "3.\tAyam Bakar Kecap\n\n" +
                "4.\tAyam Bakar Pedas\n\n" +
                "5.\tAyam Bakar Padang\n\n");
        kelasMahasiswa.add("");

        namaMahasiswa.add("Rica-Rica");
        fotoMahasiswa.add("https://cdn2.tstatic.net/belitung/foto/bank/images/ilustrasi-ayam-rica-rica.jpg");
        infoMahasiswa.add("Tersedia Rica-rica :\n\n" +
                "1.\tRica-Rica Ayam\n\n" +
                "2.\tRica-Rica Sapi\n\n" +
                "3.\tRica-Rica Bebek\n\n" +
                "4.\tRica-Rica Ikan\n\n" +
                "5.\tRica-Rica Kambing\n\n");
        kelasMahasiswa.add("");




        prosesRecyclerViewAdapter();

    }
}

