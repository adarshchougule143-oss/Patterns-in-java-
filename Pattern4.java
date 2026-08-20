class Pattern4{
    public void pattern4(int n){
        for (int i =1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String [] args){
        Pattern4 res= new Pattern4();
        int N=5;
        res.pattern4(N);
    }
}
