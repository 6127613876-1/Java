public class search {
    public static int search(int[] rollno,int num)
    {
        for (int i=0;i<rollno.length;i++) {
            if(rollno[i]==num)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num=44;
        int rollno[] = new int[] {14,12,73,44,25,78};
        for (int i=0;i<rollno.length;i++)
        {
            System.out.print(rollno[i]+" ");
        }
        int val=search(rollno,num);
        if(val==-1)
            System.out.println("element is not found");
        else
            System.out.println("\nelement position is "+val);
    }
}
