package in.important;
// Goldman Sachs
public class FriendsPairing {
        public static void main(String[] args) {
                long st = System.currentTimeMillis();
                System.out.println(friendsPairingWays(37));
                long end = System.currentTimeMillis();
                System.out.println(end - st);
        }

        public static long friendsPairingWays(long num){
                if(num ==1 || num == 2){
                        return num;
                }

                return friendsPairingWays(num - 1) + (num - 1) * friendsPairingWays(num - 2);

        }

}
