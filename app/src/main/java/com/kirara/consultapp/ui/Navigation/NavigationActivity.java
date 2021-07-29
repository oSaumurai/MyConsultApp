package com.kirara.consultapp.ui.Navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.kirara.consultapp.R;

public class NavigationActivity extends AppCompatActivity {

    //private TextView Diary,Assistance;

    private FragmentManager fm;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.navigation_activity);
//
//        Diary = findViewById(R.id.mi_diary);
//        Assistance = findViewById(R.id.mi_consult_assistance);
        fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.navigation_fragmentContainer);

        if (fragment == null) {
            Log.d("hewew", "fragment container initialized: ");
            fragment = new NavigationFragment();
            fragment.setArguments(getIntent().getExtras());
            fm.beginTransaction()
                    .add(R.id.navigation_fragmentContainer, fragment)
                    .commit();
        }
    }

    public void onDiaryClick(View v){

    }
    public void onConsultAssistClick(View v){
        Log.d("hewew", "onConsultAssistClick: ");
        fragment=new ConsultFragment();
        fragment.setArguments(getIntent().getExtras());
        Log.d("hewew", "onConsultAssistClick: ");
        fm.beginTransaction().replace(R.id.navigation_fragmentContainer,fragment).commit();
    }
}
