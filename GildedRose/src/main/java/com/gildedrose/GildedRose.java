package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (Item item : items) {
      updateItem(item);
    }
  }

  private void updateItem(Item item) {
    switch (item.name) {
      case "Aged Brie" :
        increaseQuality(item);

        decreaseSellIn(item);

        if (item.sellIn < 0) {
          increaseQuality(item);
        }
        break;

      case "Backstage passes to a TAFKAL80ETC concert" :
        increaseQuality(item);

        if (item.sellIn <= 10) {
          increaseQuality(item);
        }

        if (item.sellIn <= 5) {
          increaseQuality(item);
        }

        decreaseSellIn(item);

        if (item.sellIn < 0) {
          sellInZero(item);
        }
        break;

      case "Sulfuras, Hand of Ragnaros" :

        //DO NOTHING
        break;

      default :
        decreaseQuality(item);

        decreaseSellIn(item);

        if (item.sellIn < 0) {
          decreaseQuality(item);
        }
    }
  }

  private void increaseQuality(Item item) {
    if (item.quality < 50) {
      item.quality = item.quality + 1;
    }
  }

  private void decreaseQuality(Item item) {
    if (item.quality > 0) {
      item.quality = item.quality - 1;
    }
  }

  private void decreaseSellIn(Item item) {
    item.sellIn = item.sellIn - 1;
  }

  private void sellInZero(Item item) {
    item.quality = 0;
  }
}
