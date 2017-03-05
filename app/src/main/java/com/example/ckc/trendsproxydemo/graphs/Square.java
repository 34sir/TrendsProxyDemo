package com.example.ckc.trendsproxydemo.graphs;

import android.content.Context;
import android.widget.Toast;

import com.example.ckc.trendsproxydemo.impl.GraphShower;

/**
 * Created by ckc on 2017/3/5.
 */

public class Square extends Graph implements GraphShower{
    private Context context;
    public Square(Context context){
        sideSize=4;
        name="正方形";
        this.context=context;
    }

    @Override
    public void showSides() {
        Toast.makeText(context,name+"有"+sideSize+"条边",Toast.LENGTH_LONG).show();
    }
}
