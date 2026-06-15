
public class Findlastnumber {
    public static int last(int a,int b){
               int mode=a%10;
               int cycle[][]={{},{1},{2,4,6,8},{3,9,7,1},{4,6},{5},{6},{7,9,3,1},{8,4,6,2},{9,1}};
               
                int cyken=cycle[mode].length;
                int index=b%cyken;   
                if(index==0){
                    index=cyken;
                }
                return cycle[mode][index-1];
    }
     public static void main(String[] args) {
          int a=12;
          int b=5;
         System.err.println(last(a,b)); 

     }
}
