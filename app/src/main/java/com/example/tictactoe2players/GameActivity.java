package com.example.tictactoe2players;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private BoardGame boardGame;
    private GameModule gameModule;
    private FbModule fbModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_game);
        boardGame = new BoardGame(this);
        setContentView(boardGame);
        gameModule = new GameModule();
        fbModule = new FbModule(this);
    }


    public void setPositionFromFb(Position position) {
        int line = position.getLine();
        int col = position.getCol();
        boardGame.setNewValOnBoard(line, col);
        int win = gameModule.isWin(boardGame.arr);
        if (win == 1) {
            Toast.makeText(this, "O win", Toast.LENGTH_SHORT).show();
        } else if (win == 0) {
            Toast.makeText(this, "X win", Toast.LENGTH_SHORT).show();
        }
    }

    public void setNewTouch(int line, int col) {
        Position position = new Position(line,col);
        fbModule.setPositionInFirebase(position);
    }
}