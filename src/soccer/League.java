package soccer;

public class League {
    public static void main(String[] args) {


        Player player1 = new Player();
        player1.PlayerName = "Lihle Menzeleleli";

        Player player2 = new Player();
        player2.PlayerName = "Siba Ndamase";

        Player player3 = new Player();
        player3.PlayerName = "Esona Makepula";

        Player [] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "Barcelona";
        team1.playerArray = thePlayers;


        Team team2 = new Team();
        team2.teamName = "Man United";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].PlayerName = "Sine Molo";

        team2.playerArray[1] = new Player();
        team2.playerArray[1].PlayerName = "Marshall Mathers";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].PlayerName = "Lihle Carter";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.awayTeam;
        goal1.theTime = 33.5;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goals scored after " + currGame.goals[0].theTime + " mins by " + currGame.goals[0].thePlayer.PlayerName + " of " + currGame.goals[0].theTeam.teamName);

        for (Player thePlayer : team2.playerArray) {
            if (thePlayer.PlayerName.matches(".*Mar.*")) {
                System.out.println("Found: " + thePlayer.PlayerName);
                System.out.println("Last Name: " + thePlayer.PlayerName.split(" ")[1]);
            }
        }

        for (Player thePlayer : team1.playerArray) {
            String name [] = thePlayer.PlayerName.split(" ");
            StringBuilder familyNameFirst = new StringBuilder();
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
        }

//        for (Player thePlayer : team1.playerArray) {
//            System.out.println(thePlayer.PlayerName);
//        }
//
//        for (Player thePlayer : team2.playerArray) {
//            System.out.println(thePlayer.PlayerName);
//        }

    }
}
