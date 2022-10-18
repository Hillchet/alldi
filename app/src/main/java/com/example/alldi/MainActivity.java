package com.example.alldi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder albd=new AlertDialog.Builder(MainActivity.this);
                albd.setTitle("Ogohlantirish Xabari");
                albd.setIcon(R.drawable.exi9t);
                albd.setMessage("Haqitattdanhmma Dasturni Sossitojakmisiz");
                albd.setCancelable(false);

                albd.setPositiveButton("Yees", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                albd.setNegativeButton("NNoo", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Siz No Tugmasini Sossitdingizki Ay Sizniiii", Toast.LENGTH_SHORT).show();
                    }
                });
                albd.setNeutralButton("Cancell", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Siz Cancell Tugmasini Sossitdingiz Ay Sizniiii", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialognew=albd.create();
                alertDialognew.show();
            }
        });
    }
}