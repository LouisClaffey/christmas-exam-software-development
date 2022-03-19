/** An instantiable class designed to generate an encoded username for clients' employees accounts.
Author @ Louis Claffey NCI student HDSDEV_SEP x21113190
*/

public class ItemGenerator {

   // Question 1
   private String userName;
   private String encodedUserName;
   private int capitalVowelCounter;


    // Question 2
   private int[] consNumbers;
   private int consCounter;


	// default constructor set with empty values

   public ItemGenerator(){
       userName = "";
       encodedUserName = "";
       capitalVowelCounter = 0;
       consCounter = 0;
   }


   public void compute(){
	   // create object of StringBuffer data type to manipulate string
       StringBuffer sb = new StringBuffer();
       // length of string stored
       int length = userName.length();

       // first character of string stored
       char first = userName.charAt(0);

       // penultimate character stored
       char penultimate = userName.charAt(length-2);


	   // loop to traverse string and change upper
	   // case vowels to lower case
	   // and increment counter each time
       for(int i=0; i<length; i++){
         char currentLetter = userName.charAt(i);
           switch (currentLetter) {
               case 'A':
                   sb.append('a');
                   capitalVowelCounter++;
                   break;
               case 'E':
                   sb.append('e');
                   capitalVowelCounter++;
                   break;
               case 'I':
                   sb.append('i');
                   capitalVowelCounter++;
                   break;
               case 'O':
                   sb.append('o');
                   capitalVowelCounter++;
                   break;
               case 'U':
                   sb.append('u');
                   capitalVowelCounter++;
                   break;
               case ' ':
                   sb.append(length);
                   sb.append('-');
                   break;
               default:
                   sb.append(currentLetter);
                   break;
           }

       }

	// delete first character
      sb.delete(0,1);
    // insert penultimate as first character
      sb.insert(0, penultimate);
    // insert first as second character
      sb.insert(1, first);
    // convert to string
      encodedUserName = sb.toString();
   }


   public int[] count(String[] input){
	// declare and initialize int array with user inputted length
    consNumbers = new int[input.length];

	// traverse each word
      for(int i=0; i<input.length; i++){
        consCounter = 0;
        String word = input[i];
        // traverse each character, increment counter
        // if character is consonant
          for(int j=0; j<word.length(); j++){
            char character = word.charAt(j);
            if(character == 'A' || character == 'a' ||
               character == 'E' || character == 'e' ||
               character == 'I' || character == 'i' ||
               character == 'O' || character == 'o' ||
               character == 'U' || character == 'u' ||
               character == '.' || character == ',' ||
               character == '!' || character == '?' ||
               character == ' '){
            System.out.print("");

            } else {
                consCounter++;
            }

          }
          	// store the counter amount at index 0 of array
               consNumbers[i] = consCounter;
        }
			// return array

               return consNumbers;

     }

	// method to make sure each string vowel change amount is correct
   public void minusVowels(){
      capitalVowelCounter -= capitalVowelCounter;
   }

	// to set username to user input and access variable
   public void setUserName(String userName) {
      this.userName = userName;
   }
	// retrieve new encoded username
   public String getEncodedUserName() {
      return encodedUserName;
   }
	// retrieve vowel change counter
   public int getCapitalVowelCounter() {
      return capitalVowelCounter;
   }

	// retrieve consonant counter
   public int getConsCounter() {
      return consCounter;
   }

	// retrieve the array of ints
   public int[] getConsNumbers() {
        return consNumbers;
   }

}
