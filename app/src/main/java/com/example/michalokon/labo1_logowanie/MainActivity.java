package com.example.michalokon.labo1_logowanie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        Log.d("Proba", "Wiadomosc");
        Toast temp = Toast.makeText(getApplicationContext(), "Cześć!", Toast.LENGTH_LONG);
        temp.show();
    }
}
