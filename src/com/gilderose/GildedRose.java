package com.gilderose;

public class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (!validateItemName(items[i],"Aged Brie")
					&& !validateItemName(items[i],"Backstage passes to a TAFKAL80ETC concert")) {
				if (items[i].quality > 0) {
					if (!validateItemName(items[i],"Sulfuras, Hand of Ragnaros")) {
						items[i].quality = items[i].quality - 1;
					}
				}
			} else {
				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (validateItemName(items[i],"Backstage passes to a TAFKAL80ETC concert")) {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}
					}
				}
			}

			if (!validateItemName(items[i],"Sulfuras, Hand of Ragnaros")) {
				items[i].sellIn = items[i].sellIn - 1;
			}

			if (items[i].sellIn < 0) {
				if (!validateItemName(items[i],"Aged Brie")) {
					if (!validateItemName(items[i],"Backstage passes to a TAFKAL80ETC concert")) {
						if (items[i].quality > 0) {
							if (!validateItemName(items[i],"Sulfuras, Hand of Ragnaros")) {
								items[i].quality = items[i].quality - 1;
							}
						}
					} else {
						items[i].quality = items[i].quality - items[i].quality;
					}
				} else {
					if (items[i].quality < 50) {
						items[i].quality = items[i].quality + 1;
					}
				}
			}
		}
	}
	
	public boolean validateItemName(Item item, String validar) {
		boolean validate= false;
		if(item.name.equals(validar)) 
			validate=true;
			
		return validate;
		
	}
	
	

}
