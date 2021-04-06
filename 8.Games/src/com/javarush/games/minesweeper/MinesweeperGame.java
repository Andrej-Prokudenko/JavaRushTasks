package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 15;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private boolean isGameStopped;
    private int score = 0;

    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped){
            restart();
            return;
        }

        openTile(x,y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                
                if(getRandomNumber(10) < 1) {
                    setCellValue(x, y, "\ud83c\udf32");// ель
                }
                
                if(getRandomNumber(50) < 1) {
                    setCellValue(x, y, "\ud83d\ude93");// car1
                }
                
                if(getRandomNumber(60) < 1) {
                    setCellValue(x, y, "\ud83d\ude95"); // car2
                }
                
                if(getRandomNumber(70) < 1) {
                    setCellValue(x, y, "\ud83d\ude97"); // car3
                }
                
                if(getRandomNumber(35) < 1) {
                    setCellValue(x, y, "\ud83d\ude9a"); // cargocar
                }
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1 ; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1 ; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject neighbor : getNeighbors(gameObject)) {
                        if (neighbor.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isFlag || gameObject.isOpen || isGameStopped){
            return;
        }

        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, Color.GREEN);

        if (gameObject.isMine) {
            setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE);
            gameOver();
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> neighbors = getNeighbors(gameObject);
            for (GameObject neighbor : neighbors) {
                if (!neighbor.isOpen) {
                    openTile(neighbor.x, neighbor.y);
                }
            }
        } else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }

        if (!gameObject.isMine){
        score += 5;
        setScore(score);}

        if (countClosedTiles == countMinesOnField && !gameObject.isMine) {
            win();
        }
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isOpen || isGameStopped || (!gameObject.isFlag && countFlags == 0)) {
            return;
        }

        if (!gameObject.isFlag) {
            gameObject.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.BLUEVIOLET);
        } else {
            gameObject.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.ORANGE);
        }
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.ORANGERED, "Ура!!! \uD83D\uDCA5", Color.BLACK, 25);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Упс, не туда \uD83D\uDCA5" + "\ud83d\udd25" + "\ud83d\ude80", Color.BLACK, 25);
    }

    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        setScore(score);
        countMinesOnField = 0;
        createGame();



    }
}