 class Pattern5 {
    public void pattern5(int N){
        for (int i=0;i<=N;i++){
            for(int j=0;j<N-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern5 res = new Pattern5();
        int N=5;
        res.pattern5(N);
    }
}
