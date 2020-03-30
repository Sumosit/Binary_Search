import java.util.Random;
import java.util.Scanner;

public class Binary_Search {
    static int count = 1;
    public static int Binary_Search(int num[], int search, int start, int finish, int half)
    {
        int id;
        if (search == num[half])
        {
            id = half;
            return id;
        }
        else if (search == num[half + 1])
        {
            id = half + 1;
            return id;
        }
        else if (search == num[half - 1])
        {
            id = half - 1;
            return id;
        }
        else if (search > num[half])
        {
            start = half + 1;
            half = start + Character.getNumericValue((finish - start) / 2);
        }
        else if (search < num[half])
        {
            finish = half - 1;
            half = start + Character.getNumericValue((finish - start) / 2);
        }
        count++;
        Binary_Search(num, search, start, finish, half);
        return 0;
    }
    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int num[];
        num = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            num[i] = rand.nextInt(1000);
        }
        int len = num.length;
        int start = 1, finish = len, half = Character.getNumericValue(finish / 2);
        int search, id;
        System.out.println(num[555]);
        System.out.println("Enter a number between 1 - " + len);
        search = in.nextInt();
        id = Binary_Search(num, search, start, finish, half);
            System.out.println("Search number: " + search);
        System.out.println("Id of search number: " + id);
        System.out.println(search + num[id]);
        System.out.println("Number of operations: " + count);
    }
}
