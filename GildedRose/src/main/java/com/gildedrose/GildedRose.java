package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      switch (items[i].name) {
        case "Aged Brie" :
          if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
          }

          items[i].sellIn = items[i].sellIn - 1;

          if (items[i].sellIn < 0) {
            if (items[i].quality < 50) {
              items[i].quality = items[i].quality + 1;
            }
          }
          break;

        case "Backstage passes to a TAFKAL80ETC concert" :
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
          break;

        case "Sulfuras, Hand of Ragnaros" :

          //DO NOTHING
          break;

        default :
          if (items[i].quality > 0) {
            items[i].quality = items[i].quality - 1;
          }

          items[i].sellIn = items[i].sellIn - 1;

          if (items[i].sellIn < 0) {
            if (items[i].quality > 0) {
              items[i].quality = items[i].quality - 1;
            }
          }
      }
    } //0
  }
}
