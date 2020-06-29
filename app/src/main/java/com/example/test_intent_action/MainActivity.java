package com.example.test_intent_action;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_11;
    Button btn_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_11 = findViewById(R.id.et_1);
        btn_11 = findViewById(R.id.btn_1);

        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = et_11.getText().toString();
                Intent x = new Intent();
                x.setAction(Intent.ACTION_DIAL);
                Uri y = Uri.parse("tel"+number);
                x.setData(y);
                startActivity(x);
            }
        });


    }
}
