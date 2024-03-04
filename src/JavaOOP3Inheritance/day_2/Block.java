package JavaOOP3Inheritance.day_2;

public class Block extends Rectangle {
    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 2 * ((this.length * this.width) + (this.length * this.height) + (this.height * this.width));
    }

    @Override
    public Double getRound() {
        return 4 * (this.height + this.width + this.length);
    }

    //kalau ada yg tanya
    public Double getVolume() {
        return height * width * length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
