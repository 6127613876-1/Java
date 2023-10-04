import java.util.Arrays;
public class insert
{
        public static void main(String[] args) {
            int num=414;
            int pos=2;
            int rollno[] = new int[] {14,12,73,44,25,78};
            int ind=rollno.length;
            for (int i=0;i<rollno.length;i++)
            {
                System.out.print(rollno[i]+" ");
            }
            rollno[pos]=num;
            System.out.print("\n\n");
            for (int i=0;i<rollno.length;i++)
            {
                System.out.print(rollno[i]+" ");
            }
            System.out.print("\n\n");
            Arrays.sort(rollno);
            for (int i=pos;i<ind;i++)
            {
                rollno[i]=rollno[i+1];
                ind--;
            }
            for (int i=0;i<rollno.length;i++)
            {
                System.out.print(rollno[i]+" ");
            }
        }
    }