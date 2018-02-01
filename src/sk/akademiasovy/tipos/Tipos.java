package sk.akademiasovy.tipos;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Tipos
{


    private Object list;

    public int[] getArr()
    {
        return arr;
    }

    private int [] arr; //pole

    public Tipos()
    {
        arr = new int[5]; //5 prvkové pole
    }

    public void generate()
    {
        Random random = new Random();

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=random.nextInt(35)+1;
        }
    }

    public void sort ()
    {
        Arrays.sort(arr);
    }

    public void print()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public void printNewBets(List<Bet>) {
        if(list==null || list.size()==0)
    }
}ctr