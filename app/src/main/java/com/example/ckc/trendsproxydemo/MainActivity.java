package com.example.ckc.trendsproxydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ckc.trendsproxydemo.animals.Chicken;
import com.example.ckc.trendsproxydemo.animals.Fish;
import com.example.ckc.trendsproxydemo.graphs.Circle;
import com.example.ckc.trendsproxydemo.impl.GraphShower;
import com.example.ckc.trendsproxydemo.impl.LimbsShower;
import com.example.ckc.trendsproxydemo.proxy.ProxyHandler;
import com.example.ckc.trendsproxydemo.proxy.ShowerProxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*动态代理测试*/
        ProxyHandler proxy=new ProxyHandler();
        LimbsShower shower= (LimbsShower) proxy.bind(new Chicken(this));
        shower.showLimbs();
        GraphShower graphShower= (GraphShower) proxy.bind(new Circle(this));
        graphShower.showSides();
        /*动态代理测试*/

        /*静态代理测试*/
        ShowerProxy showerProxy=new ShowerProxy(new Fish(this));
        showerProxy.showLimbs();
        /*静态代理测试*/
    }
}
