package com.cyberx.imageview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1_id);
        imageView2 = (ImageView) findViewById(R.id.imageView2_id);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView1_id) {
            Toast.makeText(MainActivity.this, "Abdullah", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.imageView2_id) {
            Toast.makeText(MainActivity.this, "Abdullah Nayeem mehedi", Toast.LENGTH_SHORT).show();
        }
    }
}