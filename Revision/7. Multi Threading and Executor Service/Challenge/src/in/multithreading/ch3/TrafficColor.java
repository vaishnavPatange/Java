package in.multithreading.ch3;

public enum TrafficColor {

        RED(9000),
        GREEN(4000),
        YELLOW(2000);

        private final int onTimeInMillis;

        TrafficColor(int onTimeInMillis){
                this.onTimeInMillis = onTimeInMillis;
        }
        public int getOnTimeInMillis() {
                return onTimeInMillis;
        }
}
