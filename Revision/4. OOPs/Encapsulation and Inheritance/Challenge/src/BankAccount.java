public class BankAccount {

        private final long accountNumber;

        private final String accountHolderName;

        private long balance;

        public long getAccountNumber() {
                return accountNumber;
        }

        public String getAccountHolderName() {
                return accountHolderName;
        }

        public long getBalance() {
                return balance;
        }

//        public void setBalance(long balance) {
//                this.balance = balance;
//        }

        public BankAccount(String accountHolderName, long accountNumber, long balance) {
                this.accountHolderName = accountHolderName;
                this.accountNumber = accountNumber;
                this.balance = balance;
        }


        public void deposit(long depositedMoney){
                this.balance += depositedMoney;
        }

        public boolean withdraw(long withdrawnMoney){
                if(withdrawnMoney < this.balance){
                        this.balance += withdrawnMoney;
                        return true;
                } else{
                        System.out.println("Sorry, You can not withdraw this amount Your account balance is less than amount requested");
                        return false;
                }
        }


}
