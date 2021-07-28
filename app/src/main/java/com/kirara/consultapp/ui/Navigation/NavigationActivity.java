package com.kirara.consultapp.ui.Navigation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kirara.consultapp.R;

public class NavigationActivity extends AppCompatActivity {

    private TextView Diary,Assistance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.navigation_activity);

        Diary = findViewById(R.id.mi_diary);
        Assistance = findViewById(R.id.mi_consult_assistance);
    }

    public void onDiaryClick(){

    }
    public void onConsultAssistClick(){

    }
}
