package EasyProblems;

import java.util.*;

public class FindModeInBST {

    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        map.put(root.val, 1);

        collect(root.right);
        collect(root.left);

        PriorityQueue<int[]> queue = new PriorityQueue<>((arr1, arr2) -> arr2[0] - arr1[0]);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key :" + key + " value: " + value);
            int[] pair = {value, key};
            queue.offer(pair);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int mode = queue.peek()[0];
        list.add(Objects.requireNonNull(queue.poll())[1]);

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            if(temp[0] != mode)break;
            list.add(temp[1]);
        }

        int[] array = new int[list.size()];

        for(int i = 0 ; i < array.length ; i++){
            array[i] = list.get(i);
        }

        return array;
    }

    public void collect(TreeNode root){
        if(root == null)return;

        int newValue = map.getOrDefault(root.val,0) + 1;
        map.put(root.val, newValue);
        System.out.println("Flag: " + newValue);

        collect(root.right);
        collect(root.left);
    }

}


