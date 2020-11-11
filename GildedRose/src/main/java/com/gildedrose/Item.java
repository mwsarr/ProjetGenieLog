package com.gildedrose;

public class Item {

  private String name;

  private int sellIn;

  private int quality;

  public Item(String namE, int sellIN, int qualitY) {
    this.name = namE;
    this.sellIn = sellIN;
    this.quality = qualitY;
  }

  /***Méthode to string.*/
  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }

  /***Augmente la qualité si elle n'est pas maximum.*/
  void increaseQuality() {
    if (this.quality < 50) {
      this.quality = this.quality + 1;
    }
  }

  /***Diminue la qualité si elle est strictement positif.*/
  void decreaseQuality() {
    if (this.quality > 0) {
      this.quality = this.quality - 1;
    }
  }

  /***Diminue le SellIn.*/
  void decreaseSellIn() {
    this.sellIn = this.sellIn - 1;
  }

  /***Mets la qualité à 0.*/
  void qualityZero() {
    this.quality = 0;
  }

  /**@return le nom du produit.*/
  public String getName() {
    return this.name;
  }

  /**@return le SellIn.*/
  public int getSellIn() {
    return this.sellIn;
  }

  /**@return la qualité.*/
  public int getQuality() {
    return this.quality;
  }
}
