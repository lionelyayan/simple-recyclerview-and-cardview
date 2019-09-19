package com.example.wisatabandung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    private ImageView img;
    private TextView Nama, Detail;

    private int sFoto;
    private String sNama, sDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.imgFoto);
        Nama = findViewById(R.id.tvName);
        Detail = findViewById(R.id.tvDetail);

        model mmodel = new model();

        sFoto = getIntent().getIntExtra("foto", mmodel.getFoto());
        sNama = getIntent().getStringExtra("nama");
        sDetail = getIntent().getStringExtra("detail");

        Glide.with(this)
                .load(sFoto)
                .into(img);

        Nama.setText(sNama);
        Detail.setText(sDetail);
    }
}
