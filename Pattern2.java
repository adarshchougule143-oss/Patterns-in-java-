class Pattern2{
    public void pattern2(int n){
        for (int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

public static void main(String[] args) {
    Pattern2 res =new Pattern2();
    int N=5;
    res.pattern2(N);

}}


