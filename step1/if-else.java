import java.util.Scanner;
class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        compare(n1,n2);
    }

    static void compare(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }else if(n1<n2){
            System.out.println(n1+" is less than "+n2);
        }else{
            System.out.println(n1+" is equal to "+n2);
        }
    }
}