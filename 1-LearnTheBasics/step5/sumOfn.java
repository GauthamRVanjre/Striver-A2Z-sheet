import java.util.ArrayList;
class sumOfn{
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        sumOfN(sum,n,1);
    }

    static void sumOfN(int sum,int n,int i){
        if(i>n){
            System.out.print("sum: "+sum);
            return;
        }
        sum = sum + i;
        sumOfN(sum,n,i+1);
    }

}