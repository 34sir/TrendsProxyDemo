package com.example.ckc.trendsproxydemo.proxy;


import android.content.Context;
import android.widget.Toast;

import com.example.ckc.trendsproxydemo.impl.LimbsShower;

/**
 * Created by ckc on 2017/3/5.
 */

public class ShowerProxy implements LimbsShower {
    //此种属于静态代理  项目类多后不适用
    LimbsShower shower;
    public ShowerProxy(LimbsShower shower){
        this.shower=shower;
    }

    @Override
    public void showLimbs() {

        shower.showLimbs();


    }
}
