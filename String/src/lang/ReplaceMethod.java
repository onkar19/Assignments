package lang;
public class ReplaceMethod{
   public static void main(String args[]){
       String str = new String("Site is BeginnersBook.com");

       System.out.print("String after replacing all 'o' with 'p' :" );
       System.out.println(str.replace("com", "net"));

       System.out.print("String after replacing all 'i' with 'K' :" );
       System.out.println(str.replace('i', 'K'));
   }
}