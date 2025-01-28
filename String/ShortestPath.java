public class ShortestPath {
    public static float getShortestPath(String dir){
        int x = 0, y = 0;
        for(int i=0; i<dir.length(); i++){
            if(dir.charAt(i) == 'E'){
                x++;
            }
            else if(dir.charAt(i) == 'W'){
                x--;
            }
            else if(dir.charAt(i) == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        int sqX = x*x;
        int sqY = y*y;
        return (float)Math.sqrt(sqX + sqY);
    }
    public static void main(String args[]){
        String dir = "NS";
        System.out.println(getShortestPath(dir));
    }
}
