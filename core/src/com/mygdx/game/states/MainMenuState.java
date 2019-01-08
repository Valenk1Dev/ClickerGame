package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
//import com.sun.xml.internal.bind.v2.TODO;


public class MainMenuState extends State {

    public final int PLAY_BUTTON_WIDTH = (int)Math.round(Gdx.graphics.getWidth() * 0.417);
    public final int PLAY_BUTTON_HEIGHT = (int)Math.round(Gdx.graphics.getHeight() * 0.097);
    public final int PLAY_BUTTON_Y = (Gdx.graphics.getHeight() - PLAY_BUTTON_HEIGHT) / 5*4;;
    public final int PLAY_BUTTON_X = (Gdx.graphics.getWidth() - PLAY_BUTTON_WIDTH) / 2;

    Texture background;
    Texture enemy;
    Texture playBtn;

    public MainMenuState(GameStateManager gsm) {
        super(gsm);

        //background = new Texture("background.jpg");
        // enemy = new Texture("bird.png");
        playBtn = new Texture("playBtn.png");


        //camera.setToOrtho(false, MyGdxGame.WIDTH / 2, MyGdxGame.HEIGHT / 2);


    }

    @Override
    protected void handleInput() {

        //TODO Правильно высчитать Y

        /*
            if (Gdx.input.getX() > PLAY_BUTTON_X &&
                Gdx.input.getX() < PLAY_BUTTON_X + PLAY_BUTTON_WIDTH
                    && Gdx.input.getY() < 780
                 && Gdx.input.getY() > 530 ) {
            if (Gdx.input.isTouched()) {
                gsm.set(new CharacterCreationState(gsm));
            }
        }
        */

        if (Gdx.input.isTouched())
        {
            System.out.println("y =" +Gdx.input.getY());
            System.out.println( "x =" +Gdx.input.getX());

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

        // batch.draw(background,0,0, MyGdxGame.WIDTH, MyGdxGame.HEIGHT);
        batch.draw(playBtn, PLAY_BUTTON_X, PLAY_BUTTON_Y , PLAY_BUTTON_WIDTH, PLAY_BUTTON_HEIGHT);

        batch.end();

    }

    @Override
    public void dispose() {

        playBtn.dispose();

    }
}
