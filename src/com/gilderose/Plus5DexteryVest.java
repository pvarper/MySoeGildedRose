package com.gilderose;

public class Plus5DexteryVest extends Item {

	public Plus5DexteryVest(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void strategy() {
		if(this.quality>0) {
			this.quality-=1;
		}
		this.sellIn-=1;
		if(this.sellIn<0&&this.quality>0) {
			this.quality-=1;
		}

	}

}
