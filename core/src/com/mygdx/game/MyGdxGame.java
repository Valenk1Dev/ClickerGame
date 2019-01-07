package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.GameStateManager;
import com.mygdx.game.states.MainMenuState;

public class MyGdxGame extends ApplicationAdapter {


	public static final int WIDTH = 1440;
	public static final int HEIGHT = 2560;

	private GameStateManager gameStateManager;
	private SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gameStateManager = new GameStateManager();
		gameStateManager.push(new MainMenuState(gameStateManager));

		Gdx.gl.glClearColor(0.3f,0.3f,0.3f, 1);

	}

	@Override
	public void render () {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStateManager.update(Gdx.graphics.getDeltaTime());

		gameStateManager.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
