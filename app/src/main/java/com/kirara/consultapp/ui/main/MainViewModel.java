package com.kirara.consultapp.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mutableLiveData;

    public void init(){

    }

    public LiveData<String> getLiveData(){
        return mutableLiveData;
    }
}