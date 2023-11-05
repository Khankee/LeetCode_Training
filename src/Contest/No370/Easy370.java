package Contest.No370;

public class Easy370 {
    public static void main(String[] args) {

    }

    public int findChampion(int[][] grid) {
        int potentialChamp = 0;
        int n = grid.length;

        for (int i = 1; i < n; i++) {
            if (grid[potentialChamp][i] == 0) {
                potentialChamp = i;
            }
        }

        // At this point, potentialChamp holds the index of the team
        // that is not weaker than any other team it has been compared to.
        // We return this team as the champion.
        return potentialChamp;
    }

}
