public class Hour {
    private Integer hr;
    private Integer min;
    private Integer sec;

    public Hour() {
    }

    public Hour(Integer hr, Integer min, Integer sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getSec() {
        return sec;
    }

    public void setSec(Integer sec) {
        this.sec = sec;
    }

    public void hhmmss(Integer hr,Integer min,Integer sec){
        if(hr<24&&hr>=0){
            if(min>=0&&min<60){
                if(sec>=0&&sec<60){
                    System.out.println("HORA= "+hr+":"+min+":"+sec);
                }
                else{
                    System.out.println("Segundos incorrectos");
                }
            }
            else{
                System.out.println("Minutos incorrectos");
            }
        }
        else{
            System.out.println("Hora incorrecta");
        }
    }

    public Hour oneMoreSec(Hour x){
        this.sec=x.sec+1;
        return x;
    }

    public Hour oneLessSec(Hour x){
        this.sec=x.sec-1;
        return x;
    }

    @Override
    public String toString{


    }
}
