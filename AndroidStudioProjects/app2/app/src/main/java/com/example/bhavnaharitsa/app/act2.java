package com.example.bhavnaharitsa.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class act2 extends AppCompatActivity {
    Button sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        sup=(Button) findViewById (R.id.button);
        sup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(act2.this,act3.class);
                startActivity(intent);

            }
        });

    }
}




