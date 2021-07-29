package com.kirara.consultapp.ui.Navigation;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kirara.consultapp.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ConsultRecyclerViewAdapter extends RecyclerView.Adapter<ConsultRecyclerViewAdapter.ViewHolder>{
    private final String TAG = "ConsultViewAdapter";
    private ArrayList<String> mQuestionList;

    public ConsultRecyclerViewAdapter(ArrayList<String> mQuestionList) {
        this.mQuestionList = mQuestionList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.mTextView.setText(mQuestionList.get(position));
        holder.mParentLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d(TAG, "onClick: ");


            }
        });
    }

    @Override
    public int getItemCount() {
        return mQuestionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public final TextView mTextView;
        public RelativeLayout mParentLayout;

        public ViewHolder(View itemView){
            super(itemView);
            mTextView = itemView.findViewById(R.id.question_text);
            mParentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
