
public class geed03 {
  public static int  lastfun(int a){
             int conut=0;
             
          while (a>0) {
             int lastelement=a%10;
             if(lastelement !=0 && a%lastelement==0){
                   conut=conut+1;
             }
             a=a/10;
          }
          return conut;
  }
  public static void main(String[] args) {
   int number=17;
   System.out.println(lastfun(number));        
  }
    
}