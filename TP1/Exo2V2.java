public class Exo2V2
{
    public static int MaxBitonic(int[] a, int lo, int hi)
    {
        if (lo == hi)
            return hi;
        int mid = (lo + hi) / 2;
        if (a[mid] > a[mid + 1])
            return MaxBitonic(a, lo, mid);
        else
        return MaxBitonic(a, mid + 1, hi);
    }

    public static boolean binarySearchBitonic(int[] a, int val, int lo, int hi, boolean increase)
    {
        if (hi == lo)
        {
            return a[lo] == val;
        }
        int mid = (lo + hi) / 2;
        if (a[mid] == val)
        {
            return true;
        }
        if (increase) 
        {
            if (a[mid] < val)
            {
                return binarySearchBitonic(a, val, mid + 1, hi, increase);
            }
            else
            {
                return binarySearchBitonic(a, val, lo, mid, increase);
            }
        }
        else
        {
            if (a[mid] < val)
            {
                return binarySearchBitonic(a, val, lo, mid, increase);
            }
            else
            {
                return binarySearchBitonic(a, val, mid + 1, hi, increase);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = { 1, 3, 5, 21, 20, 19, 10 };
        int max = MaxBitonic(a, 0, a.length - 1);
        System.out.println(max);
        System.out.println(binarySearchBitonic(a, 3, 0, max, true) || binarySearchBitonic(a, 3, max + 1, a.length - 1, false));
    }
}