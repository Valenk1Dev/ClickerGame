package com.mygdx.game.items;





public abstract class Item {

   public enum item_types {WEAPON, ARMOR}
   public enum item_rarities {COMMON, UNCOMMON, RARE, EPIC}

    private String name;
    private item_types type;
    private item_rarities rarity;
    private int price;

    public Item(final String name, final item_types type, final item_rarities rarity, final int price)
    {

        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.price = price;

    }

}
