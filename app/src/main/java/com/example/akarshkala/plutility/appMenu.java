package com.example.akarshkala.plutility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class appMenu extends AppCompatActivity {

    public TextView Display;
    public Button tambola;
    public Button tds;
    public Button dc;
    public Button uti;
    public EditText chatbot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_menu);

        Display = (TextView) findViewById(R.id.nameDisplay);
        String uname = getIntent().getStringExtra("pass");

        Display.setText("Hello "+ uname);


        tambola= (Button) findViewById(R.id.tambolaBtn);
        tds= (Button) findViewById(R.id.tdsBtn);
        dc= (Button) findViewById(R.id.dcBtn);
        uti= (Button) findViewById(R.id.utilitiesBtn);
        chatbot= (EditText) findViewById(R.id.chatField);


        tambola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(appMenu.this,tambolaScreen.class);
                startActivity(intent);

            }
        });

        tds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        uti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });







    }
}
