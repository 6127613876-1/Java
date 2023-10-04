class par
{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                if(j-i==1)
                    System.out.printf("*");
                else
                    System.out.printf(String.valueOf(j));
            }
                System.out.printf("\n");
        }
    }
}