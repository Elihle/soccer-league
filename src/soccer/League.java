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

        for (Player thePlayer : team1.playerArray) {
            System.out.println(thePlayer.PlayerName);
        }

        for (Player thePlayer : team2.playerArray) {
            System.out.println(thePlayer.PlayerName);
        }

    }
}
