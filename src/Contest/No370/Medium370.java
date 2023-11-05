package Contest.No370;


public class Medium370 {
    public static void main(String[] args) {

    }

    public int findChampion(int n, int[][] edges) {
        // Array to keep track of the in-degree of each node.
        int[] inDegree = new int[n];

        // Process the edges to compute the in-degree of each node.
        for (int[] edge : edges) {
            // Since team u is stronger than team v, we increment the in-degree of team v.
            inDegree[edge[1]]++;
        }

        // Find the node with zero in-degree.
        int champion = -1;
        for (int i = 0; i < n; i++) {
            // If the in-degree is zero, this team is not weaker than any other team.
            if (inDegree[i] == 0) {
                // If we already found one champion, and we find another, return -1 for no unique champion.
                if (champion != -1) {
                    return -1;
                }
                champion = i;
            }
        }

        // Return the champion, or -1 if there was no unique champion.
        return champion;
    }


}
