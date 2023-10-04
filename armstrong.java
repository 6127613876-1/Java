public class armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 4000; i++) {
                if(isarmstrong(i))
                {
                    System.out.println(i+" ");
                }
        }
            }

    public static boolean isarmstrong(int n) {
        int temp = n;
        int sum = 0;
        int j = String.valueOf(n).length();
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, j));
            n = n / 10;
        }
        return sum == temp;
    }
}