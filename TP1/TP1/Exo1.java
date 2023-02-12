/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infof205.tp1;

/**
 *
 * @author Talhaoui Yassin
 */
public class Exo1 {
    
    public static void main(String[] args) {
        int[] tab = {5, 3, 1, 10, 2, 7, 8, 12, -1};        
        System.out.println(localMin(tab));        
        System.out.println(recursiveLocalMin(tab, 0, tab.length-1, tab.length));
    }
    
    public static int localMin(int[] tab)
    {
        int lo = 0;
        int hi = tab.length - 1;
        int m = (hi + lo) / 2;
        if (m == 0 && tab[m] < tab[m + 1])
            return m;
        while (lo <= hi - 1)
        {
            if (tab[m + 1] < tab[m])
            {
                lo = m + 1;
            }
            else
            {
                if (tab[m - 1] > tab[m])
                    return m;
                else
                    hi = m - 1;
            }
            m = (hi + lo) / 2;
        }
        return m;
    }
    
    public static int recursiveLocalMin(int[] tab, int lo, int hi, int n)
    {
        int m = (hi + lo) / 2;        
        if ((m == 0 || tab[m] < tab[m - 1]) && ((m == n - 1) || tab[m] < tab[m + 1]))
            return m;
        else if (tab[m + 1] < tab[m])
            return recursiveLocalMin(tab, m + 1, hi, n);
        return recursiveLocalMin(tab, lo, m - 1, n);
    }    
}
