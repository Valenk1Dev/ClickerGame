package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;

public class MainMenuState extends State {

    Texture background;
    Texture enemy;
    Texture playBtn;

    public MainMenuState(GameStateManager gsm) {
        super(gsm);

        background = new Texture("background.jpg");
        enemy = new Texture("bird.png");
        playBtn = new Texture("playBtn.png");


        //camera.setToOrtho(false, MyGdxGame.WIDTH / 2, MyGdxGame.HEIGHT / 2);



    }

    @Override
    protected void handleInput() {

        if (Gdx.input.isTouched())
        {
            gsm.set(new CharacterCreationState(gsm));
        }

    }

    @Override
    public void update(float deltatime) {

        handleInput();
    }

    @Override
    public void render(SpriteBatch batch) {

      // batch.setProjectionMatrix(camera.combined);
        batch.begin();

        batch.draw(background,0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        batch.draw(playBtn, ((MyGdxGame.WIDTH - playBtn.getWidth()) / 2) , MyGdxGame.HEIGHT /2 );

        batch.end();

    }

    @Override
    public void dispose() {

        background.dispose();

    }
}
