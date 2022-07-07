package EasyProblems;

public class VersionControl {

    public static boolean isBadVersion(int n){
        return n >= 2;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }

    public static int firstBadVersion(int n){
        // 1 2 3 (4) 5 6 7 8 9 10
        int goodVersion = 1;
        int badVersion = n;

        while(goodVersion < badVersion){

            int middle = goodVersion + (badVersion - goodVersion) / 2;
            if(isBadVersion(middle)){
                badVersion = middle;
            } else {
                goodVersion = middle + 1;
            }
        }

        return goodVersion;
    }
}
