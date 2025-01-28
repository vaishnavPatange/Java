public class operations {
    
        public static int GetIthbit(int n, int i){
            int bitMask = 1<<i;
            if((n & bitMask) == 0){
                return 0;
            } else{
                return 1;
            }
        }

        public static int Setithbit(int n, int i){
            int bitMask = 1<<i;
            return n | bitMask;
        }

        public static int ClearIthbit(int n, int i){
            int bitMask = ~(1<<i);
            return n & bitMask;
        }

        public static int updateBit(int n, int i, int newBit){
            n = ClearIthbit(n, i);
            int bitMask = newBit<<i;
            return n | bitMask;

        }
        public static void main(String args[]){
            //System.out.println(GetIthbit(5 , 2));
            //System.out.println(Setithbit(12, 1));
            System.out.println(updateBit(12, 2, 0));
            //System.out.println(ClearIthbit(12, 3));
        }
}

