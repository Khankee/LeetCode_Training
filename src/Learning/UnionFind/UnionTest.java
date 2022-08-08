package Learning.UnionFind;

public class UnionTest {
    public static void main(String[] args) {
        /*UnionFindQuickFind uf = new UnionFindQuickFind(10);
        uf.union(1,2);
        uf.union(2,5);
        uf.union(5,6);
        uf.union(6,7);
        uf.union(3,8);
        uf.union(8,9);
        System.out.println(uf.connected(1,5));
        System.out.println(uf.connected(5,7));
        System.out.println(uf.connected(4,9));

        uf.union(9,4);
        System.out.println(uf.connected(4,9));*/


        UnionFindQuickUnion qu = new UnionFindQuickUnion(10);
        qu.union(1,2);
        qu.union(2,5);
        qu.union(5,6);
        qu.union(6,7);
        qu.union(3,8);
        qu.union(8,9);
        System.out.println(qu.connected(1,5));
        System.out.println(qu.connected(5,7));
        System.out.println(qu.connected(4,9));

        qu.union(9,4);
        System.out.println(qu.connected(4,9));
    }
}
