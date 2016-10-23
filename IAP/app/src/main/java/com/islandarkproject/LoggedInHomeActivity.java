package com.islandarkproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoggedInHomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in_home);


    }

    /** Called when the user clicks the logout button */
    public void goToLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the change user settings button */
    public void goToChangeUserSettings(View view) {
        Intent intent = new Intent(this, ChangeUserSettings.class);
        startActivity(intent);
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
    public void goToLogOut(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.closing))
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage(getString(R.string.closing_msg))
                .setCancelable(false) // Sets this dialog non-cancelable with the BACK key
                .setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        LoggedInHomeActivity.this.finish();
                    }
                })
                .setNegativeButton(getString(R.string.no), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }
}
