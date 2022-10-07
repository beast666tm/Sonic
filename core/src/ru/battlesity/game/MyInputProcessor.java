package ru.battlesity.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import ru.battlesity.game.persons.Sonic;

import java.util.ArrayList;

public class MyInputProcessor implements InputProcessor {
    private Vector2 outForce;
    ArrayList outString = new ArrayList<>();

    public ArrayList getOutString() {
        return outString;
    }

    public MyInputProcessor() {
        outForce = new Vector2();
    }

    public Vector2 getVector() {
        return outForce;
    }

    @Override
    public boolean keyDown(int keycode) {
        String inKey = Input.Keys.toString(keycode).toUpperCase();

        switch (inKey) {
            case "A":
                outForce.add(-0.15f, 0);
                break;
            case "D":
                outForce.add(0.15f, 0);
                break;
            case "S":
                outForce.add(0, -0.15f);
                break;
            case "W":
                outForce.add(0, 1.3f);
                break;
            case "SPACE":
                outForce.set(0, 0);
                Sonic.isFire = true;
                break;
            case "ESCAPE":
                ;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        String inKey = Input.Keys.toString(keycode).toUpperCase();

        switch (inKey) {
            case "A":
                outForce.set(0, outForce.y);
                break;
            case "D":
                outForce.set(0, outForce.y);
                break;
            case "S":
                outForce.set(outForce.x, outForce.y);
                break;
            case "W":
                outForce.set(outForce.x, 0);
                break;
            case "SPACE":
                Sonic.isFire = false;
                break;
        }
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
////        float x = Gdx.graphics.getWidth() - Gdx.input.getX();
////        float y = Gdx.graphics.getHeight() - Gdx.input.getY();
//        if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)){
//            Sonic.isFire = true;
//        }


        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
////        float x = Gdx.graphics.getWidth() - Gdx.input.getX();
////        float y = Gdx.graphics.getHeight() - Gdx.input.getY();
//        if (Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)){
//            Sonic.isFire = false;
//        }
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

}
