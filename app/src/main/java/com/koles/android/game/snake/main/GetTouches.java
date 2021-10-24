package com.koles.android.game.snake.main;

import android.util.Log;

public class GetTouches implements Runnable{

    Thread thread;
    String text;

    public GetTouches(){
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {
        text = "thread is working!";
        System.out.println("GetTouches run()");
    }


}
