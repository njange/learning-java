class Main {
    public static void main(String[] args) {
        int n = 10;
        UnionFind uf = new UnionFind(n);
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(3, 4);
        uf.union(4, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(7, 8);
        uf.union(8, 9);
        uf.union(9, 10);
        System.out.println(uf.find(1, 10));
    }
}