package com.gilderose;

public class SulfurasHandOfRagnaros extends Item {

	public SulfurasHandOfRagnaros(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void strategy() {
		if(this.quality<50) {
	    	this.quality+=1;
	    }
	      

	}

}
