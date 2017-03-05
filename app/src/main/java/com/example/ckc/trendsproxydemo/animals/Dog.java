package com.example.ckc.trendsproxydemo.animals;


import android.content.Context;
import android.widget.Toast;

import com.example.ckc.trendsproxydemo.impl.LimbsShower;

/**
 * Created by ckc on 2017/3/5.
 */

public class Dog extends Animal implements LimbsShower {
    private Context context;
    public Dog(Context context){
        name="狗";
        this.context=context;
    }

    @Override
    public void showLimbs() {
        Toast.makeText(context,getName()+"有"+getLegs()+"条腿"+getEars()+"只耳朵",Toast.LENGTH_LONG).show();
    }
}
