package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellInt, int quality) {
        super("Aged Brie", sellInt, quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }
}
