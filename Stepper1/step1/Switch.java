public class Switch {
    public static void main(String[] args) {
        double ans = calcArea(1, new int[]{3});
        System.out.println(ans);
    }

    static double calcArea(int ch, int[] arr) {
        double ans = 0.0;
        switch (ch) {
            case 1:
                ans = 3.14 * arr[0] * arr[0];
                break;
            case 2:
                ans = arr[0] * arr[1];
                break;
            default:
                System.out.println("Invalid Choice");
        }
        return ans; // You need to return the value calculated by the method.
    }
}
