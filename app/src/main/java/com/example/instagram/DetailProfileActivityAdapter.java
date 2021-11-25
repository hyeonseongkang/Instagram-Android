package com.example.instagram;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailProfileActivityAdapter extends RecyclerView.Adapter<DetailProfileActivityAdapter.MyViewHolder> {

    List<Bitmap> item;
    static public View.OnClickListener onClick;
    String key;



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        View rootView;
        private ImageView imageView;

        public MyViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.imageView);

            rootView = v;
        }
    }

    public DetailProfileActivityAdapter(List<Bitmap> myDataset) {
        item = myDataset;
    }
    @Override
    public DetailProfileActivityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        // create a new view
        RelativeLayout v = (RelativeLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_detail_profile_adpater, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageBitmap(item.get(position));
        //holder.count.setText((position + 1));

    }

    @Override
    public int getItemCount() {
        return item == null ? 0 : item.size();
    }

    public Bitmap StringToBitMap(String encodedString) {

        try {
            byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
            return bitmap;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }

    }
}
