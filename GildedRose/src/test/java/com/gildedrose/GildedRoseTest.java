package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    //test sur les Qualités

    //test si la qualité décrémente
    @Test
     void testDecrementationQuality()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

//test avec qualité égale à zero
    @Test
     void testDecrementationQualityZero()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    // test pour vérifier backstage... avec qualité inférieure à 50
    @Test
    void testBackstageUpdate()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,42)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(43));
    }

    // test qualité égale à 0
    @Test
    void testQualityZero()
    {
        
        Item[] items = new Item[] {new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(1));   
    }

    //test si qualité de Sulfura change
    @Test
    void testSulfuraQuality()
    {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }

    //test quality superieur à 50 avec Sellin negatif
    @Test
    void testIfQualityGt50()
    {

        Item[] items = new Item[] {new Item("Aged Brie", -2, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(60));   
    }
    // sellin et quality negatif
    @Test
    void testIfQualityNegatif()
    {

        Item[] items = new Item[] {new Item("+5 Dexterity Vest", -2, -6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(-6));   
    }


//test qualité de backstage ne depasse pas 50 avec sellin <10
    @Test 
    void testBackstageUpdateGTE50()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
//test qualité de backstage ne depasse pas 50 avec sellin <6

    @Test 
    void testBackstageUpdateGT50()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    
    }
    // test de backstage avec sellin < 11
    @Test 
    void testBackstageUpdate2()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",10,42)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(44));
    }

    //test de backstage avec sellin <6
    @Test
    void testBackstageUpdate3()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",5,42)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(45));
    }

    //test pour sellIn negatif

    //test de Elixir...
    @Test
    void testSellinNegatif()
    {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",0,6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(4));
    }

    //test de Backstage...
    @Test
    void testBackstageWithsellInNegatif()
    {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",-1,3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
   
    }

    //test de AgedBrie
    @Test
    void testAgedBrieWithsellInNegatif()
    {
        Item[] items = new Item[]{new Item("Aged Brie",-1,3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(5));
   
    }
    
    //Test si la Sellin décrémente
    @Test
    void testDecrementationSellin()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }
     //AgedBrie
    @Test
    void testDecrementationSellinAgedBrie()
    {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }
    
    //Backstage
    @Test
    void testDecrementationSellinBackStage()
    {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    //Sulfura
     @Test
    void testDecrementationSellinSulfura()
    {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(1));
    }

   }
