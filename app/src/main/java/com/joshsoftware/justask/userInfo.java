package com.joshsoftware.justask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class userInfo extends AppCompatActivity {
    public static String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        Intent intent = getIntent();
        text= intent.getStringExtra("phone");
        TextView mobile =(TextView)findViewById(R.id.mobile);
        mobile.setText(text);

    }

    public void submit(View view)
    {
        EditText password = (EditText)findViewById(R.id.password);
        EditText confPass = (EditText)findViewById(R.id.confirmPassword);
        if(password.getText().toString().equals(confPass.getText().toString()))
        {
            Toast.makeText(this,"Password Accepted",Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,verify.class);
            startActivity(i);
        }
        else
            Toast.makeText(this,"Password Rejected",Toast.LENGTH_SHORT).show();

    }
}
