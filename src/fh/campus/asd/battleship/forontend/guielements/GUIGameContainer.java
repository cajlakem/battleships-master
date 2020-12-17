package fh.campus.asd.battleship.forontend.guielements;

import fh.campus.asd.battleship.backend.models.ImageShip;
import fh.campus.asd.battleship.helper.GUIConfig;
import fh.campus.asd.battleship.helper.GUILabelsHelper;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class GUIGameContainer {

    private Button buttonSaveShipsLeft = new Button(GUILabelsHelper.SAVE_SHIPS_LABEL);
    private Button buttonSaveShipsRight = new Button(GUILabelsHelper.SAVE_SHIPS_LABEL);
    private Button newGame = new Button(GUILabelsHelper.NEW_GAMES_LABEL);
    private Button exit = new Button(GUILabelsHelper.EXIT_GAMES_LABEL);
    private Button reset = new Button(GUILabelsHelper.RESTART_GAMES_LABEL);
    private Button seeShips1 = new Button(GUILabelsHelper.SHOW_SHIPS_LABEL);
    private Button seeShips2 = new Button(GUILabelsHelper.SHOW_SHIPS_LABEL);
    private Button cont = new Button(GUILabelsHelper.CONTINUE_LABEL);

    private ImageView startmenu = new ImageView(GUILabelsHelper.FILE_PATH_START);
    private ImageView wonleft = new ImageView(GUILabelsHelper.FILE_PATH_PLAYER1_WON);
    private ImageView wonright = new ImageView(GUILabelsHelper.FILE_PATH_PLAYER2_WON);
    private ImageView maskleftfield = new ImageView(GUILabelsHelper.FILE_PATH_ISLAND_BELOW_LEFT);
    private ImageView maskrightfield = new ImageView(GUILabelsHelper.FILE_PATH_ISLAND_BELOW_RIGHT);

    private Rectangle indicate1 = new Rectangle(GUIConfig.indicate1V1, GUIConfig.indicate1V2, GUIConfig.indicate1V3, GUIConfig.indicate1V4);
    private Rectangle indicate2 = new Rectangle(GUIConfig.indicate2V1, GUIConfig.indicate2V2, GUIConfig.indicate2V3, GUIConfig.indicate2V4);


    private Media bomb = new Media(new File(GUILabelsHelper.BOMB_WAV).toURI().toString());
    private MediaPlayer bombplay = new MediaPlayer(bomb);
    private Media miss = new Media(new File(GUILabelsHelper.MISS_WAV).toURI().toString());
    private MediaPlayer missplay = new MediaPlayer(miss);
    private Media music = new Media(new File(GUILabelsHelper.MUSIC_WAV).toURI().toString());
    private MediaPlayer musicplay = new MediaPlayer(music);
    private Media winner = new Media(new File(GUILabelsHelper.WINNER_WAV).toURI().toString());
    private MediaPlayer winnerplay = new MediaPlayer(winner);

    private Image bships[] = {
            new Image(GUILabelsHelper.RES_ONE_TWO),
            new Image(GUILabelsHelper.RES_ONE_THREE),
            new Image(GUILabelsHelper.RES_ONE_FOUR),
            new Image(GUILabelsHelper.RES_ONE_FIVE)
    };

    //Schiffe SPieler 1
    ImageShip imageShip1[] = {
            new ImageShip(1520, 640, 2, bships[0]),
            new ImageShip(1520, 640, 2, bships[0]),
            new ImageShip(1520, 640, 2, bships[0]),
            new ImageShip(1520, 640, 2, bships[0]),
            new ImageShip(1520, 720, 3, bships[1]),
            new ImageShip(1520, 720, 3, bships[1]),
            new ImageShip(1520, 720, 3, bships[1]),
            new ImageShip(1520, 800, 4, bships[2]),
            new ImageShip(1520, 800, 4, bships[2]),
            new ImageShip(1520, 880, 5, bships[3])
    };
    //Schiffe Spieler 2
    ImageShip imageShip0[] = {
            new ImageShip(1800 - 1520 - 3 * 40, 640, 2, bships[0]),
            new ImageShip(1800 - 1520 - 3 * 40, 640, 2, bships[0]),
            new ImageShip(1800 - 1520 - 3 * 40, 640, 2, bships[0]),
            new ImageShip(1800 - 1520 - 3 * 40, 640, 2, bships[0]),
            new ImageShip(1800 - 1520 - 3 * 40, 720, 3, bships[1]),
            new ImageShip(1800 - 1520 - 3 * 40, 720, 3, bships[1]),
            new ImageShip(1800 - 1520 - 3 * 40, 720, 3, bships[1]),
            new ImageShip(1800 - 1520 - 3 * 40, 800, 4, bships[2]),
            new ImageShip(1800 - 1520 - 3 * 40, 800, 4, bships[2]),
            new ImageShip(1800 - 1520 - 3 * 40, 880, 5, bships[3])
    };

    private Pane battleshipcontainer = new Pane();

}
