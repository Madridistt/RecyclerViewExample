package com.example.beknazar.recyclerviewexample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private LinearLayoutManager horizontalLinearLayoutManager;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        verticalLinearLayoutManager = new LinearLayoutManager(this);
        horizontalLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        adapter= new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.addAll(ModelItem.getFakeItems);
    }

    private class RecyclerAdapter extends RecyclerView.Adapter <RecyclerViewHolder>  {

        private ArrayList<ModelItem> items=new ArrayList<>();

        public void addAll(List<ModelItem> fakeItems){

            int pos=getItemCount;
            this.items.addAll(fakeItems);
            notifyItemRangeInserted(pos, this.items.size() );
        }

        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false)
            return new RecyclerViewHolder(view );
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
            holder.bind(items.get(position));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
               public RecyclerViewHolder (View itemView){
                   super(itemView);
                   title=(TextView) itemView.findViewById(R.id.title);
                   image=(ImageView) itemView.findViewById(R.id.image);


               }
          public void bind (ModelItem modelItem){

                   image.setImageBitmap(BitmapFactory.decodeResource(itemView.getResources(),modelItem.getImgId()));
                   title.setText(modelItem.getAuthor());

          }


    }
}



























