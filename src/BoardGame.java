import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {

	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		GamePiece tryPieces = playerPieces.put(playerName, gamePiece);
		Location tryLocations = playerLocations.put(playerName, initialLocation);
		boolean ret = (tryPieces != null) | (tryLocations != null);
		return ret;
	}
	
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		return "";
	}
	
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		return null;
	}
	
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc) {
		return null;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		return null;
	}
	
	public Set<String> getPlayers() {
		return null;
	}
	
	public Set<Location> getPlayerLocations() {
		return null;
	}
	
	public Set<GamePiece> getPlayerPieces() {
		return null;
	}
}
