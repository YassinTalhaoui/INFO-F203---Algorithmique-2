
/**
 *
 * @author Talhaoui Yassin
 */
public class Exo3 {

    public static void main(String[] args) {
    }
    
    public static boolean isHeap(int[] tab)
    {
        int n = tab.length;
        for(int i = 0; i < n; i++)
        {
            if (((i * 2) + 1) < n)
            {
                if (tab[((i * 2) + 1)] > tab[i]) return false;
            }
            if (((i * 2) + 2) < n)
            {
                if (tab[((i * 2) + 2)] > tab[i]) return false;
            }
        }
        return true;
    } 
}