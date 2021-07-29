package com.kirara.consultapp.ui.Navigation;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kirara.consultapp.R;
import com.kirara.consultapp.model.Question;
import com.kirara.consultapp.model.QuestionLists;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ConsultFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private final String TAG= "ConsultFragment";
    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            //
        }
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater,
                             @Nullable @org.jetbrains.annotations.Nullable ViewGroup container,
                             @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: onCalled");
        View v = inflater.inflate(R.layout.consult_fragment,container , false);
        ArrayList<Question> questions = QuestionLists.getQuesitonList();
        ArrayList<String> str = questions.get(0).getQuestion();
        ConsultRecyclerViewAdapter mAdapter = new ConsultRecyclerViewAdapter(str);
        mRecyclerView = v.findViewById(R.id.consult_question_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
