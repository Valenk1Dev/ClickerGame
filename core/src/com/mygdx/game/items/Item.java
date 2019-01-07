package com.mygdx.game.items;





public abstract class Item {

   public enum item_types {WEAPON, ARMOR};
   public enum item_rarities {COMMON, UNCOMMON, RARE, EPIC}

    private String name;
    private int type;
    private int rarity;
    private int price;

    public Item(final String name, final int type, final int rarity, final int price)
    {

        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.price = price;

    }

}
