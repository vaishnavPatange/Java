public class ClassandObjects{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Orange");
        System.out.println(p1.getColor());
        p1.setTip(8);
        System.out.println(p1.getTip());
        p1.setColor ("Blue");
        System.out.println(p1.getColor());
    }
}

class Pen{
   private String color;
   private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Students{
    String name;
    int no;
    float percentage;

    void setPercentage(int math, int phy, int chm){
        percentage = (math + phy + chm)/3;
    }
}