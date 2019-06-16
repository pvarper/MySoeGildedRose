package com.gilderose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    
    public EnumItem getEnumItem() {
    	switch (this.name) {
		case "Aged Brie":
			return EnumItem.AGED_BRIE;
		case "+5 Dexterity Vest":
			return EnumItem.PLUS_5_DEXTERY_VEST;	
		case "Elixir of the Mongoose":
			return EnumItem.ELIXIR_OF_MONGOSE;
		case "Sulfuras, Hand of Ragnaros":
			return EnumItem.SULFURAS_HAND_OF_RAGNAROS;
		case "Backstage passes to a TAFKAL80ETC concert":
			return EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT;
		case "Conjured Mana Cake":
			return EnumItem.CONJURED_MANA_CAKE;
			
			
		default:
			return EnumItem.UNKNOW;
		}
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
}

}
