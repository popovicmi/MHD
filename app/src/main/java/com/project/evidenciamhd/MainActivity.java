package com.project.evidenciamhd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public Button buttonTrolejbus;
    /*public ImageButton buttonAutobus = findViewById(R.id.imageAutobusy);*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTrolejbus = findViewById(R.id.trolejbus);



        buttonTrolejbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TrolejbusVyhladavanie.class));
            }
        });

    }
}
