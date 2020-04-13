package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * @author lij
 */
public class BackstagePass extends Item {
    public BackstagePass(int sellInt, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellInt, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }
}
