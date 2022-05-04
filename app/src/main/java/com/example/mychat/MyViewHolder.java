package com.example.mychat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public CardView messageCard;
    public ImageView userImage;
    public TextView userName;
    public TextView message;
    public CardView messageCard_m;
    public ImageView userImage_m;
    public TextView userName_m;
    public TextView message_m;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        messageCard = itemView.findViewById(R.id.message);
        userImage = itemView.findViewById(R.id.userImage);
        userName = itemView.findViewById(R.id.userTV);
        message = itemView.findViewById(R.id.messageText);
        messageCard_m = itemView.findViewById(R.id.message_m);
        userImage_m = itemView.findViewById(R.id.userPhotoIV);
        userName_m = itemView.findViewById(R.id.userNameTV);
        message_m = itemView.findViewById(R.id.messageTV);
    }
}
