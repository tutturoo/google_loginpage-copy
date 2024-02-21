package com.akbar08.google_loginpage_copy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsModel_Adapter extends RecyclerView.Adapter<NewsModel_Adapter.MyViewHolder> {
    Context context;
    ArrayList<newsTemplateModel> NewsTemplateModel;

    public NewsModel_Adapter(Context context, ArrayList<newsTemplateModel> NewsTemplateModel){
        this.context = context;
        this.NewsTemplateModel = NewsTemplateModel;
    }
    @NonNull
    @Override
    public NewsModel_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.text_row_item, parent, false);

        return new NewsModel_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsModel_Adapter.MyViewHolder holder, int position) {
        holder.txtHeader.setText(NewsTemplateModel.get(position).getHeader());
        holder.txtPublisher.setText(NewsTemplateModel.get(position).getPublisherName());
        holder.txtUploadDate.setText(NewsTemplateModel.get(position).getDateUploaded());
    }

    @Override
    public int getItemCount() {
        return NewsTemplateModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtHeader, txtPublisher, txtUploadDate;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHeader.findViewById(R.id.text_header);
            txtPublisher.findViewById(R.id.text_publishername);
            txtUploadDate.findViewById((R.id.text_upload_date));
        }
    }
}
