package com.mrrun.bottomtabview.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mrrun.bottomtabview.R;
import com.mrrun.bottomtabview.view.BottomTabView;

public class MainActivity extends AppCompatActivity {

    private BottomTabView bottomtabview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomtabview = findViewById(R.id.bottomtabview);

        bottomtabview.setOnItemClickListener(new BottomTabView.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "view=" + view + ",positon=" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
