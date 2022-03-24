import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        final int totalStudents = 10;
        String[] names = new String[totalStudents];
        int[] randVals = new int[1000];
        Random rnd = new Random();

        String[] toys = {"Cars", "Truck" , "Doll"};

        names[0] = "Tom"; //use an index e.g. 0,1,2,3 etc to define element
        names[1] = "Joseph";
        names[2] = "Duc";
        names[3] = "Clark";

        for(int s = 0; s < names.length; s++) // use a for int and name.length to print all variables
        {
            System.out.println(s + " " + names[s]);
        }

        for(String t:toys) //for each loop
        {
            System.out.println("Toy " + t);
        }

        int[] primes = {1,2,3,5,7,11};
        for(int s = 0; s < primes.length; s++) // for each means read only
        {
            System.out.println(s + " " + primes[s]);
        }

        int sum = 0;
        double average = 0;

        for(int p : primes)
        {
            sum += p; // sum = sum + p (accumulator)
        }
        average = (double) sum / primes.length;
        System.out.println(average);

        // initialize the random array

        for(int e = 0; e < randVals.length; e++)
        {
            randVals[e] = rnd.nextInt(101);
        }

        for(int e:randVals)
        {
            System.out.printf("\n%6d",e);
        }

        //find the min and max

        int min = randVals[0];
        int max = randVals[0];

        for(int e:randVals)
        {
            if(e > max) //Found a new max
            {
                max = e;
            }
            if (e < min)
            {
                min = e; //found a new min
            }
        }
        System.out.printf("\nThe min max is %8d %8d",min, max);
        System.out.println();

        int target = 16;
        boolean found = false;

        for(int e = 0; e < randVals.length; e++)
        {
            if(randVals[e] == target)
            {
                System.out.println("Target found at: " + e);
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("The target was not found");
        }


        //how to terminate loops, aka find first
        for(int e = 0; e < randVals.length; e++)
        {
            if(randVals[e] == target)
            {
                System.out.println("Target found at: " + e);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("The target was not found");
        }

    }
}
