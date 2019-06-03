package com.example.hw_shape_s;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hw_shape_s.Model.User;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    TextView tvdate;
    EditText edfirstname, edlastname, edyouemail, edreemail, ednewpassword;
    Button btncreate;
    RadioGroup rdGroup;
    RadioButton gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pushFullScreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdate = findViewById(R.id.tvDate);

        edfirstname = findViewById(R.id.edFirstname);
        edlastname = findViewById(R.id.edLastname);
        edyouemail = findViewById(R.id.edYouremail);
        edreemail = findViewById(R.id.edReemail);
        ednewpassword = findViewById(R.id.edNewpassword);
        btncreate = findViewById(R.id.btnCreate);
        rdGroup = findViewById(R.id.rdGroup);


        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = edfirstname.getText().toString();
                String lastname = edlastname.getText().toString();
                String youemail = edyouemail.getText().toString();
                String reemail = edreemail.getText().toString();
                String newpassword = ednewpassword.getText().toString();

                int se= rdGroup.getCheckedRadioButtonId();
                gender = findViewById(se);
                String ge = gender.getText().toString();
                String de = tvdate.getText().toString();


                User user = new User();
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setYouemail(youemail);
                user.setReemail(reemail);
                user.setNewpassword(newpassword);
                user.setGender(ge);
                user.setDate(de);

                Bundle bundle = new Bundle();
                bundle.putParcelable("user",user);
                Intent intent = new Intent(MainActivity.this,create_Activity.class);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
    private  void pushFullScreen(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void PickDate(View view) {
        createDatePicker().show();
    }

    private DatePickerDialog createDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int yyyy = calendar.get(calendar.YEAR);
        return new DatePickerDialog(this, this, yyyy, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String mm = month + 1 < 10 ? "0" + (month + 1) : (month + 1) + "";
        String day = dayOfMonth < 10 ? "0" + dayOfMonth : "" + dayOfMonth;
        tvdate.setText(day + "/" + mm + "/" + year);
   
    }

}
