package com.pi.drowsinessdetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.MultiDex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private Button start;
    SeekBar s;
    TextView ttv;
    private String key_2 = "driver project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        s = findViewById(R.id.seekBar2);
        ttv = findViewById(R.id.textView21);


        if(s.getProgress() == 0)
        {
            ttv.setText("0.5 second");
        }
        else if(s.getProgress() == 1)
        {
            ttv.setText("0.75 second");
        }
        else if(s.getProgress() == 2)
        {
            ttv.setText("1 seconds");
        }
        else if(s.getProgress() == 3)
        {
            ttv.setText("1.25 seconds");
        }
        else if(s.getProgress() == 4)
        {
            ttv.setText("1.5 seconds");
        }
        else if(s.getProgress() == 5)
        {
            ttv.setText("1.75 seconds");
        }
        else if(s.getProgress() == 6)
        {
            ttv.setText("2 seconds");
        }
        else if(s.getProgress() == 7)
        {
            ttv.setText("2.25 seconds");
        }
        else
        {
            ttv.setText("2.5 seconds");
        }
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                if(s.getProgress() == 0)
                {
                    ttv.setText("0.5 second");
                }
                else if(s.getProgress() == 1)
                {
                    ttv.setText("0.75 second");
                }
                else if(s.getProgress() == 2)
                {
                    ttv.setText("1 seconds");
                }
                else if(s.getProgress() == 3)
                {
                    ttv.setText("1.25 seconds");
                }
                else if(s.getProgress() == 4)
                {
                    ttv.setText("1.5 seconds");
                }
                else if(s.getProgress() == 5)
                {
                    ttv.setText("1.75 seconds");
                }
                else if(s.getProgress() == 6)
                {
                    ttv.setText("2 seconds");
                }
                else if(s.getProgress() == 7)
                {
                    ttv.setText("2.25 seconds");
                }
                else
                {
                    ttv.setText("2.5 seconds");
                }


            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),DetectionActivity.class);
                i.putExtra("senstivity",""+s.getProgress());
                i.putExtra(key_2,DateFormat.getDateTimeInstance().format(new Date()));
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();

            }
        });
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MultiDex.install(this);
    }


}