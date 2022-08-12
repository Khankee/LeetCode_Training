package MediumProblems;

import java.util.HashSet;

public class NumberOfProvince {

    int[] cities;

    public int findCircleNum(int[][] isConnected){
        initialize(isConnected.length);
        for (int i = 0; i < isConnected.length; i++){
            for (int j = i + 1; j < isConnected.length; j++){
                if(isConnected[i][j] == 1){
                    union(i,j);
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int city : cities){
            set.add(city);
        }

        return set.size();
    }

    public void initialize(int size){
        cities = new int[size];
        for (int i = 0; i < size; i++){
            cities[i] = i;
        }
    }

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY){
            for(int i = 0; i < cities.length; i++){
                if(cities[i] == rootY){
                    cities[i] = rootX;
                }
            }
        }
    }

    public int find(int x){
        return cities[x];
    }
}
