import java.util.Scanner;

public class RevSort {

    /*public static void inpVals()
    {

        System.out.println("Enter number of array values to sort: ");
        Scanner s = new Scanner(System.in);
        Integer arrSize = s.nextInt();
        Integer nums[] = new Integer[arrSize];

        System.out.println("Enter the array values");
        for (Integer i : nums)
        {
            nums[i] = s.nextInt();
        }
    }*/

    public static void sorter(Integer[] nums)
    {
        Integer tp = 0;
        int i;

        for(i=0; i<nums.length; i++)
        {
            for (int j = i+1; j< nums.length; j++)
            {
                if (nums[i]<nums[j])
                {
                    tp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tp;
                }
            }
        }

    }

    public static void show(Integer[] nums)
    {
        System.out.println("_______SORTED ARRAY IN DESCENDING ORDER______");
        for(Integer i = 0; i< nums.length; i++)
        {
            System.out.print(nums[i] + ",");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter number of array values to sort: ");
        Scanner s = new Scanner(System.in);
        int arrSize = s.nextInt();
        Integer nums[] = new Integer[arrSize];

        System.out.println("Enter the array values");
        for (Integer i = 0; i< nums.length; i++)
        {
            nums[i] = s.nextInt();
        }

        sorter(nums);
        show(nums);

    }
}
