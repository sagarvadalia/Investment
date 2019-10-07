public class InvestmentClient {

    public static void main(String[] args) {
        System.out.println("testing the investment client");
        //testing the default constructor
        Investment defaultInvestment = new Investment();
        //should have all values at 0 and a name of ""
        //testing accessors
        System.out.println("name should be empty: " + defaultInvestment.getName());
        System.out.println("initial investment should be zero: " + defaultInvestment.getInitialInvestment());
        System.out.println("interest rate should be zero: " + defaultInvestment.getInterestRate());
        //testing mutators
        defaultInvestment.setName("mutated name");
        defaultInvestment.setInitialInvestment(500);
        defaultInvestment.setInterestRate(10);
        System.out.println("name should be mutated name: " + defaultInvestment.getName());
        System.out.println("initial investment should be 500: " + defaultInvestment.getInitialInvestment());
        System.out.println("interest rate should be .1 (10 / 100 for 10%): " + defaultInvestment.getInterestRate());
        //testing tostring
        System.out.println("tostring: " + defaultInvestment.toString());
        //testing the future values
        System.out.println("value after 10 years should be 1296.87123 : " + defaultInvestment.getValueAfterXYears(10));
        //test first overloaded constructor that does not change the interest rate
        Investment secondInvestment = new Investment("second", 100);
        //testing accessors
        System.out.println("name should be second: " + secondInvestment.getName());
        System.out.println("initial investment should be 100: " + secondInvestment.getInitialInvestment());
        System.out.println("interest rate should be .1 since its static: " + secondInvestment.getInterestRate());
        //testing equals
        System.out.println("should return false: " + defaultInvestment.equals(secondInvestment));
        //checking final overloaded constructor that chenges the static interest rate for everybody
        Investment thirdInvestment = new Investment("third", 25, 20);
        //testing accessors
        System.out.println("name should be third: " + thirdInvestment.getName());
        System.out.println("initial investment should be 25: " + thirdInvestment.getInitialInvestment());
        System.out.println("interest rate should be .2: " + thirdInvestment.getInterestRate());
        System.out.println("interest rate should be .2 since its static: " + secondInvestment.getInterestRate());
        //range checking
        thirdInvestment.setInterestRate(-5);
        System.out.println("interest rate should be 0: " + thirdInvestment.getInterestRate());
        System.out.println("interest rate should be 0 since its static: " + secondInvestment.getInterestRate());
        thirdInvestment.setInitialInvestment(-200);
        System.out.println("initial investment should be 0: " + thirdInvestment.getInitialInvestment());

    }
}
