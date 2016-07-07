package com.joshsoftware.justask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class splash extends AppCompatActivity {
    public static String MSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    public void verify(View view)
    {
        EditText phone = (EditText)findViewById(R.id.phoneNumber);
        MSG=phone.getText().toString();
        if(MSG.length()==10)
        {
            Intent intent = new Intent(this,userInfo.class);
            intent.putExtra("phone",MSG);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Enter correct phone number",Toast.LENGTH_SHORT).show();
        }
    }
}
