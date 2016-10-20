package com.jc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    CanvasDemo canvasDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canvasDemo= (CanvasDemo) findViewById(R.id.my_canvas);
    }

}
