package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

                  // name,username,phoneno,password
    TextInputLayout  e1,e2,e3,e4;
    TextView busroutetext;
    Button b1,b2;
    Spinner busroute;

    DatabaseReference registerDbRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    e1=(TextInputLayout)findViewById(R.id.name);
    e2=(TextInputLayout)findViewById(R.id.UsernameSignup);
    e3=(TextInputLayout)findViewById(R.id.phonenumber);
    e4=(TextInputLayout)findViewById(R.id.Passwordsignup);
    busroute=(Spinner) findViewById(R.id.spinner);

    registerDbRef= FirebaseDatabase.getInstance().getReference().child("Register");


    b1=(Button)findViewById(R.id.b1);
//    final PopupMenu popupMenu=new PopupMenu(MainActivity.this,busroute);
//    MenuInflater menuInflater = popupMenu.getMenuInflater();
//    menuInflater.inflate(R.menu.dropdownbusselection, popupMenu.getMenu());

        String fullname=e1.getEditText().getText().toString();
        String phone=e3.getEditText().getText().toString();
        String user=e2.getEditText().getText().toString();
        String password=e4.getEditText().getText().toString();
        String bus=busroute.getSelectedItem().toString();
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            insertRegister();

        }
    });


    }
    private void insertRegister()
    {
        String fullname=e1.getEditText().getText().toString();
        String phone=e3.getEditText().getText().toString();
        String user=e2.getEditText().getText().toString();
        String password=e4.getEditText().getText().toString();
        String bus=busroute.getSelectedItem().toString();

        Register register=new Register(
                fullname,
                phone,
                user,
                password,
                bus
        );

        registerDbRef.push().setValue(register);

        Intent intent =new Intent(MainActivity.this,Login.class);
        startActivity(intent);
    }

}