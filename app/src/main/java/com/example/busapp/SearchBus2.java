package com.example.busapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchBus2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchBus2 extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView datetxt;
    TextView e1,e2;
    Spinner busroute,busroute2;
    Button b1,b2;
    private int mYear, mMonth, mDay;
    String d;

    public SearchBus2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchBus2.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchBus2 newInstance(String param1, String param2) {
        SearchBus2 fragment = new SearchBus2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_search_bus2, container, false);

        e1=(TextView)v.findViewById(R.id.editText);
        e2=(TextView)v.findViewById(R.id.editText3);
        busroute=(Spinner)v.findViewById(R.id.spinner);
        busroute2=(Spinner)v.findViewById(R.id.spinner2);
        datetxt=(TextView)v.findViewById(R.id.editTextTextPersonName3);
        b1=(Button)v.findViewById(R.id.button5);
        b2=(Button)v.findViewById(R.id.button7);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
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

            Intent search2=new Intent(getActivity(),Login.class);
            startActivity(search2);
        }


    }
}