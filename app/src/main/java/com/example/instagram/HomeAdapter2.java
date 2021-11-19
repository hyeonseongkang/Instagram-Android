package com.example.instagram;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter2 extends RecyclerView.Adapter<HomeAdapter2.ViewHolder> {

    private List<Home> homeList;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView, profile;
        TextView name, textView1, textView2;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            imageView = (ImageView) view.findViewById(R.id.imageView);
            profile = (ImageView) view.findViewById(R.id.profile);
            name = (TextView) view.findViewById(R.id.name);
            textView1 = (TextView) view.findViewById(R.id.textView1);
            textView2 = (TextView) view.findViewById(R.id.textView2);
        }


    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public HomeAdapter2(List<Home> dataSet) {
        homeList = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_home_adapter2, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.imageView.setImageBitmap(homeList.get(position).getImageView());
        viewHolder.profile.setImageBitmap(homeList.get(position).getProfile());
        viewHolder.name.setText(homeList.get(position).getName());
        viewHolder.textView1.setText(homeList.get(position).getTextView1());
        viewHolder.textView2.setText(homeList.get(position).getTextView2());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return homeList == null ? 0 : homeList.size();
    }
}
