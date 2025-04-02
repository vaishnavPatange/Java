package in.lecture;

public class Power {
        public static void main(String[] args) {
                long num = 4, pow = 1024;
                long start = System.currentTimeMillis();
                System.out.println(numPower(num, pow));
                long end = System.currentTimeMillis();
                System.out.println(end-start);

                start = System.currentTimeMillis();
                System.out.println(optimizedPower(num, pow));
                end = System.currentTimeMillis();
                System.out.println(end-start);
        }

        static long optimizedPower(long num, long pow){
                if(pow == 0){
                        return 1;
                }
                long halfPower = optimizedPower(num, pow/2);
                long halfPowerSq = halfPower * halfPower;
                if(pow % 2 != 0){
                        halfPowerSq = num * halfPowerSq;
                }
                return halfPowerSq;
        }

        static long numPower(long num, long pow){
                if(pow == 0){
                        return 1;
                }
                return num * numPower(num, pow-1);

        }

}
