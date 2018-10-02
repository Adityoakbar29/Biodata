package com.example.adityoakbar.akbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openTelpon(View v){
        Intent it = new Intent(Intent.ACTION_DIAL);
        startActivity(it);
    }
    public  void openAlamat(View view){
        Uri webpage = (Uri.parse("https://www.google.com/maps/place/Arnia+Hijab+Collecion/@-7.0469384,110.448378,11z/data=!4m5!3m4!1s0x2e708de8b89c15a7:0x81ef3751616eeccd!8m2!3d-7.0292917!4d110.4649786!10m2!1e2!2e9));
                Intent it = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(it);
    }
    public void openEmail(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setData(Uri.parse("mailto:adityoakbar2929@gmail.com"));
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{"Recipent"});
        it.putExtra(Intent.EXTRA_SUBJECT, "Recipent");
        it.putExtra(Intent.EXTRA_TEXT, "Recipent");
        startActivity(it);
    }
}
}
