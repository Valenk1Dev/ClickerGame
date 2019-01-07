package com.mygdx.game.items;

public class Weapon extends Item {


    private int damage;

    public Weapon(final String name, final int type, final int rarity, final int price, int damage)
    {
        super(name,type,rarity,price);

        this.damage = damage;

    }


}
