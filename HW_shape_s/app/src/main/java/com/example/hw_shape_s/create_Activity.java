package com.example.hw_shape_s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hw_shape_s.Model.User;

public class create_Activity extends AppCompatActivity {

    TextView tvfirstname,tvlastname,tvyouemail,tvreemail,tvnewpassword,tvgender,tvdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        tvfirstname = findViewById(R.id.tvfirstname);
        tvlastname = findViewById(R.id.tvLastname);
        tvyouemail = findViewById(R.id.tvYouremail);
        tvreemail = findViewById(R.id.tvReemail);
        tvnewpassword = findViewById(R.id.tvNewpassword);
        tvgender = findViewById(R.id.tvGender);
        tvdate = findViewById(R.id.tvDate);

        Intent intent =  getIntent();
        User user = intent.getParcelableExtra("user");
        tvfirstname.setText(""+user.getFirstname());
        tvlastname.setText(""+user.getLastname());
        tvyouemail.setText(""+user.getYouemail());
        tvreemail.setText(""+user.getReemail());
        tvnewpassword.setText(""+user.getNewpassword());
        tvgender.setText(""+user.getGender());
        tvdate.setText(""+user.getDate());
        }
    }

