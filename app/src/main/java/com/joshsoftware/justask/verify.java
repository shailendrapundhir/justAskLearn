package com.joshsoftware.justask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void verifyPin(View view)
    {
        EditText t=(EditText)findViewById(R.id.verificationText);
        String x= t.getText().toString();
        Toast.makeText(this," "+x,Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, profile.class);
        startActivity(i);
    }
}
