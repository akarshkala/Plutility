package com.example.akarshkala.plutility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addName extends AppCompatActivity {

    private Button Continue;
    private EditText Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name);


        Name = (EditText) findViewById(R.id.nameField);
        Continue = (Button) findViewById(R.id.enterBtn);


        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String uname = Name.getText().toString();
                Intent intent = new Intent(addName.this, appMenu.class);
                intent.putExtra("pass", uname);
                startActivity(intent);
                finish();
            }
        });
    }
}
