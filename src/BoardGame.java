import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/***
 * This class is called board game and is used to represent a virtual board game. The class will hold onto
 * player names, player game pieces, and player locations. Users should be able to access all necessary
 * information on the game and manipulate game piece locations as necessary.
 * 
 * @author Sierra Jo Sallee
 * @version 03/26/2019
 */
public class BoardGame {

	// Protected linked hash maps that will be used to store player information
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	/***
	 * The constructor for board game objects. Takes no parameters as this constructor is only used to 
	 * instantiate the protected linked hash maps
	 */
	public BoardGame() {
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	/***
	 * This mutator method is used to add players to the board game. The player's game piece and location 
	 * must be initialized within this method
	 * @param playerName A string that represents the player's name
	 * @param gamePiece Represents the game piece for the player
	 * @param initialLocation Represents the location where the game piece is initially located
	 * @return A boolean that represents whether or not the add was successful. Returns false if either linked
	 * hash map couldn't add the necessary information or if the player had already been added
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		// Checks to see if the player has already been added
		boolean start = (playerPieces.get(playerName) == gamePiece) && (playerLocations.get(playerName) == initialLocation);
		boolean ret;
		
		// The if loop runs if the player has not already been added
		if (!start) {
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			ret = (playerPieces.get(playerName) == gamePiece) && (playerLocations.get(playerName) == initialLocation);
		}
		// The else loop runs if the player has already been added
		else { 
			ret = false;
		}
		
		// Returns false if either of the linked hash maps could not add the player or if the player had already
		// been added. Otherwise it returns true.
		return ret;
	}
	
	/***
	 * This accessor method returns the game piece of the given player.
	 * @param playerName A string that represents the player's name
	 * @return 	Returns the game piece of the given player
	 */
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	/***
	 * This accessor method returns the player name of the given game piece. No two players can have the same
	 * game piece, so this method breaks after the first player with the given game piece is found.
	 * @param gamePiece Represents the game piece of the player
	 * @return Returns the string name of the player with the given game piece.
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String ret = new String();
        for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
            if (entry.getValue() == gamePiece) {
            	ret = entry.getKey();
            	break;
            }     	
        }
        if (ret.isEmpty()) {
        	ret = "No player found with that game piece";
        }
		return ret;
	}
	
	/***
	 * This mutator method changes the location of a given player's game piece.
	 * @param playerName Represents the player's name
	 * @param newLocation Represents the new location of the game piece
	 */
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	
	/***
	 * This mutator method moves two player's game pieces.
	 * @param playerNames A string array that holds the two player's names
	 * @param newLocations A location array that holds the two player's new locations
	 * @return IDK
	 */
	// TODO: figure out this fucking return????
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		movePlayer(playerNames[0], newLocations[0]);
		movePlayer(playerNames[1], newLocations[1]);
		return null;
	}
	
	/***
	 * This accessor method returns the location of the game piece for the given player.
	 * @param player A string that represents the player's name
	 * @return Returns the location of the given player
	 */
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	/***
	 * This accessor method returns all players at the given location.
	 * @param loc Represents the location for which the user would like to search for players.
	 * @return Returns an array list of the string names for all the players in the given location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc) {
		ArrayList<String> ret = new ArrayList<String>();
        for (Entry<String, Location> entry : playerLocations.entrySet()) {
        	if (entry.getValue() == loc) {
        		ret.add(entry.getKey());
        	}
        }
		return ret;
	}
	
	/***
	 * This accessor method returns all game pieces at the given location.
	 * @param loc Represents the location for which the user would like to search for game pieces.
	 * @return Returns an array list of all the game pieces in the given location.
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		Object[] playerNames = getPlayersAtLocation(loc).toArray();
		ArrayList<GamePiece> ret = new ArrayList<GamePiece>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			for (Object name : playerNames) {
				if (entry.getKey() == name.toString()) {
					ret.add(entry.getValue());
				}
			}
		}
		return ret;
	}
	
	/***
	 * This accessor method returns a set of strings of all players in the board game.
	 * @return Returns a set of strings of all players in the board game.
	 */
	public Set<String> getPlayers() {
		return playerPieces.keySet();
	}
	
	/***
	 * This accessor method returns a set of locations of all players in the board game.
	 * @return Returns a set of locations of all players in the board game.
	 */
	public Set<Location> getPlayerLocations() {
		// A set is a collection that cannot contain duplicate elements
		// This means that typecasting the collection of locations that playerLocations.values() returns will yield no errors
		return (Set<Location>)playerLocations.values();
	}
	
	/***
	 * This accessor method returns a set of game pieces of all players in the board game.
	 * @return Returns a set of game pieces of all players in the board game.
	 */
	public Set<GamePiece> getPlayerPieces() {
		// A set is a collection that cannot contain duplicate elements
		// This means that typecasting the collection of game pieces that playerPieces.values() returns will yield no errors
		return (Set<GamePiece>)playerPieces.values();
	}
}
