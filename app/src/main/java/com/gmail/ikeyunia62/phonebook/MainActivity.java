package com.gmail.ikeyunia62.phonebook;

import android.support.v7.app.AppCompatActivity;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText nama, telepon;
    TextView dataTelepon;
    Button tombolInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.editNama);
        telepon = (EditText) findViewById(R.id.editTelepon);
        dataTelepon = (TextView) findViewById(R.id.DataTelp);
        tombolInput = (Button) findViewById(R.id.buttonInput);

        tombolInput.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                        generated method stub
                byte[] bufferNama = new byte[30];
                byte[] bufferTelepon = new byte[15];
//menyalin data ke buffer
                salinData(bufferNama, nama.getText().toString());
                salinData(bufferTelepon, telepon.getText().toString());
        }
    }

}
