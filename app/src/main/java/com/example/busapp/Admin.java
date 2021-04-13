package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {


   private  EditText e1,e2;
  private  Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_admin);

     e1=(EditText)findViewById(R.id.e1);
     e2=(EditText)findViewById(R.id.e2);

     b1=(Button)findViewById(R.id.button2);



     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String user=e1.getText().toString().trim();
             String pass=e2.getText().toString().trim();


             if(TextUtils.isEmpty(user) | TextUtils.isEmpty(pass))
             {
                 Toast.makeText(getApplicationContext(),"Please Fill all field",Toast.LENGTH_LONG).show();
             }
           else
             {
                 if(user.equals("Admin") && pass.equals("Admin"))
                 {
                     Intent intent=new Intent(Admin.this,AdminPannel.class);
                     startActivity(intent);

                 }
                 else{
                     Toast.makeText(getApplicationContext(),"You are not Admin",Toast.LENGTH_LONG).show();

                 }


             }

         }
     });
    }
}