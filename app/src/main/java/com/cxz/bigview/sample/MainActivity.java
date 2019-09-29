package com.cxz.bigview.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.cxz.bigviewlib.BigView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BigView bigView = findViewById(R.id.bigView);
        InputStream is = null;
        try {
            is = getResources().getAssets().open("big.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        bigView.setImage(is);

    }

}
