package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] itemS) {
    this.items = itemS;
  }

  public void updateQuality() {
    for (Item item : items) {
      updateItem(item);
    }
  }

  private void updateItem(Item item) {
    switch (item.getName()) {

      case "Aged Brie" :
        item.increaseQuality();
        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
          item.increaseQuality();
        }
        break;

      case "Backstage passes to a TAFKAL80ETC concert" :
        item.increaseQuality();
        if (item.getSellIn() <= 10) {
          item.increaseQuality();
        }
        if (item.getSellIn() <= 5) {
          item.increaseQuality();
        }
        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
          item.qualityZero();
        }
        break;

      case "Sulfuras, Hand of Ragnaros" :
        //DO NOTHING
        break;

      case "Conjured" :
        item.decreaseQuality();
        item.decreaseQuality();
        if (item.getQuality() < 0) {
          item.qualityZero();
        }
        item.decreaseSellIn();
        break;

      default :
        item.decreaseQuality();
        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
          item.decreaseQuality();
        }
    }
  }
}
