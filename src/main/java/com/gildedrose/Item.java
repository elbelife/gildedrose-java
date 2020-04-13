package com.gildedrose;

/**
 * @author lij
 */
public class Item {
    public String name;
    public int sell_in;
    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    protected boolean isBackstagePass() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }

}
