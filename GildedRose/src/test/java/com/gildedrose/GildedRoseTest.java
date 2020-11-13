package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    //test sur les Qualités

    //test si la qualité décrémente
    @Test
     void testDecrementationOfQuality()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(0));
    }


   @Test
     void testDecrementationForQualityEqualZero()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(0));
    }

    // test pour vérifier backstage... avec qualité inférieure à 50
    @Test
    void testBackstageUpdate()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,42)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(43));
    }

  
    @Test
    void testQualityZeroForAgedBrie()
    {
        
        Item[] items = new Item[] {new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(1));   
    }

    
    @Test
    void testSulfuraQuality()
    {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(80));
    }

    //test quality superieur à 50 avec Sellin negatif
    @Test
    void testQualityGt50WithSellinNegative()
    {

        Item[] items = new Item[] {new Item("Aged Brie", -2, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(60));   
    }
 

    @Test 
    void testIfQualityExceeds50()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(50));
    
    }
    // test de backstage avec sellin < 11
    @Test 
    void testBackstageUpdateWithSellinLT11()
    {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",10,42)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(44));
        assertThat(app.items[0].getSellIn(), is(9));
    }
    
    @Test
    void testBackstageWithQualityGT50()
    {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",5,60)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(),is(60));
   
    }

    //test de Backstage...
    @Test
    void testBackstageWithsellInNegatif()
    {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",-1,3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(),is(0));
   
    }

    //test de Elixir...
    @Test
    void testSellinEqualZero()
    {
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",0,6)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(),is(4));
    }

    
    //test de AgedBrie
    @Test
    void testAgedBrieWithsellInNegatif()
    {
        Item[] items = new Item[]{new Item("Aged Brie",-1,3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(),is(5));
   
    }
    
    //Test si la Sellin décrémente
    @Test
    void testDecrementationSellin()
    {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getSellIn(), is(0));
    }

     //AgedBrie
    @Test
    void testDecrementationSellinAgedBrie()
    {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getSellIn(), is(0));
    }
    
     

    //Sulfura
     @Test
    void testDecrementationSellinSulfura()
    {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getSellIn(), is(1));
    }

    //ToString
    @Test
    void TestToString() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 0) };
        assertThat(items[0].toString(), is("Sulfuras, Hand of Ragnaros, 1, 0"));
    }

    //Conjured
    @Test
    void testDecrementationQualityOfConjured()
    {
        Item[] items = new Item[] { new Item("Conjured", 6, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(28));
    }
    
    @Test
     void testQualityOfConjuredLTE0()
    {
        Item[] items = new Item[] { new Item("Conjured", 6, -3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].getQuality(), is(0));
    }
    
   }
