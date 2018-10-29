package com.example.androiduser.attendancemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        final TextView textView6 = (TextView) findViewById(R.id.textview6);

        final TextView textView1 = (TextView) findViewById(R.id.textview1);
        final TextView textView2 = (TextView) findViewById(R.id.textview2);
        final TextView textView3 = (TextView) findViewById(R.id.textview3);
        final TextView textView4 = (TextView) findViewById(R.id.textview4);
        final TextView textView5 = (TextView) findViewById(R.id.textview5);

        textView1.setText("Tejas");
        textView2.setText("Chandan");
        textView3.setText("Divyansh");
        textView4.setText("Manoj");
        textView5.setText("Aman");
        textView6.setText("0 Present 5 Absent");

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                if(checkBox1.isChecked())
                    count++;
                if(checkBox2.isChecked())
                    count++;
                if(checkBox3.isChecked())
                    count++;
                if(checkBox4.isChecked())
                    count++;
                if(checkBox5.isChecked())
                    count++;

                String string = count+" Present "+(5-count)+" Absent";
                textView6.setText(string);
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                if(checkBox1.isChecked())
                    count++;
                if(checkBox2.isChecked())
                    count++;
                if(checkBox3.isChecked())
                    count++;
                if(checkBox4.isChecked())
                    count++;
                if(checkBox5.isChecked())
                    count++;

                String string = count+" Present "+(5-count)+" Absent";
                textView6.setText(string);
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                if(checkBox2.isChecked())
                    count++;
                if(checkBox1.isChecked())
                    count++;
                if(checkBox3.isChecked())
                    count++;
                if(checkBox4.isChecked())
                    count++;
                if(checkBox5.isChecked())
                    count++;

                String string = count+" Present "+(5-count)+" Absent";
                textView6.setText(string);
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                if(checkBox2.isChecked())
                    count++;
                if(checkBox3.isChecked())
                    count++;
                if(checkBox4.isChecked())
                    count++;
                if(checkBox1.isChecked())
                    count++;
                if(checkBox5.isChecked())
                    count++;

                String string = count+" Present "+(5-count)+" Absent";
                textView6.setText(string);
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                if(checkBox2.isChecked())
                    count++;
                if(checkBox3.isChecked())
                    count++;
                if(checkBox4.isChecked())
                    count++;
                if(checkBox1.isChecked())
                    count++;
                if(checkBox5.isChecked())
                    count++;

                String string = count+" Present "+(5-count)+" Absent";
                textView6.setText(string);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
            }
        });


    }
}
