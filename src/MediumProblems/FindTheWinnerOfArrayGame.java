package MediumProblems;

public class FindTheWinnerOfArrayGame {
    public static void main(String[] args) {
        int[] arr = {3,2,1};

        System.out.println(getWinner(arr, 10));
    }


    public static int getWinner(int[] arr, int k) {
        if (k == 1 || arr.length == 2) return Math.max(arr[0], arr[1]);

        int winner = Math.max(arr[0], arr[1]);
        int rounds = k - 1;

        for (int i = 2; i < arr.length; i++) {
            if (winner < arr[i]) {
                winner = arr[i];
                rounds = k - 1;
            } else {
                rounds -= 1;
                if (rounds == 0) break;
            }
        }


        return winner;
    }
}
