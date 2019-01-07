package com.mygdx.game.characters;

import com.mygdx.game.items.Inventory;
import com.mygdx.game.items.Weapon;

public class Player {


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

    }


}
