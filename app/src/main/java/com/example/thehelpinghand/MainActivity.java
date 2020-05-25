package com.example.thehelpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Dbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dbutton = findViewById(R.id.donationButton);

        Dbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDonationPage();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }



    public void openDonationPage(){
        Intent intent = new Intent(this, DonationPage.class);
        startActivity(intent);
    }
}
