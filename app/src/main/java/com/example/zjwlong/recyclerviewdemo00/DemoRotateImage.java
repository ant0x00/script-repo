package com.example.zjwlong.recyclerviewdemo00;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class DemoRotateImage extends AppCompatActivity {

    private ImageView infoOperatingIV;
    private Animation operatingAnim;
    LinearInterpolator lin;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_rotate_image);
        infoOperatingIV = (ImageView)findViewById(R.id.infoOperating);
        button = (Button) findViewById(R.id.button);

        operatingAnim = AnimationUtils.loadAnimation(this, R.anim.tip);
        lin = new LinearInterpolator();
        operatingAnim.setInterpolator(lin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmpStr = button.getText().toString();
                if(tmpStr.equals("Start")) {
                    startAnimation();
                    button.setText("Stop");
                }else {
                    infoOperatingIV.clearAnimation();
                    button.setText("Start");
                }
            }
        });

    }

    private void startAnimation()
    {
        if (operatingAnim != null) {
            infoOperatingIV.startAnimation(operatingAnim);
        }
    }

}
