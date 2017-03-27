import java.util.Arrays;
class Array2 {
    public static void printArray(int[] iarray) {
        int length = iarray.length;
        int i;
         for (i = 0; i < length; i++){
             System.out.print(iarray[i]);
             System.out.print(" . ");
       }
   }
   
    public static void main (String a[]){
        int i;
        int[] ia ;ia = new  int[20];
        
          ia[0] = -4;
          ia[1] = 3;
          ia[2] = -1;
          ia[3] = 1;
          ia[4] = 0;
          ia[5] = 1;
          ia[6] = -1;
          ia[7] = 1;
          ia[8] = -1;
          ia[9] = 0;
          ia[10] = 1;
          ia[11] = 2;
          ia[12] = -1;
          ia[13] = 0;
          ia[14] = 1;
          ia[15] = 2;
          ia[16] = -1;
          ia[17] = 0;
          ia[18] = 1;
          ia[19] = 2;
            
            
         //printArray
		// sort array
		    printArray(ia);
		    Arrays.sort(ia);
		    printArray(ia);
		//print array
            System.out.println();
    }
}
