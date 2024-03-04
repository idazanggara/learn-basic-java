package JavaOOP5Polymorphism.inheritance1;
// Persegi Panjang
public class Rectangle {
    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getArea() {
        return  length * width;
    }

    public Double getRound() {
        return 2 * (length + width);
    }


    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public String print() {
        return "Retangle{"+
                "length='" + length + "'," +
                "width='" + width +
                "}";
    }
}
