/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package infof205.tp1;

/**
 *
 * @author Talhaoui Yassin
 */
public class Exo2 {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        System.out.println(elemInTab(arr, 0, arr.length-1, arr.length, 20));
        
    }
    
    public static int getTopElem(int[] tab, int lo, int hi, int n)
    {
        int m = (lo + hi)/2;
        if (m ==0 || tab[m-1] <= tab[m] && m == n-1 || tab[m+1] <= tab[m])
        {
            return m;
        }
        else if (m > 0 && tab[m-1] >= tab[m])
        {
            return getTopElem(tab, lo, m-1, n);
        }
        return getTopElem(tab, m+1, hi, n);
    }
    
    //  1 2 3 4 10 3 2 1
    
    public static boolean elemInTab(int[] tab, int lo, int hi, int n, int elem)
    {
        int m = (lo + hi)/2;
        if ((m ==0 || m == n-1) && tab[m] == elem)
        {
            return true;
        }
        else if (m > 0 && tab[m-1] >= tab[m])
        {
            return elemInTab(tab, lo, m-1, n, elem);
        }
        
        return elemInTab(tab, m+1, hi, n, elem);
    }
    
    public static boolean inTab(int[] tab, int elem)
    {
        int topElem = getTopElem(tab, 0, tab.length-1, tab.length);
        boolean found = false;
        int lo = 0;
        int hi = tab.length-1;
        int m = (lo + hi)/2;
        
        return found;
        
    }
}
