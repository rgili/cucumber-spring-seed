package com.drpicox.ddd;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;

    @BeforeEach
    void init(){
        shop = new Shop();
    }

    @Test
    void getMoreStock() {
        int actualStock = shop.getStock();
        shop.getMoreStock();
        int moreStock = shop.getStock();

        assertEquals(actualStock, 10);
        assertEquals(moreStock, 20);
    }

    @Test
    void buy() {
        int totalProducts = shop.getStock();
        shop.buy();
        int totalProductsAfterBuy = shop.getStock();

        assertEquals(totalProducts, 10);
        assertEquals(totalProductsAfterBuy, 9);
    }
}
