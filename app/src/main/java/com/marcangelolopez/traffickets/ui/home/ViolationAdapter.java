package com.marcangelolopez.traffickets.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.marcangelolopez.traffickets.R;
import com.marcangelolopez.traffickets.data.ViolatorModel;

import java.util.List;

public class ViolationAdapter extends RecyclerView.Adapter<ViolationAdapter.ViewHolder> {

    private List<ViolatorModel> localDataSet;
    private final OnItemClickListener localListener;
    private final OnDeleteClickListener listenerFave;
    private Context context;

    public interface OnItemClickListener{
        void onItemClick(ViolatorModel item);
    }

    public interface OnDeleteClickListener{
        void onItemClick(ViolatorModel item, int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView desc;
        private final CardView cardView;
        private final Button btnDelete;

        public ViewHolder(View view){
            super(view);

            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            cardView = view.findViewById(R.id.violationCardView);
            btnDelete = view.findViewById(R.id.btnDelete);
        }

        public TextView getTitle() {
            return title; }

        public TextView getDesc() {
            return desc; }

        public CardView getCardView() {
            return cardView; }

        public Button getBtnDelete() {
            return btnDelete; }
    }

    public ViolationAdapter (List<ViolatorModel> dataSet, OnItemClickListener listener, OnDeleteClickListener listener2, Context context){
        localDataSet = dataSet;
        localListener = listener;
        listenerFave = listener2;
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.violator_item, viewGroup, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTitle().setText(localDataSet.get(position).violatorTitle);
        viewHolder.getDesc().setText(localDataSet.get(position).violatorDesc);
        viewHolder.getCardView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                localListener.onItemClick(localDataSet.get(position));
            }
        });
        viewHolder.getBtnDelete().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerFave.onItemClick(localDataSet.get(position), position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
