package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CharacterCreationState extends State  {

        Texture enemy;

    public CharacterCreationState(GameStateManager gsm)
    {
        super(gsm);

        enemy = new Texture("enemy.jpg");

    }


    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float deltatime) {

    }

    @Override
    public void render(SpriteBatch batch) {

        batch.begin();

        batch.draw(enemy, 50 , 50 , 250, 250);

        batch.end();
    }

    @Override
    public void dispose() {

    }
}
