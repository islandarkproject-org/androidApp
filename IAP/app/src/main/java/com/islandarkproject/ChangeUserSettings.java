package com.islandarkproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChangeUserSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_user_settings);
    }

    /** Called when the user clicks the view uploaded content button */
    public void goToViewUploadedContent(View view) {
        Intent intent = new Intent(this, ViewUploadedContent.class);
        startActivity(intent);
    }

    /** Called when the user clicks the upload new content button */
    public void goToUploadNewContent(View view) {
        Intent intent = new Intent(this, UploadNewContent.class);
        startActivity(intent);
    }

    /** Called when the user clicks the upload new content button */
    public void goToChangePassword(View view) {
        Intent intent = new Intent(this, ChangePassword.class);
        startActivity(intent);
    }

    /** Called when the user clicks the home button */
    public void goToLoggedInHome(View view) {
        Intent intent = new Intent(this, LoggedInHomeActivity.class);
        startActivity(intent);
    }

}
