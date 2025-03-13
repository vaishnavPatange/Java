package in.Enums;

public enum Days {
        SUNDAY("Weekend"),
        MONDAY("Weekday"),
        TUESDAY("Weekday"),
        WEDNESDAY("Weekday"),
        THURSDAY("Weekday"),
        FRIDAY("Weekday"),
        SATURDAY("Weekend");

        private String feat;

        public String getFeat(){
                return this.feat;
        }

        private Days(String feat){
                this.feat = feat;
        }

}
