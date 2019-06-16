package com.gilderose;

public class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (!validateItemName(items[i],EnumItem.AGED_BRIE)
					&& !validateItemName(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
				if (items[i].quality > 0) {
					if (!validateItemName(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
						items[i].quality = items[i].quality - 1;
					}
				}
			} else {
				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (validateItemName(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
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

			if (!validateItemName(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
				items[i].sellIn = items[i].sellIn - 1;
			}

			if (items[i].sellIn < 0) {
				if (!validateItemName(items[i],EnumItem.AGED_BRIE)) {
					if (!validateItemName(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
						if (items[i].quality > 0) {
							if (!validateItemName(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
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
	
	public boolean validateItemName(Item item, EnumItem enumItem) {
		boolean validate= false;
		
		if(item.getEnumItem()==enumItem) 
			validate=true;
			
		return validate;
		
	}
	
	

}
