package com.example.huangming.cyclicviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCyclicViewPager();
    }

    private void showCyclicViewPager() {
        List<View> listView = new ArrayList<>();
        CyclicViewPager viewPager = (CyclicViewPager) findViewById(R.id.cyclicViewPager);
        View view1 = LayoutInflater.from(this).inflate(R.layout.pager1, null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.pager2, null);
        View view11 = LayoutInflater.from(this).inflate(R.layout.pager1, null);
        View view22 = LayoutInflater.from(this).inflate(R.layout.pager2, null);
        listView.add(view1);
        listView.add(view2);
        listView.add(view11);
        listView.add(view22);
        viewPager.setAdapter(new CyclicPagerAdapter(listView));
    }
}
