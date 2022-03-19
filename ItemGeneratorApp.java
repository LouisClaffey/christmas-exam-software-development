/** App class which allows user to create encoded username and count
the amount of consonants in a given sentence. User can add multiple usernames
and sentences. Author @Louis Claffey x21113190 */

import java.util.Scanner;

public class ItemGeneratorApp {

    public static void main(String[] args) {


		//declare three instances of scanner class for 3 different uses of scanner within the programme
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        // create object of the instantiable class
        ItemGenerator ig = new ItemGenerator();

        // sentinel value declared in order to access do/while loop.
        String answer = " ";

        // create string array to be set initialzed later
        String[] paragraphs;


		// do-while loop created for user to add new names until they decide to stop (by not entering 'yes')

        do{
            System.out.println("Please enter your first and last name: ");
            String name = sc.nextLine();
            ig.setUserName(name); // set the instantiable class variable userName to equal value added through scanner

            ig.compute();

            // apply comput method which traverses string, changes vowel cases, tracks amount of vowel case changes
            // changes string through stringBuffer

            System.out.println(ig.getEncodedUserName() + ig.getCapitalVowelCounter()); // show new name to user

            ig.minusVowels(); // subtract the vowel changes so each string correctly shows number of vowels changed

            System.out.println("Do you wish to continue? Type yes, type anything else for next function: ");
            // ask user to continue, if 'yes' loop continues
            answer = sc2.next();
            // read answer

        } while (answer.equalsIgnoreCase("yes"));

		System.out.println(); // to emphasize going on to next function

		// prompt user to enter in amount and set this amount to be the length of the string array

        System.out.println("Type in the amount of sentences you wish to enter: ");
        int length = sc.nextInt();
        paragraphs = new String[length];


		// user enters sentence content, looped to store multiple sentences in the paragraph array

        System.out.println("Enter the contents for each paragraph");
        for(int i=0; i<length; i++){
            System.out.println("Enter content for paragraph " + (i + 1) + ":");
            paragraphs[i] = sc3.nextLine();
        }

		// array passed into the count method to calculate consonant amounts

        ig.count(paragraphs);

        // array created to display to user - equals the int array in instantiable class

        int [] consonants = ig.getConsNumbers();


		// displays the amount of consonants to the user

        for(int j=0; j<consonants.length; j++){
            System.out.println("The number of consonants in sentence " + (j+1) + " is " + consonants[j]);
        }


    }

}
