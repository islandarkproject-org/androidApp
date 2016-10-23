package com.islandarkproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    /** Called when the user clicks the button */
    public void goToLoginOrRegister(View view) {
        Intent intent = new Intent(this, LoginOrRegisterActivity.class);
        startActivity(intent);
    }

}
