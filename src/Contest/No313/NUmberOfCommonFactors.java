package Contest.No313;

public class NUmberOfCommonFactors {

    //Java easy solution
    //T.C (O Max.min(a,b))

    public int commonFactors(int a, int b) {
        int count = 0;
        if(b > a){
            int temp = b;
            b = a;
            a = temp;
        }
        for(int i = 1; i <= b; i++){
            if(a % i == 0 && b % i == 0){
                count += 1;
            }
        }
        return count;

    }
}
