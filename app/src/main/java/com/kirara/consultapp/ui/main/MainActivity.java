package com.kirara.consultapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kirara.consultapp.R;
import com.kirara.consultapp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity{
    private final String TAG = "mainActivity";

    private Button mButtonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        TextView mTextView = findViewById(R.id.textView);
        mButtonNext = findViewById(R.id.buttonNext);
    }

    public void onBtnClick(View v){

    }

}