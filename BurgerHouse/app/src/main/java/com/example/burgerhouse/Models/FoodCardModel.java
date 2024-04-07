package com.example.burgerhouse.Models;

public class FoodCardModel{
    int pic;
    String text;

    public FoodCardModel(int pic, String text) {
        this.pic = pic;
        this.text = text;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPic() {
        return pic;
    }

    public String getText() {
        return text;
    }
}
