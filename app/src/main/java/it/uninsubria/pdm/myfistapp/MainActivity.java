package it.uninsubria.pdm.myfistapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linearlayout);
    }
    public void sendMessage(View view)
    {
        EditText message_edittext = (EditText) findViewById(R.id.editText2);//modifica in base al nome layout
        String message = message_edittext.getText().toString();

        Uri uri = Uri.parse("smsto:0800000123");
        Intent it = new Intent(Intent.ACTION_SENDTO,uri);
        it.putExtra("sms_body",message);
        startActivity(it);
    }
}

