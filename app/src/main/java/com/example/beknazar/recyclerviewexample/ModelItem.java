package com.example.beknazar.recyclerviewexample;


import java.util.ArrayList;
import java.util.List;

public class ModelItem {
    private String author;
    private  int imgId;

    public ModelItem(String author, int imgId){
        this.author=author;
        this.imgId=imgId;
    }

    public int getImgId(){

        return imgId;
    }

    public String getAuthor() {
        return author;
    }
    public static List<ModelItem> getFakeItems(){
        ArrayList<ModelItem> itemList= new ArrayList<>();
        itemList.add(new ModelItem("Prasad A.", R.drawable.img_prasad_a));
        itemList.add(new ModelItem("Besim Mazgiqi.", R.drawable.img_besim_m));
        itemList.add(new ModelItem("Mark Bridger.", R.drawable.img_mark_b));
        itemList.add(new ModelItem("William Mevissen.", R.drawable.img_william_m));
        itemList.add(new ModelItem("Darren J Bennet.", R.drawable.img_darren_b));
        itemList.add(new ModelItem("Prasad A.", R.drawable.img_prasad_a));
        itemList.add(new ModelItem("Besim Mazgiqi.", R.drawable.img_besim_m));
        itemList.add(new ModelItem("Mark Bridger.", R.drawable.img_mark_b));
        itemList.add(new ModelItem("William Mevissen.", R.drawable.img_william_m));
        itemList.add(new ModelItem("Darren J Bennet.", R.drawable.img_darren_b));
        return itemList;

    }
}




