package com.example.intentlistviewga;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int imageRes = getIntent().getIntExtra("imageRes", R.mipmap.ic_launcher);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailName = findViewById(R.id.detailName);
        TextView detailDesc = findViewById(R.id.detailDesc);

        detailImage.setImageResource(imageRes);
        detailName.setText(name);
        detailDesc.setText(description);
    }
}