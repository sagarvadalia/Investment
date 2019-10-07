//Sagar Vadalia
 public class Investment {
    //data values
    private String name;
    private double initialInvestment;
    private static double interestRate;
    //default constructor defaulting to an empty name, an initial investment of 0 and an interest rate of 0
    public Investment(){
        setName("");
        setInitialInvestment(0.0);
        setInterestRate(0);
    }
    public Investment(String name, double initialInvestment){
        setName(name);
        setInitialInvestment(initialInvestment);
    }
    public Investment(String name, double initialInvestment, double interestRate){
        setName(name);
        setInitialInvestment(initialInvestment);
        setInterestRate(interestRate);
    }
    //accessors
    public String getName(){
        return this.name;
    }
    public double getInitialInvestment(){
        return this.initialInvestment;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    //mutators
    public void setName(String name){
        this.name = name;
    }

    public void setInitialInvestment(double initialInvestment) {
        if(initialInvestment >= 0){
            this.initialInvestment = initialInvestment;
        }
        else {
            System.out.println("your initial investment amount cannot be set to a negative value. we set it to 0");
            this.setInitialInvestment(0);
        }

    }
    //should be a restricted mutator for the static variable
    public void setInterestRate(double interestRate){
        if(interestRate >= 0){
            this.interestRate = interestRate / 100;
        }
        else {
            System.out.println("your interest rate cannot be set to a negative value. we set it to 0");
            this.setInterestRate(0);
        }

    }
    //To string method
    public String toString(){
        return "The name is: " + this.getName() + "the initial investment is: " + this.getInitialInvestment() + "and the interest rate is: " + this.getInterestRate();
    }
    //equals method
    //no need to check static value of investment rate since that is ubiquitous
    public boolean equals(Investment otherInvestment){
        return (this.name == otherInvestment.name && this.initialInvestment == otherInvestment.initialInvestment);
    }
    /*get the future value of your investment
    * params: years
    * returns: Future value = investment(1 + interest rate)year
    * */

    public double getValueAfterXYears(int yearCount){
        if(yearCount > 0){
            return this.initialInvestment * Math.pow((1 + this.getInterestRate()), yearCount);
        }
        System.out.println("we only calculate with years above one");
        return 0;
    }

}
