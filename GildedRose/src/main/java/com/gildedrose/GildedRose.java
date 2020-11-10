package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      if (items[i].name.equals("Aged Brie")) {
        if (items[i].quality < 50) {
          items[i].quality = items[i].quality + 1;
        }

        items[i].sellIn = items[i].sellIn - 1;

        if (items[i].sellIn < 0) {
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }
        }

      } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (items[i].quality < 50) {
          items[i].quality = items[i].quality + 1;
        }

        if (items[i].sellIn <= 10) {
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }
        }

        if (items[i].sellIn <= 5) {
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }
        }
        
        items[i].sellIn = items[i].sellIn - 1;

        if (items[i].sellIn < 0) {
          items[i].quality = 0;
        }

      } else {
        if (items[i].quality > 0) {
          if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            //DO NOTHING
          } else {
            items[i].quality = items[i].quality - 1;
          }
        }

        if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
          //DO NOTHINGc
        } else {
          items[i].sellIn = items[i].sellIn - 1;
        }

        if (items[i].sellIn < 0) {
          if (items[i].quality > 0) {
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
              // TODO
            } else {
              items[i].quality = items[i].quality - 1;
            }
          }
        }

      }
    } //0
  }
}
