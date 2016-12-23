package com.example.admin.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    TextView tv;
    public void catchData(String date){
        tv.setText("selected: "+date);

    }
    public  void catchData1(String time){
        tv.setText("selected: "+time);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);

        tv=(TextView) findViewById(R.id.textview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show alert dialog group
                MyDialogFragment myDialogFragment=new MyDialogFragment();
                myDialogFragment.show(getSupportFragmentManager(),null);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                MyProgressDialog myProgressDialog=new MyProgressDialog();
                myProgressDialog.show(getSupportFragmentManager(),null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyDatePicker myDatePicker=new MyDatePicker();
                myDatePicker.show(getSupportFragmentManager(),null);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimePicker myTimePicker=new MyTimePicker();
                myTimePicker.show(getSupportFragmentManager(),null);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomDialog myCustomDialog=new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(),null);
            }
        });
    }
}

