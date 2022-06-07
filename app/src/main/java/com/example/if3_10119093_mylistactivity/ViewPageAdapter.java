package com.example.if3_10119093_mylistactivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
public class ViewPageAdapter extends AppCompatActivity{
    private ViewPager viewPage;
    private ArrayList<MyModel> modelArrayList;
    private MyAdapter myAdapter;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpage);

        viewPage = findViewById(R.id.viewPager);
        loadCards();

        viewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                String title = modelArrayList.get(position).getTitlw();

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPageAdapter.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadCards() {
        modelArrayList = new ArrayList<>();

        modelArrayList.add(new MyModel("Title 01","Desc 02",R.drawable.information));
        modelArrayList.add(new MyModel("Title 02","Desc 02",R.drawable.easy));
        modelArrayList.add(new MyModel("Title 03","Desc 02",R.drawable.to));

        myAdapter = new MyAdapter(this,modelArrayList);
        viewPage.setAdapter(myAdapter);
        viewPage.setPadding(100,0,100,0);
    }
}
