class Player {
    private String first_name;
    private String last_name;
    private int jersey_number;
    private int age;
    private float height;
    private String position;
    private String team;

    Player(String firstName, String lastName, int jerseyNumber, int age, float height, String position) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.jersey_number = jerseyNumber;
        this.age = age;
        this.height = height;
        this.position = position;
    }

    void setTeam(String team) {
        this.team = team;
    }

    String getTeam() {
        return this.team;
    }

    String getPlayerFirstName() {
        return this.first_name;
    }

    String getPlayerLastName() {
        return this.last_name;
    }

    String getPlayerFullName() {
        return this.first_name + " " + this.last_name;
    }

    int getJerseyNumber() {
        return this.jersey_number;
    }

    int getPlayerAge() {
        return this.age;
    }

    float getPlayerHeight() {
        return this.height;
    }

    String getPlayerPosition() {
        return this.position;
    }
}
