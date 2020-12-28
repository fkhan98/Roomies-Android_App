package com.example.roomies.Cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.roomies.R;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cards> {

    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context,resourceId,items);
        this.context = context;
    }


    public View getView(int position,  View convertView, ViewGroup parent) {
        cards card_item = getItem(position);

        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }

        TextView name = (TextView)  convertView.findViewById(R.id.name);
        ImageView image = (ImageView)  convertView.findViewById(R.id.image);
        TextView batch = (TextView)  convertView.findViewById(R.id.batch);
        TextView department = (TextView)  convertView.findViewById(R.id.department);

        name.setText(card_item.getName());
        batch.setText(card_item.getBatch());
        department.setText(card_item.getDepartment());
        /*switch(card_item.getProfileImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.mipmap.ic_launcher).into(image);
                break;
                default:
                    Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                    break;
        }*/
        switch(card_item.getProfileImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.mipmap.ic_launcher).into(image);
                break;
            default:
                Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                break;
        }


        return convertView;
    }
}
