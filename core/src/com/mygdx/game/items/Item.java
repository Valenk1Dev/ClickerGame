package com.mygdx.game.items;

public abstract class Item {
    String name;
    int id;
    float dps;
    String src;

    public float getDps(int id) {
        return dps;
    }

    public String getName(int id) {
        return name;
    }

    public String getSrc(int id) {
        return src;
    }
}
