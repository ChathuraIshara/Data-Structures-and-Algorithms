// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void findMaxSubArrWithThreeForLoops(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<=arr.length-1;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];

                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }

    public static void findMaxSubArrayWithTwoForLoops(int[] arr)
    {

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int sum=0;
            for(int j=i;j<=arr.length-1;j++)
            {

                sum+=arr[j];
                max=Math.max(sum,max);

            }
        }
        System.out.println(max);

    }



    public static void main(String[] args) {

    }
}
