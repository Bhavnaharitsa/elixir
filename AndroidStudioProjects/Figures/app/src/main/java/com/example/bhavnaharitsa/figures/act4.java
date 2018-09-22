package com.example.bhavnaharitsa.figures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.channels.FileLock;

public class act4 extends AppCompatActivity {
    EditText et;
    EditText et1;
    Button result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        et=(EditText)findViewById(R.id.et);
        et1=(EditText)findViewById(R.id.et1);
        result=(Button)findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String height1 = et.getText().toString();
                String weight1 = et1.getText().toString();

                if (height1 != null && !"".equals(height1) && (weight1 != null && !"".equals(weight1))) {
                    float height2 = Float.parseFloat(height1) / 100;
                    float weight2 = Float.parseFloat(weight1);
                    float bmi = weight2 / (height2 * height2);

                    displayBMI(bmi);

                }

            }

            public void displayBMI(float bmi) {
                String bmilabel = "";


                if (Float.compare(bmi, 15f) <= 0)
                    bmilabel = getString(R.string.veryseverelyaffected);
                else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0)
                    bmilabel = getString(R.string.affected);
                else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18f) <= 0)
                    bmilabel = getString(R.string.underweight);
                else if (Float.compare(bmi, 18f) > 0 && Float.compare(bmi, 20f) <= 0)
                    bmilabel =getString(R.string.normal);
                else if (Float.compare(bmi, 20f) > 0 && Float.compare(bmi, 24f) <= 0)
                    bmilabel = getString(R.string.healthy);
                else if (Float.compare(bmi,24f)>0 && Float.compare(bmi,26f)<=0)
                    bmilabel = getString(R.string.veryhealthy);
                else if (Float.compare(bmi,26f)>0 && Float.compare(bmi,28f)<=0)
                    bmilabel=getString(R.string.overweight);
                else if (Float.compare(bmi,28f)>0 && Float.compare(bmi,30f)<=0)
                    bmilabel=getString(R.string.obese);
                else
                    bmilabel=getString(R.string.severelyobese);

                bmilabel = bmi + "\n\n\n" + bmilabel;
                result.setText(bmilabel);
                    }
                });
            }



    }