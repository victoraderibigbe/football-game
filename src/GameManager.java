package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GameManager {
    static Scanner scanner = new Scanner(System.in);

    private List<Team> teams = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    GameManager() {
        System.out.println("Welcome to BytesNova football game!");
        this.start();
    }

    void start() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println(
                    "\n 1. Create New Team \n 2. Manage Teams \n 3. Create Player \n 4. View All Players \n 5. Start Match \n 6. Exit Game \n");

            System.out.print("Select a choice from the menu: ");

            switch (scanner.nextInt()) {
                case 1:
                    createTeam();
                    break;
                case 2:
                    manageTeams();
                    break;
                case 3:
                    createPlayer();
                    break;
                case 4:
                    viewPlayers();
                    break;
                case 5:
                    startMatch();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    void createTeam() {
        System.out.println();
        System.out.print("Enter your team name: ");
        String teamName = scanner.next();

        System.out.print("Enter the number of players in your team: ");
        int playerCount = Integer.parseInt(scanner.next());

        System.out.print("Enter your team formation: ");
        String teamFormation = scanner.next();

        Team team = new Team(teamName, playerCount, teamFormation);

        teams.add(team);

        System.out.println(team.getTeamName() + " " + "team has been created!");
    }

    void manageTeams() {
        System.out.println();

        if (teams.size() == 0) {
            System.out.println("No team available. Select an option to create a new team.");
            return;
        }

        System.out.println("Your available teams are:");
        this.viewTeams();
    }

    void createPlayer() {
        System.out.println();

        if (teams.size() == 0) {
            System.out.println(
                    "Oops! You need to have at least one team before you can create a player.");
            return;
        }

        System.out.print("Enter player's first name: ");
        String firstName = scanner.next();

        System.out.print("Enter player's last name: ");
        String lastName = scanner.next();

        System.out.print("Enter player's Jersey number: ");
        int jerseyNumber = Integer.parseInt(scanner.next());

        System.out.print("Enter player's age: ");
        int age = Integer.parseInt(scanner.next());

        System.out.print("Enter player's height: ");
        float height = Float.parseFloat(scanner.next());

        System.out.print("Enter player's position: ");
        String position = scanner.next();

        System.out.println("Available teams:\n");
        this.viewTeams();
        System.out.println();
        System.out.print("Choose a team for the player: ");
        int teamIndex = Integer.parseInt(scanner.next());
        String teamName = "";
        int i;

        Player player = new Player(firstName, lastName, jerseyNumber, age, height, position);

        for (i = 0; i < teams.size(); i++) {
            Team t = teams.get(i);
            if (i == teamIndex - 1) {
                teamName = t.getTeamName();
            }
        }

        player.setTeam(teamName);

        players.add(player);

        System.out.println(
                "Hurayy!" + " " + player.getPlayerFullName() + " " + "has been added to " + player.getTeam());
    }

    void viewPlayers() {
        System.out.println();

        if (players.size() == 0) {
            System.out.println("No player available. Select an option to create player.");
            return;
        }

        System.out.println("Available teams:\n");
        this.viewTeams();

        System.out.print("Select a team to view players: ");
        int teamIndex = Integer.parseInt(scanner.next());

        String team = getTeamFromIndex(teamIndex);

        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);

            if (p.getTeam() == team) {
                System.out.println(i + 1 + "." + " " + p.getPlayerFullName());
            }
        }
    }

    void startMatch() {
        System.out.println("This feature is coming soon...");
    }

    void viewTeams() {
        for (int i = 0; i < teams.size(); i++) {
            Team t = teams.get(i);
            System.out.println(i + 1 + "." + " " + t.getTeamName());
        }
    }

    String getTeamFromIndex(int teamIndex) {
        String teamName = "";

        for (int i = 0; i < teams.size(); i++) {
            if (i == teamIndex - 1) {
                Team t = teams.get(i);
                teamName = t.getTeamName();
            }
        }

        return teamName;
    }
}
