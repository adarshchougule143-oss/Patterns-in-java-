 class Pattern6 {
    public void pattern6(int N){
        for(int i=1;i<N;i++){
            for (int j=1;j<N-i+1;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Pattern6 res = new Pattern6();
        int N=5;
        res.pattern6(N);
        
    }
}

