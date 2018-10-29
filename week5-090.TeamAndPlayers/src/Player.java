/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slinger
 */
public class Player {

    private String playername;
    private int goals;

    public Player(String playerName) {
        this(playerName, 0);
    }

    public Player(String playerName, int goals) {
        this.playername = playerName;
        this.goals = goals;
    }

    public String getName() {
        return this.playername;
    }

    public int goals() {
        return this.goals;
    }
    
    public String toString() {
        return this.playername + " , goals " + this.goals;
    }

}
