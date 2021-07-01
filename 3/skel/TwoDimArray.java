/** skeleton file for
Dwayne, Jiyoon, and Benson
 class twoDimArray
  ...practice working with 2D arrays
*/

public class TwoDimArray
{

  //print each row of 2D integer array a on its own line,
  // using a FOR loop
  public static void print1( int[][] a ) {
   for (int i =0;i <a.length; i++){
      for (int j=0; j < a[i].length;j++){
        System.out.print(a[i][j] + " ");
     }
     System.out.println();
   }
   System.out.println();
  }


  //print each row of 2D integer array a on its own line,
  // using a FOREACH loop
  public static void print2( int[][] a ) {
    // int maxSoFar = numbers[0];

    //Trying to apply the for loop syntax to print all the items in the 2d array
      for(int i[] : a){
        for(int j : i){ //stores and prints every item in the i array
          System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println();

  }


  //return sum of all items in 2D integer array a
  public static int sum1( int[][] a ) {
    int sumAmt = 0;
    for(int i[]: a){
        for(int j : i){
          sumAmt =+ j;
            System.out.print(sumAmt);
            
       } 
       
    }

    return sumAmt;
  }


  //return sum of all items in 2D integer array a
  // using helper fxn sumRow
  public static int sum2( int [][] m ) {
    int sum = 0;
    for (int row = 0; row < m.length; row++){
      sum += sumRow(row, m);
    }
    return sum;
  }


  //return sum of all items on row r of 2D integer array a
  // using a FOR loop
  public static int sumRow(int r, int[][] a) {
    int sum = 0;
    for (int cell = 0; cell < a.length; cell++){
      sum += a[r][cell];
    }

    return sum;
  }


  //return sum of all items on row r of 2D integer array a
  // using a FOREACH loop
  public static int sumRow2( int r, int[][] m ) {
    int result = 0; //initalizes our result, running sum
    for (int i:m[r]){
      result += i; //"tacks on" current element to result
    }
    return result;
  }


  public static void main( String [] args )
  {
		
       int [][] m1 = new int[4][2];
       int [][] m2 = { {2,4,6}, {3,5,7} };
       int [][] m3 = { {2}, {4,6}, {1,3,5} };
       System.out.println("Print 1:");
       print1(m1);
       print1(m2);
       print1(m3);
       System.out.println("Print 2:");
       print2(m1);
       print2(m2);
       print2(m3);
       /* ~~~v~~~~~slide~me~down~as~you~test~~~~~~~~~~~~~~~v~~~
      
       System.out.print("testing sum1...\n");
       System.out.println("sum m1 : " + sum1(m1));
       System.out.println("sum m2 : " + sum1(m2));
       System.out.println("sum m3 : " + sum1(m3));
       System.out.print("testing sum2...\n");
       System.out.println("sum m1 : " + sum2(m1));
       System.out.println("sum m2 : " + sum2(m2));
       System.out.println("sum m3 : " + sum2(m3));
       ~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~*/
  }//end main()

}//end class TwoDimArray