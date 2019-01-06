package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;

public class MenuState extends State {

    Texture background;

    public MenuState(GameStateManager gsm) {
        super(gsm);

        background = new Texture("background.jpg");
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

        batch.draw(background,0,0, MyGdxGame.HEIGHT, MyGdxGame.WIDTH);

        batch.end();

    }

    @Override
    public void dispose() {

        background.dispose();

    }
}
