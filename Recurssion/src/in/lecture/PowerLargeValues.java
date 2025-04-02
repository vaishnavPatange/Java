package in.lecture;

import java.math.BigInteger;

public class PowerLargeValues {
        public static void main(String[] args) {
                BigInteger num = BigInteger.valueOf(4); int pow = 1024;
                long start = System.currentTimeMillis();
                System.out.println(numPower(num, pow));
                long end = System.currentTimeMillis();
                System.out.println(end-start);

                start = System.currentTimeMillis();
                System.out.println(optimizedPower(num, pow));
                end = System.currentTimeMillis();
                System.out.println(end-start);
        }
        static BigInteger optimizedPower(BigInteger num, long pow){
                if(pow == 0){
                        return BigInteger.ONE;
                }
                BigInteger halfPower = optimizedPower(num, pow/2);
                BigInteger halfPowerSq = halfPower.multiply(halfPower);
                if(pow % 2 != 0){
                        halfPowerSq = halfPowerSq.multiply(num);
                }
                return halfPowerSq;
        }

        static BigInteger numPower(BigInteger num, long pow){
                if(pow == 0){
                       return BigInteger.ONE;
                }
                return num.multiply(numPower(num, pow-1));

        }
}
