public class RengeInput {
 private int MaximumTemp, MinimumTemp, avarageTemp;

    public RengeInput() {
        MaximumTemp = 80;
        MinimumTemp = 60;
        setAvaTem();
    }
    public RengeInput(int min, int max) {
        MaximumTemp = max;
        MinimumTemp = min;
        setAvaTem();
    }
    private void setAvaTem(){
        avarageTemp = ( MaximumTemp + MinimumTemp) / 2;

    }
    public void up(){
        avarageTemp = Math.min(avarageTemp+1,MaximumTemp);
    }
    public void down(){
        avarageTemp = Math.max(avarageTemp-1,MinimumTemp);
    }

    public int getAvarageTemp() {
        return this.avarageTemp;
    }
}