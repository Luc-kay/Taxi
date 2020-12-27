package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Anim extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);

        Thread thread = new Thread()
        {
            @Override
            public void run () {
                super.run();
                {
                    try{
                   sleep(5000);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                        finally {
                            Intent welcomeIntent = new Intent(Anim.this, Vhod.class);
                            startActivity(welcomeIntent);
                        }

                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause () {
        super.onPause();

        finish();
    }

}