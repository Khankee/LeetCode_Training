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
        return id[p] == id[q];
    }

    public static void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }
    }

    public static void main(String[] args) {
        QuickFindUF(10);
        union(1,2);
        union(3,2);
        System.out.println(connected(1,3));
    }
}
