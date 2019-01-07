package com.mygdx.game.characters;

import com.mygdx.game.items.Inventory;
import com.mygdx.game.items.Item;
import com.mygdx.game.items.Weapon;

public class Player {

    // TODO formula to exp
    //(50/3) * (pow(x, 3) - 6*pow(x, 2) + (x * 17) - 12);

    //Core
    private String name;
    private int level;
    private int exp;
    private int expNext;

    private int damage;

    private int gold;

    private Weapon weapon;

    private Inventory inventory;


    //Constructor

    public Player(final String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
        this.expNext = 46;
        this.damage = 1;
        this.gold = 0;




        inventory = new Inventory();
        weapon = new Weapon("Sword", Item.item_types.WEAPON, Item.item_rarities.COMMON, 100, 15  );

    }

}
