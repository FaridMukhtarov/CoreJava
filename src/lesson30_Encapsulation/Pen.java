package lesson30_Encapsulation;

public class Pen {

    private String color;
    private int high;


    // Pen Color
    public String getPen() {
        return color;
    }
    public void setPen(String color) {
        if ("red".equals(color) || "blue".equals(color) || "black".equals(color))
           this.color = color;
        else
            throw new IllegalArgumentException();
    }

    // Pen High
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        if (high > 0 && high < 30)
            this.high = high;
        else
            throw new IllegalArgumentException();
    }
}
