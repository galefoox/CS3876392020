package com.example.menuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_newActivity;
    private Button button_SMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_newActivity = (Button) findViewById(R.id.button_newActivity);
        button_newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }

    public void openNewActivity()
    {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    public void sendSMS(View v)
    {
        final Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("SMS to:" + Uri.encode("12345678912")));
        intent.putExtra("SMS body" , "Gal Foox");
        startActivity(intent);
    }


}