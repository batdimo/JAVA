/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author s504
 */
public class Heap 
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }
    
    public static void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
    
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
    public static void push(int []a, int j){
        int b[]= new int [a.length+1];
        for(int i=0;i < a.length;i++)
        {
            b[i]=a[i];
           
        }
         b[b.length-1]=j;
        sort(b);
          a = new int [b.length];
          for(int i = 0; i < a.length; i++)
          {
              a[i]=b[i];
          }
          sort(a);
          for (int i = 0; i < b.length; i++) {
            int k = a[i];
              System.out.println(k);
        }

        
    }
    public static void main(String[] args) {
        int []a1={4,1,3,2,16,9,10,14,8,7};
        push(a1,66);
        sort(a1);
          for (int i = 0; i < a1.length; i++) {
            int k = a1[i];
              System.out.println(k);
        }
    }
}


