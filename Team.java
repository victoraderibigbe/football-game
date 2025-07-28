class Team {
    private String team_name;
    private int player_count;
    private String[] players;
    private String formation;

    Team(String teamName, int playerCount, String formation) {
        this.team_name = teamName;
        this.player_count = playerCount;
        this.formation = formation;
    }

    String getTeamName() {
        return this.team_name;
    }

    int getNumberOfPlayers() {
        return this.player_count;
    }

    void setPlayerNames(String[] players) {
        this.players = players;
    }

    String[] getPlayerNames() {
        return this.players;
    }

    String getTeamFormation() {
        return this.formation;
    }
}