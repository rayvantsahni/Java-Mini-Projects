import java.util.Arrays;

class TransitCalculator
{

    String[] fareOptions = {"Pay-per-ride (single ride): $2.75", "7-day Unlimited Rides: $33.00", "30-day Unlimited Rides: $127.00"}; // stores the fare options available to choose from
    double[] fares = {2.75, 33, 127}; // stores the amount to be paid to avail the particular fare option

    String[] elderlyFareOptions = {"Pay-per-ride (single ride): $1.35", "7-day Unlimited Rides: $16.50", "30-day Unlimited Rides: $63.50"}; // stores the fare options available to choose from for people above 65
    double[] elderlyFares = {1.35, 16.50, 63.50}; // stores the amount to be paid to avail the particular fare option by people above 65


    int days; // number of days the person takes rides
    int rides; // number of rides the person takes
    int age; // age of the person
    boolean disability = false; // person has a disability or not

    TransitCalculator(int numberOfDays, int numberOfRides, int ageOfPerson, boolean disable)
    {
        this.days = numberOfDays;
        this.rides = numberOfRides;
        this.age = ageOfPerson;

        if (disable)
            this.disability = disable;
    }

    // finds the cost per ride for the 2nd fare option i.e 7-day Unlimited Rides: $33.00
    public double unlimited7Price()
    {
        if (age >= 65 || disability)
            return (Math.ceil((double)days / 7) * elderlyFares[1]) / rides;

        else
            return (Math.ceil((double)days / 7) * fares[1]) / rides;
    }

    // finds the price per ride for all the 3 fare options
    public double[] getRidePrices()
    {
        double[] pricePerRide = new double[3];

        if (age >= 65 || disability)
        {
            pricePerRide[0] = elderlyFares[0];
            pricePerRide[1] = unlimited7Price();
            pricePerRide[2] = elderlyFares[2] / rides;
        }

        else
        {
            pricePerRide[0] = fares[0];
            pricePerRide[1] = unlimited7Price();
            pricePerRide[2] = fares[2] / rides;
        }

//        System.out.println(Arrays.toString(pricePerRide));
        return pricePerRide;
    }

    // finds the best fare option as per the minimum cost per ride
    public String getBestFare()
    {
        double[] possiblePrices = getRidePrices();
        int minIndex = 0;

        for (int i = 0; i < 3; i++)
        {
            if (possiblePrices[i] < possiblePrices[minIndex])
                minIndex = i;
        }

        if (age >= 65 || disability)
            return "The best option for you is " + elderlyFareOptions[minIndex] + " at a cost of " + Math.round(possiblePrices[minIndex] * 100.0) / 100.0 + " per ride.";
        else
            return "The best option for you is " + fareOptions[minIndex] + " at a cost of " + Math.round(possiblePrices[minIndex] * 100.0) / 100.0 + " per ride.";
    }

    @Override
    public String toString()
    {
        return "You will ride " + rides + " times in " + days + " days (Age: " + age + " and Disability: " + disability + ")\n";
    }

    public static void main(String[] args)
    {
        TransitCalculator person1 = new TransitCalculator(12, 82, 60, true);
        TransitCalculator person2 = new TransitCalculator(12, 82, 90, false);
        TransitCalculator person3 = new TransitCalculator(23, 16, 42, false);
        TransitCalculator person4 = new TransitCalculator(12, 82, 65, true);

        System.out.print(person1);
        System.out.println(person1.getBestFare());

        System.out.print(person2);
        System.out.println(person2.getBestFare());

        System.out.print(person3);
        System.out.println(person3.getBestFare());

        System.out.print(person4);
        System.out.println(person4.getBestFare());
    }

}
