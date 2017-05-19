package com.example.kshrd.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btnLogin;
    Button btnGoogle;
    Button  btnstartforresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin= (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,loginActivity.class);
                i.putExtra("name","lyratha");
                i.putExtra("age",123456);
                startActivity(i);
            }
        });
        btnGoogle= (Button) findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://facebook.com"));

                Intent chooser= Intent.createChooser(i,"Choosing");
                if(chooser.resolveActivity(getPackageManager()) != null){

                    startActivity(i);
                }
            }
        });
        btnstartforresult= (Button) findViewById(R.id. btnstartforresult);
        btnstartforresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ForResultActitivity.class);
                List<Person> plist=new ArrayList<>();
                plist.add(new Person(1,"data"));
                plist.add(new Person(2,"dara"));
                startActivityForResult(intent,REQUEST_CODE);
            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE){
            if(resultCode==RESULT_OK){

            }
        }
    }
}
