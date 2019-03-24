import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.*;

public class BoardGameTest {

	public static void main(String[] args) {
		GamePiece gp1 = GamePiece.RED_RACER;
		GamePiece gp2 = GamePiece.BLUE_RACER;
		GamePiece gp3 = GamePiece.MAGENTA_RACER;
		GamePiece gp4 = GamePiece.RED_THIMBLE;
		GamePiece gp5 = GamePiece.BLUE_BOOT;
		GamePiece gp6 = GamePiece.GREEN_BOOT;
		GamePiece gp7 = GamePiece.YELLOW_BOOT;

		Location l1 = Location.KITCHEN;
		Location l2 = Location.CONSERVATORY;
		Location l3 = Location.DINING_ROOM;
		Location l4 = Location.BALLROOM;
		Location l5 = Location.STUDY;
		Location l6 = Location.HALL;
		Location l7 = Location.LOUNGE;
		Location l8 = Location.LIBRARY;
		Location l9 = Location.BILLIARD_ROOM;

		BoardGame game = new BoardGame();
		
		Assert.assertEquals(game.addPlayer("Player1", gp1, l1), true);
		Assert.assertEquals(game.addPlayer("Player2", gp2, l2), true);
		Assert.assertEquals(game.addPlayer("Player3", gp3, l3), true);
		Assert.assertEquals(game.addPlayer("Player4", gp4, l4), true);
		Assert.assertEquals(game.addPlayer("Player5", gp5, l5), true);
		Assert.assertEquals(game.addPlayer("Player6", gp6, l6), true);
		Assert.assertEquals(game.addPlayer("Player7", gp7, l7), true);
		
		Assert.assertEquals(game.addPlayer("Player1", gp1, l1), false);
		Assert.assertEquals(game.addPlayer("Player2", gp2, l2), false);
		Assert.assertEquals(game.addPlayer("Player3", gp3, l3), false);
		Assert.assertEquals(game.addPlayer("Player4", gp4, l4), false);
		Assert.assertEquals(game.addPlayer("Player5", gp5, l5), false);
		Assert.assertEquals(game.addPlayer("Player6", gp6, l6), false);
		Assert.assertEquals(game.addPlayer("Player7", gp7, l7), false);
		
		Assert.assertEquals(game.getPlayerGamePiece("Player1"), gp1);
		Assert.assertEquals(game.getPlayerGamePiece("Player2"), gp2);
		Assert.assertEquals(game.getPlayerGamePiece("Player3"), gp3);
		Assert.assertEquals(game.getPlayerGamePiece("Player4"), gp4);
		Assert.assertEquals(game.getPlayerGamePiece("Player5"), gp5);
		Assert.assertEquals(game.getPlayerGamePiece("Player6"), gp6);
		Assert.assertEquals(game.getPlayerGamePiece("Player7"), gp7);
		
		Assert.assertEquals(game.getPlayerWithGamePiece(gp1), "Player1");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp2), "Player2");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp3), "Player3");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp4), "Player4");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp5), "Player5");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp6), "Player6");
		Assert.assertEquals(game.getPlayerWithGamePiece(gp7), "Player7");
		
		Assert.assertEquals(game.getPlayersLocation("Player1"), l1);
		Assert.assertEquals(game.getPlayersLocation("Player2"), l2);
		Assert.assertEquals(game.getPlayersLocation("Player3"), l3);
		Assert.assertEquals(game.getPlayersLocation("Player4"), l4);
		Assert.assertEquals(game.getPlayersLocation("Player5"), l5);
		Assert.assertEquals(game.getPlayersLocation("Player6"), l6);
		Assert.assertEquals(game.getPlayersLocation("Player7"), l7);
		
		game.movePlayer("Player1", l8);
		game.movePlayer("Player2", l8);
		game.movePlayer("Player3", l8);
		game.movePlayer("Player4", l8);
		game.movePlayer("Player5", l9);
		game.movePlayer("Player6", l9);
		game.movePlayer("Player7", l9);

		ArrayList<String> playersAtL8 = new ArrayList<String>();
		ArrayList<String> playersAtL9 = new ArrayList<String>();
		
		playersAtL8.add("Player1");
		playersAtL8.add("Player2");
		playersAtL8.add("Player3");
		playersAtL8.add("Player4");
		
		playersAtL9.add("Player5");
		playersAtL9.add("Player6");
		playersAtL9.add("Player7");
		
		ArrayList<GamePiece> piecesAtL8 = new ArrayList<GamePiece>();
		ArrayList<GamePiece> piecesAtL9 = new ArrayList<GamePiece>();

		piecesAtL8.add(gp1);
		piecesAtL8.add(gp2);
		piecesAtL8.add(gp3);
		piecesAtL8.add(gp4);
		
		piecesAtL9.add(gp5);
		piecesAtL9.add(gp6);
		piecesAtL9.add(gp7);

		Assert.assertEquals(game.getPlayersAtLocation(l8), playersAtL8);
		Assert.assertEquals(game.getPlayersAtLocation(l9), playersAtL9);
		
		Assert.assertEquals(game.getGamePiecesAtLocation(l8), piecesAtL8);
		Assert.assertEquals(game.getGamePiecesAtLocation(l9), piecesAtL9);

		Set<String> playerSet = new HashSet<String>();
		playerSet.add("Player1");
		playerSet.add("Player2");
		playerSet.add("Player3");
		playerSet.add("Player4");
		playerSet.add("Player5");
		playerSet.add("Player6");
		playerSet.add("Player7");
		
		Assert.assertEquals(game.getPlayers(), playerSet);
		
		Set<Location> locationSet = new HashSet<Location>();
		locationSet.add(l8);
		locationSet.add(l9);
		
		Assert.assertEquals(game.getPlayerLocations(), locationSet);
		
		Set<GamePiece> gamePieceSet = new HashSet<GamePiece>();
		gamePieceSet.add(gp1);
		gamePieceSet.add(gp2);
		gamePieceSet.add(gp3);
		gamePieceSet.add(gp4);
		gamePieceSet.add(gp5);
		gamePieceSet.add(gp6);
		gamePieceSet.add(gp7);	
		
		Assert.assertEquals(game.getPlayerPieces(), gamePieceSet);
	}

}
