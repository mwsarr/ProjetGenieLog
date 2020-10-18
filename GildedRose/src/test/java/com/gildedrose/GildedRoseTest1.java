package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    //test sur les Qualités

    //test si la qualité décrémente
  @Test
     void testDecrementationQuality() {
    final Item[] items = new Item[] {new Item("Elixir of the Mongoose", 1, 1) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(0)); }

//test avec qualité égale à zero
  @Test
    void testDecrementationQualityZero() {
    final Item[] items = new Item[] {new Item("Elixir of the Mongoose", 1, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(0)); }

    // test pour vérifier backstage... avec qualité inférieure à 50
  @Test
    void testBackstageUpdate() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 12, 42)};
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(43)); }

    // test qualité égale à 0
  @Test
    void testQualityZero() {
    final Item[] items = new Item[] {new Item("Aged Brie", 2, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(1)); }

    //test si qualité de Sulfura change
  @Test
    void testSulfuraQuality() {
    final Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 80) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(80)); }

    //test quality superieur à 50 avec Sellin negatif
  @Test
    void testIfQualityGt50SellinNeg() {
    final Item[] items = new Item[] {new Item("Aged Brie", -2, 60) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(60)); }
    // sellin et quality negatif
  @Test
    void testIfQualityNegatif() {
    final Item[] items = new Item[] {new Item("+5 Dexterity Vest", -2, -6) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(-6)); }


//test qualité de backstage ne depasse pas 50 avec sellin <10
  @Test 
    void testBackstageUpdateGTE50() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(50)); }
//test qualité de backstage ne depasse pas 50 avec sellin <6

  @Test 
    void testBackstageUpdateGT50() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(50)); }
    // test de backstage avec sellin < 11
  @Test 
    void testBackstageUpdateGTBIS50() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 52) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(52)); }
  
  @Test 
    void testBackstageUpdate2() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",10, 42) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(44)); }

    //test de backstage avec sellin <6
  @Test
    void testBackstageUpdate3() {
    final Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",5, 42)};
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(45)); }

    //test pour sellIn negatif

    //test de Elixir...
  @Test
    void testSellinNegatif() {
    final Item[] items = new Item[] {new Item("Elixir of the Mongoose", 0, 6)};
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality,is(4)); }

    //test de Backstage...
  @Test
    void testBackstageWithsellInNegatif() {
    final Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", -1, 3)};
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality,is(0)); }

    //test de AgedBrie
  @Test
    void testAgedBrieWithsellInNegatif() {
    final Item[] items = new Item[]{new Item("Aged Brie", -1, 3)};
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality,is(5)); }
  @Test 
    void testAgedBrieUpdateLTE6() {
    final Item[] items = new Item[] {new Item("Aged Brie", 5, 49) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(50)); 
    }
  @Test 
    void testAgedBrieUpdateLTE10() {
    final Item[] items = new Item[] {new Item("Aged Brie", 10, 49) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(50)); 
    }

    //Test si la Sellin décrémente
  @Test
    void testDecrementationSellin() {
    final Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].sellIn, is(0)); }
     //AgedBrie
  @Test
    void testDecrementationSellinAgedBrie() {
    final Item[] items = new Item[] { new Item("Aged Brie", 1, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].sellIn, is(0)); }
    
    //Backstage
  @Test
    void testDecrementationSellinBackStage() {
    final Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].sellIn, is(0)); }

    //Sulfura
  @Test
    void testDecrementationSellinSulfura() {
    final Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 0) };
    final GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].sellIn, is(1)); }

   }
