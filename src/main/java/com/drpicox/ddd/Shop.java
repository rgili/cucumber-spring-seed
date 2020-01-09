package com.drpicox.ddd;

public class Shop {

    private int stock;

    public Shop () {
        this.stock = 10;
    }

    public int getStock (){return this.stock;}

    public void getMoreStock(){
        this.stock += 10;
    }

    public boolean buy (){
        if(this.stock == 0)
            return false;
        this.stock -= 1;
        return true;
    }

}
