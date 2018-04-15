package com.imad.imrich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button);

    }

    public void but1(View view) {
        mButton.setText(R.string.bt1);
        mButton.setText(R.string.bu2);
        mButton.setText(R.string.bu3);


    }
}
