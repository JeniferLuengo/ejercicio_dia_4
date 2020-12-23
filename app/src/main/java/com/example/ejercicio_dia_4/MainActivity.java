package com.example.ejercicio_dia_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d ("MainActivity",  " onCreate");
        Toast.makeText(this,"Bienvenido", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d ( "MainActivity", " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d ("MainActivity", " onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d ( "MainActivity",  " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d ( "MainActivity", " onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d ( "MainActivity",  " onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d ("MainActivity", " onDestroy");

        Toast.makeText(this,"Hasta Pronto", Toast.LENGTH_LONG).show();
    }
}




