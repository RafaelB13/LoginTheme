package com.example.aplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnEntrar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //alert("Botão de Login");

                mostrarToast("Design by Rafael Borges");
            }
        });

        TextView txtEsqueciMinhaSenha = (TextView) findViewById(R.id.textEsqueceuSenha);
        txtEsqueciMinhaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast("Esqueci minha senha");
            }
        });

        TextView txtRegistrarConta = (TextView) findViewById(R.id.textRegistrarConta);
        txtRegistrarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast("Registrar Nova Conta");
            }
        });

        CheckBox checkBoxConectado = (CheckBox) findViewById(R.id.checkConectado);
        checkBoxConectado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast("Continuar Conectado");
            }
        });
    }


    public void mostrarToast(String toast){
        Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
    }

    //Metodo Alert
    public void alert(String text){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("RF1");
        alertDialog.setMessage(text);
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
