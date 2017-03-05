package com.example.ckc.trendsproxydemo.animals;


import android.content.Context;
import android.widget.Toast;

import com.example.ckc.trendsproxydemo.impl.LimbsShower;

/**
 * Created by ckc on 2017/3/5.
 */

public class Fish extends Animal implements LimbsShower {
    private Context context;
    public Fish(Context context){
        legs=0;
        name="鱼";
        this.context=context;
    }

    @Override
    public void showLimbs() {
        Toast.makeText(context,getName()+"有"+getLegs()+"条腿"+getEars()+"只耳朵",Toast.LENGTH_LONG).show();
    }
}
