package MediumProblems;

public class LastMomentBeforeAllAntsFall {
    public static void main(String[] args) {

    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int time = 0;

        for (int pos : left) {
            time = Math.max(time, pos);
        }

        for (int pos : right) {
            time = Math.max(time, n - pos);
        }

        return time;
    }
}
