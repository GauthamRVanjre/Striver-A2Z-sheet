public class Pattern7{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<5;i++){

            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<(2*i)+1;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }
}