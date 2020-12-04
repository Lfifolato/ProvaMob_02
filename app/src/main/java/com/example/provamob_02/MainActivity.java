package com.example.provamob_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.ajuda) {
            Toast.makeText(
                    getApplicationContext(),
                    "Ajuda da Aplicação",
                    Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.sair) {
            Toast.makeText(
                    getApplicationContext(),
                    "Sair da Aplicação",
                    Toast.LENGTH_LONG).show();
            finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

}