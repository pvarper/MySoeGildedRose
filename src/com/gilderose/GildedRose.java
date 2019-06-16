package com.gilderose;

public class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (!validateEnumItem(items[i],EnumItem.AGED_BRIE)
					&& !validateEnumItem(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
				if (items[i].quality > 0) {
					if (!validateEnumItem(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
						qualityItemCalculate(items[i],-1);
					}
				}
			} else {
				if (items[i].quality < 50) {
					qualityItemCalculate(items[i],+1);

					if (validateEnumItem(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {
								qualityItemCalculate(items[i],+1);
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								qualityItemCalculate(items[i],+1);
							}
						}
					}
				}
			}

			if (!validateEnumItem(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
				sellInItemCalculate(items[i], -1);
			}

			if (items[i].sellIn < 0) {
				if (!validateEnumItem(items[i],EnumItem.AGED_BRIE)) {
					if (!validateEnumItem(items[i],EnumItem.BACKSTAGE_PASSESS_TAFKAL80ETC_CONCERT)) {
						if (items[i].quality > 0) {
							if (!validateEnumItem(items[i],EnumItem.SULFURAS_HAND_OF_RAGNAROS)) {
								qualityItemCalculate(items[i],-1);
							}
						}
					} else {
						items[i].quality = items[i].quality - items[i].quality;
					}
				} else {
					if (items[i].quality < 50) {
						qualityItemCalculate(items[i],+1);
					}
				}
			}
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
