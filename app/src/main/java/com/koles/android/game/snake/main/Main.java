package com.koles.android.game.snake.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Main extends Activity {

    private TextView textView;
    private GetTouches getTouches;
    String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        /*getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        super.onCreate(savedInstanceState);
        textView = new TextView(this);

        getTouches = new GetTouches();
        textView.setText("Hello World Snake");
        text = getTouches.text;
        textView.setText(text);
        setContentView(textView);
    }
}
