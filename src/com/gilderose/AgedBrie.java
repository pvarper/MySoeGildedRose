package com.gilderose;

public class AgedBrie extends Item {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void strategy() {
	    if(this.quality<50) {
	    	this.quality+=1;
	    }
	    this.sellIn-=1;
	    if(this.sellIn<0&&this.quality>50) {
	    	this.quality+=1;
	    }

	}

}
