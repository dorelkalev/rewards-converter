public class RewardValue {

    private double cash;
    private double miles;

    public RewardValue(double cash) {

        this.cash = cash;
        this.miles = this.cash / 0.0035;
    }

    public RewardValue(int miles){

        this.miles = miles;
        this.cash = this.miles * 0.0035;

    }

    public double getCashValue() {return this.cash;}
    public double getMilesValue() {return this.miles;}



}
