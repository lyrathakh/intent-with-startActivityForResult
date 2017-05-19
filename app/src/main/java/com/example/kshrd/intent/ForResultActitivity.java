package com.example.kshrd.intent;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ForResultActitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result_actitivity);
        setContentView(R.layout.activity_for_result_actitivity);
        Bundle bundle=getIntent().getExtras();
        final List<Person> list=bundle.getParcelableArrayList("arl");

    }

}
