package com.kirara.consultapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kirara.consultapp.R;
import com.kirara.consultapp.ui.Navigation.NavigationActivity;
import com.kirara.consultapp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity{
    private final String TAG = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.main_fragment_container, MainFragment.newInstance())
//                    .commitNow();
//        }

    }

    public void onBtnClick(View v){
        startActivity(new Intent(this, NavigationActivity.class));
    }

}