package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * @author lij
 */
public class Sulfuras extends Item {
    public Sulfuras(int sellInt, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellInt, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }
}
