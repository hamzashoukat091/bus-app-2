package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class SearchBus extends AppCompatActivity implements View.OnClickListener {

    TextView datetxt;
    TextView e1,e2;
    Spinner busroute,busroute2;
    Button b1,b2;
    private int mYear, mMonth, mDay;
    String d;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bus);

        e1=(TextView)findViewById(R.id.editText);
        e2=(TextView) findViewById(R.id.editText3);
        busroute=(Spinner) findViewById(R.id.spinner);
        busroute2=(Spinner) findViewById(R.id.spinner2);
        datetxt=(TextView)findViewById(R.id.editTextTextPersonName3);
        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button7);

       b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth){

                            d=dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;
                            datetxt.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if(v==b2)
        {

            String departure=busroute.getSelectedItem().toString();
            String arrival=busroute2.getSelectedItem().toString();

            Intent search=new Intent(SearchBus.this,Login.class);
            startActivity(search);
        }


    }
}