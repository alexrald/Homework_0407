import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Prepare
        Scanner in = new Scanner(System.in);
        Person[] arrPeople;

        // Prompt for the count of people
        System.out.print("Please enter the number of people: ");
        int iPeopleCount = in.nextInt();
        arrPeople = new Person[iPeopleCount];

        // Ask about people
        for (int i = 0; i < iPeopleCount; i++) {
            System.out.println("Person #" + (i + 1));
            // Get name
            System.out.print("Please enter the person's name: ");
            String strName = in.next();
            // Get age
            System.out.print("Please enter the person's age: ");
            int iAge = in.nextInt();
            // Get hair color
            System.out.print("Please enter the person's hair color: ");
            String strColor = in.next();
            // Create a person object
            arrPeople[i] = new Person(strName, iAge, strColor);
        }

        // List people and sum their ages
        int[] arrAges = new int[iPeopleCount];
        System.out.println("We have " + iPeopleCount + " people here:");
        for (int i = 0; i < arrPeople.length; i++) {
            arrAges[i] = arrPeople[i].getAge();
            System.out.printf("%s, aged %d with %s hair.\n",
                    arrPeople[i].getName(), arrPeople[i].getAge(), arrPeople[i].getHairColor());
        }

        System.out.println("The average age of people is " + Average.getAverage(arrAges));
    }
}
