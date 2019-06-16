package com.gilderose;

public abstract class Item {

    protected String name;

    protected int sellIn;

    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    
    public void updateQuality() {
    	this.strategy();
    }
    
    protected abstract void strategy();
    
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
