package Contest;

import java.util.Arrays;

public class MaxNumberOfGroups {
    public static void main(String[] args) {
        int[] grades = {10,6,12,7,3,5};
        int a = maximumGroups(grades);
        System.out.println(a);
    }

    public static int maximumGroups(int[] grades){
        Arrays.sort(grades);
        int groups = 1;
        int studCount = 1;
        int maxGrade = grades[0];

        for (int i = 1; i < grades.length;){
            int tempMaxGrade = 0;
            int tempStudCount = 0;
            while(maxGrade > tempMaxGrade || studCount >= tempStudCount){
                tempMaxGrade += grades[i];
                tempStudCount++;
                i++;
            }
            maxGrade = tempMaxGrade;
            studCount = tempStudCount;
            groups++;
        }


        return groups;
    }
}
