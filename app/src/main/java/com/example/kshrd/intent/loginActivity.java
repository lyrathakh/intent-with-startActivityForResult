package com.example.kshrd.intent;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtdes= (TextView) findViewById(R.id.str);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle extra= getIntent().getExtras();
        if(extra != null){
            String name= extra.getString("name");
            int age=extra.getInt("age");
            txtdes.setText("asdfads");
        }
    }
}
