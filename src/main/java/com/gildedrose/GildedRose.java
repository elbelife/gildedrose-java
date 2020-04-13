package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void passOneDay() {
        for (Item item : items) {
            passOneDay(item);
        }
    }

    private void passOneDay(Item item) {
        if (!item.isAgedBrie() && !item.isBackstagePass()) {
            if (item.quality > 0) {
                if (!item.isSulfuras()) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.isBackstagePass()) {
                    if (item.sell_in < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sell_in < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
        }

        updateSellInDays(item);

        if (item.sell_in < 0) {
            if (!item.isAgedBrie()) {
                if (!item.isBackstagePass()) {
                    if (item.quality > 0) {
                        if (!item.isSulfuras()) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = item.quality - item.quality;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    private void updateSellInDays(Item item) {
        if (item.isSulfuras()) {
            return;
        }
        item.sell_in = item.sell_in - 1;
    }
}
