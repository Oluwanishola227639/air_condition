public class AirConditioner {
    private int temperature = 16;
    private boolean isOn;
    private String productName;


    public AirConditioner(boolean isOn, String productName) {
        this.isOn = isOn;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        if (isOn) System.out.println("isOn " + true);
        else System.out.println("isOn " + false);
    }

    public void setTemperature(int temperature) {
        if (temperature <= 15 || temperature >= 31)
            System.out.println("invalid input! [please enter values between 16 and 30]");
        else this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        } else {
            System.out.println("invalid! can't go beyond maximum temperature");

        }
    }

    public void decreaseTemperature() {
        if (temperature > 16)  {
            temperature--;
        } else {
            System.out.println("invalid! can't go beyond minimum temperature");
        }

    }
}
