/**
* Class that creates new players and get informations about existing players
*/

package hangman;

import java.io.Serializable;

public class Players implements Serializable{
	
	private String name;
	private int scores;

	public Players(String name, int scores) {
		this.name = name;
		this.scores = scores;
	}
	
	
	
	/**
	* Method that returns the name of the player
	* @return the name of the player
	*/
	public String getName() {
		return name;
	}

	/**
	* Method that returns the score of the player
	* @return the score of the player
	*/
	public int getScores() {
		return scores;
	}

	

}
