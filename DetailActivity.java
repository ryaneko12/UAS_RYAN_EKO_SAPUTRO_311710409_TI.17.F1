package com.example.recyclerview_ryan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageviewfoto;
    TextView judul, infoMakanan1;
    TextView Textnim;

    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn=(Button)findViewById(R.id.btn);

        Button button = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(activity2Intent);
            }
        });

        imageviewfoto = findViewById(R.id.imageviewfoto);
        judul = findViewById(R.id.judul);
        infoMakanan1 = findViewById(R.id.infoMakanan1);
        Textnim = findViewById(R.id.Textnim);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_Mahasiswa") && getIntent().hasExtra("nama_Mahasiswa") && getIntent().hasExtra("info_Mahasiswa") && getIntent().hasExtra("kelas_Mahasiswa")){

            String fotoMakanan = getIntent().getStringExtra("foto_Mahasiswa");
            String namaMakanan = getIntent().getStringExtra("nama_Mahasiswa");
            String infoMakanan = getIntent().getStringExtra("info_Mahasiswa");
            String kelasMahasiswa = getIntent().getStringExtra("kelas_Mahasiswa");

            setDataActivity(fotoMakanan, namaMakanan, infoMakanan, kelasMahasiswa);

        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String infoMakanan, String kelasMahasiswa){


        Glide.with(this).asBitmap().load(fotoMakanan).into(imageviewfoto);
        judul.setText(namaMakanan);
        infoMakanan1.setText(infoMakanan);
        Textnim.setText(kelasMahasiswa);






    }

}
