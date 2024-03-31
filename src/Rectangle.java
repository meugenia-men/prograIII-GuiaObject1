public class Rectangle {
    private Float broad= 1f;
    private Float high= 1f;

    public Rectangle() {
    }

    public Rectangle(Float broad, Float high) {
        this.broad = broad;
        this.high = high;
    }

    public Float getBroad() {
        return broad;
    }

    public void setBroad(Float broad) {
        this.broad = broad;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public void Area(Float broad,Float high){
        float result = broad*high;
        System.out.println("El area del rectangulo es "+ result);
    }

    public void Perimeter(Float broad,Float high){
        float result = (2*broad) + (2*high);
        System.out.println("El perimetro del rectangulo es "+ result);
    }

    public void InitParameter(){
        this.broad=1f;
        this.high=1f;
    }
}

