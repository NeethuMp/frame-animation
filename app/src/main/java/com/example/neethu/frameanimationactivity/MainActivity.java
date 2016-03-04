package com.example.neethu.frameanimationactivity;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView= (ImageView) findViewById(R.id.anim_view);
        animationView.setBackgroundResource(R.drawable.animation);
        AnimationDrawable frameAnimation= (AnimationDrawable) animationView.getBackground();
        frameAnimation.start();
    }
}
