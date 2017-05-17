package com.example.aprivate.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManagerVertical;
    private LinearLayoutManager mlinearLayoutManagerHorizontal;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);

        mLinearLayoutManagerVertical = new LinearLayoutManager(this);
        mlinearLayoutManagerHorizontal = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLinearLayoutManagerVertical);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapter = new RecyclerAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.addAll(ModeItem.getFakeItems());


    }

    private class MyRecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView image;

        public MyRecyclerViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title_1);
            image = (ImageView) itemView.findViewById(R.id.image_1);

        }

        public void bind(ModeItem modeItem){
            image.setImageResource(modeItem.getmImgID());
           //image.setImageBitmap(BitmapFactory.decodeResource(image.getResources(),modeItem.getmImgID()));
            title.setText(modeItem.getAuthor());
        }


    }

    private class RecyclerAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder>{
        private ArrayList<ModeItem> items = new ArrayList<>();

        public void addAll(List<ModeItem> fakeitems){
            //int pos = getItemCount();
            this.items.addAll(fakeitems);
            notifyDataSetChanged();
            //notifyItemRangeInserted(pos, this.items.size());
        }


        @Override
        public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_card, parent, false);

            return new MyRecyclerViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
            holder.bind(items.get(position));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }
}
