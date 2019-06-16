package com.gilderose;

public class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			items[i].updateQuality();
		}
	}
	
	public boolean validateEnumItem(Item item, EnumItem enumItem) {
		boolean validate= false;
		
		if(item.getEnumItem()==enumItem) 
			validate=true;
			
		return validate;
		
	}
	
	public void qualityItemCalculate(Item item, int value) {
		item.quality=item.quality+value;
		
	}
	
	public void sellInItemCalculate(Item item, int value) {
		item.sellIn=item.sellIn+value;
		
	}
	
	

}
