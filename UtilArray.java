public class UtilArray { 
  
      
    public static void stampa(double[] d) { 
        for (double elem : d) { 
            System.out.print(elem + " "); 
        } 
    } 
      
    public static void stampa(int[] d) { 
        for (double elem : d) { 
            System.out.print(elem + " "); 
        } 
    } 
      
    public static void stampa(Object[] a){ 
        for (Object elem : a) { 
            System.out.println(elem); 
        } 
    } 
      
    public static double[] sommaVettoriale(double[] a, double[] b) { 
        // ritorna la somma dei due vettori 
        double[] c = new double[a.length]; 
            if (a.length == b.length){ 
                for (int i = 0; i <= a.length-1; i++){ 
                    c[i]=a[i]+b[i]; 
                } 
                return c; 
            } 
            return null; 
    } 
      
    public static double sommatoria(double[] a) { 
        // ritorna la sommatoria 
        double somma = 0; 
        for (int i = 0; i <= a.length-1; i++){ 
            somma += a[i]; 
        } 
        return somma; 
    } 
      
      
    public static boolean uguali(int[] a, int[] b) { 
        // return true se gli array a e b contengono gli stessi elementi 
         if (a.length == b.length){ 
             for (int i=0; i <= a.length-1; i++ ){ 
                    if (a[i] != b[i]){ 
                        return false; 
                    } 
                return true; 
             }   
         } 
        return false; 
    } 
      
  
}
