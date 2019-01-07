package com.mygdx.game.items;

public class Weapon extends Item {


    private int damage;

    public Weapon(final String name, final item_types type, final item_rarities rarity, final int price, int damage)
    {
        super(name,type,rarity,price);

        this.damage = damage;

    }

    public int getDamage()
    {
        return this.damage;
    }




}
