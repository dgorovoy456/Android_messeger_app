package com.example.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage (View view) {
        EditText text = (EditText) findViewById(R.id.editText);
        String messageText = text.getText().toString();
        //Intent intent = new Intent(this , ReceiveMessageActivity.class);
        //intent.putExtra(ReceiveMessageActivity.NOTIFICATION_SERVICE,messageText);
        //startActivity(intent);
        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.setType("text/plain");
        intent1.putExtra(Intent.EXTRA_TEXT,messageText);
        ////startActivity(intent1);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent1,chooserTitle);
        startActivity(chosenIntent);




    }
}
