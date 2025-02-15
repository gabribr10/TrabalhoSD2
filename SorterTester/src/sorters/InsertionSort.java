/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorters;

import java.util.Calendar;
import models.SortResult;

/**
 *
 * @author gabri
 */
public class InsertionSort extends Sort{
    public int[] lista;

    public InsertionSort(int[] lista) {
        this.lista = lista;
    }

    @Override
    public SortResult sort()  
    {  
        Calendar cal1 = Calendar.getInstance();
        int i, key, j;
        long comp = 0, moves = 0;
        for (i = 1; i < lista.length; i++) 
        {  
            
            key = lista[i];  
            j = i - 1;  
            comp++;
            while (j >= 0 && lista[j] > key) 
            {  
                comp++;
                lista[j + 1] = lista[j];  
                j = j - 1;  
            }  
            lista[j + 1] = key; 
            moves++;
        }  
        Calendar cal2 = Calendar.getInstance();
        return new SortResult(cal2.getTimeInMillis()-cal1.getTimeInMillis(), comp, moves, "InsertionSort") ;
    }
    
    @Override
    public void print() {
        for (int i = 0; i <lista.length; i++) {
           System.out.println(lista[i]); 
        }
    }
    
}
