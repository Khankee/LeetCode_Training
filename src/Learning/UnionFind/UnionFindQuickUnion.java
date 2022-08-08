package Learning.UnionFind;

public class UnionFindQuickUnion {
    private int[] root;

    public UnionFindQuickUnion(int size){
        root = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
        }
    }

    //find O(n)
    public int find(int x){
        while(x != root[x]){
            x = root[x];
        }
        return x;
    }

    //Union O(1)
    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY){
            root[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y){
        return find(x) == find(y);
    }
}
