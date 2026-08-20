 class Pattern3 {
    public void pattern3(int n){
         for(int i=1;i<5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            } System.out.println();
         }
        }
 public static void main(String[] args){
    Pattern3 res =new Pattern3();
    int N=5;
    res.pattern3(N);
 }    
}




