package AlgorithmCourse;

public class UnionFind {
    private static int[] id;

    public static void QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public static boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public static int root(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    public static void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickFindUF(10);
        union(1,2);
        union(3,2);
        System.out.println(connected(1,3));
    }
}
