package com.example.ckc.trendsproxydemo.graphs;

import android.content.Context;
import android.widget.Toast;

import com.example.ckc.trendsproxydemo.impl.GraphShower;

/**
 * Created by ckc on 2017/3/5.
 */

public class Triangle extends Graph implements GraphShower{
    private Context context;
    public Triangle(Context context){
        sideSize=3;
        name="三角形";
        this.context=context;
    }

    @Override
    public void showSides() {
        Toast.makeText(context,name+"有"+sideSize+"条边",Toast.LENGTH_LONG).show();
    }
}
