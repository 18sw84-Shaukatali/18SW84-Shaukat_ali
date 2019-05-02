import java.util.*;
class Search

{
     public static void main(String[ ] args)
     {
           int[ ] numbers = { 12, 13, 2, 33, 23, 31, 22, 6, 87, 16 };
           Scanner n=new Scanner(System.in);
           
           int a=n.nextInt();
           int i = 0;
           boolean found = false;    // set the boolean value to false until the key is found

          for ( i = 0; i < numbers.length; i++)
          {
                 if (numbers[ i ]  == a)
                {
                         found = true;      
                         break;
                 }
           }

          if (found)   //When found is true, the index of the location of key will be printed.
          {
                System.out.println("Found " + a + " at index " + i + ".");
          }
          else
          {
                System.out.println(a + "is not in this array.");
          }
      }
}
