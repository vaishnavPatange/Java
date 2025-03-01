class NumSum {
        public static void main(String[] args) {
                int n = 5;
                int sum=0;
                //using for loop
                for(int i=0; i<=n; i++){
                        sum += i;
                }
                System.out.println(sum);

                //using formula
                System.out.println(n*((n+1)/2));

                //using recursion
                System.out.println(getSum(n));

        }
        public static int getSum(int n){
                if(n==0) return n;
                return n + getSum(n-1);
        }
}