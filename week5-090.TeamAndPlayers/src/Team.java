
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slinger
 */
public class Team {

    private String teamName;
    private int teamSize;
    private ArrayList<Player> playersOnTeam = new ArrayList<Player>();

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamSize = 16;
    }

    public String getName() {
        return this.teamName;
    }

    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }

    public int size() {
        return this.playersOnTeam.size();
    }

    public void addPlayer(Player player) {
        if (size() < this.teamSize) {
            playersOnTeam.add(new Player(player.getName(), player.goals()));
        }

    }

    public int goals() {
        int teamGoals = 0;
        for (Player player : this.playersOnTeam) {
            teamGoals += player.goals();
        }
        return teamGoals;
    }

    public void printPlayers() {
        for (Player player : playersOnTeam) {
            System.out.println(player);
        }
    }
}
