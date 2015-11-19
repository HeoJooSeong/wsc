package koreatech.cse.domain;

/**
 * Created by zoostar on 2015. 11. 19..
 */
public class Sensor {

    private int id;
    private double pir;
    private double sonic;
    private double light;
    private int userid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPir() {
        return pir;
    }

    public void setPir(double pir) {
        this.pir = pir;
    }

    public double getSonic() {
        return sonic;
    }

    public void setSonic(double sonic) {
        this.sonic = sonic;
    }

    public double getLight() {
        return light;
    }

    public void setLight(double light) {
        this.light = light;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
