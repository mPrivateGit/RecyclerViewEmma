package com.example.aprivate.recyclerview;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ModeItem {

    private String author;
    private int mImgID;

    public ModeItem(String author, int mImgID ){
        this.author = author;
        this.mImgID = mImgID;
    }

    public String getAuthor() {
        return author;
    }
    public int getmImgID() {
        return mImgID;
    }

    public static List<ModeItem> getFakeItems(){
        AbstractList<ModeItem> itemList = new ArrayList<>();
        itemList.add(new ModeItem("test_1", R.drawable.emma));
        itemList.add(new ModeItem("test_2", R.drawable.emma));
        itemList.add(new ModeItem("vetra", R.drawable.emma));
        itemList.add(new ModeItem("posteli", R.drawable.emma));
        itemList.add(new ModeItem("proshu", R.drawable.emma));
        itemList.add(new ModeItem("berega", R.drawable.emma));
        itemList.add(new ModeItem("vetra", R.drawable.emma));
        itemList.add(new ModeItem("posteli", R.drawable.emma));
        itemList.add(new ModeItem("proshu", R.drawable.emma));
        itemList.add(new ModeItem("berega", R.drawable.emma));
        itemList.add(new ModeItem("vetra", R.drawable.emma));
        itemList.add(new ModeItem("posteli", R.drawable.emma));
        itemList.add(new ModeItem("proshu", R.drawable.emma));
        itemList.add(new ModeItem("berega", R.drawable.emma));
        itemList.add(new ModeItem("vetra", R.drawable.emma));
        itemList.add(new ModeItem("posteli", R.drawable.emma));
        itemList.add(new ModeItem("proshu", R.drawable.emma));
        itemList.add(new ModeItem("berega", R.drawable.emma));

        return itemList;
    }
}
