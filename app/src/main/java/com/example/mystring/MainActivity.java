package com.example.mystring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextView tv_result;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        tv_result = findViewById(R.id.tv_result);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "Всё, что нам нужно – это " + Phraser.PhraserGen();
                text.setText(s);
                String left = s.substring(0, s.indexOf("– это") - 1);
                String right = s.substring(s.indexOf("– это") + 7);
                s = Character.toUpperCase(s.charAt(s.indexOf("– это") + 6)) + (right + " - это " + left + ".").toLowerCase();
                tv_result.setText(s);
            }
        });
    }
}