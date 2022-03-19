# christmas-exam-software-development
Software development christmas exam, written in java developed in netbeans. 

A chirstmas software-development exam, written in java developed in netbeans.

Students had 48 hours to complete the following tasks. I recieved 95% for my efforts.
Copy and paste code into java files in an IDE project, or download files and run on textpad.

-------------------------------------------------------------------------Question 1-------------------------------------------------------------------------
[Part A]

A company has hired you to develop an application to generate certain items for their employees’ accounts. The application prompts the user to provide one
single line of text with an employee’s full name in the following format “forename surname” at a time. No validation is required. Next, the application uses
the given full name to create the corresponding item. The item is created using several rules.

The username is created using the following rules:

The username starts with the second to last character of the given full name, written using the same letter case as in the given full name

Each upper case vowel is replaced by its lower case version. Vowels entered in lower case, remain lower case in the username.

Each space is replaced by the total number of characters in the given full name (note that the total number of characters includes the space),
followed by a hyphen character ‘-‘

All the other characters will remain the same as in the given full name

The username ends with the total number of upper case vowels that had been replaced by their lower case versions

[Part B]

Develop an application that uses the instantiable class ItemGenerator (the instantiable class previously developed) to create items.
The application should allow a user to enter multiple employees’ full names. Ask the user to provide a full name and after the corresponding item is
created and displayed on the screen, ask the user if they would like to create another item. As long as the user enters “yes” the application should work
as described in the previous sentence. When the user enters anything else than “yes”, no other items are created.

-------------------------------------------------------------------------Question 2-----------------------------------------------------------------------
[Part A]

First, implement in the instantiable class ItemGenerator (the instantiable class previously developed at Question 1. a.) another method which takes in
as a parameter a onedimensional array of String paragraphs. A paragraph is a short piece of text, consisting of at least one sentence. The text can
contain only letters, spaces (i.e. ‘ ‘), commas (i.e. ‘,’), dots (i.e. ‘.’), exclamation marks (i.e. ‘!’) and question marks (i.e. ‘?’). Each sentence
ends with either a dot, an exclamation mark or a question mark. No validation is required. The method should compute and return an array of numbers.
The method should traverse the array of paragraphs and calculate the total number of consonants per paragraph. The total number of consonants per paragraph
should be stored in an array of numbers. The method should return the computed array of numbers.

[Part B]

Next, develop further the application class ItemGeneratorApp (the class previously developed at Question 1. b) to use the method defined at Question 2. a.
First, prompt the user to provide the number of paragraphs they would like to enter, and then prompt the user to provide those paragraphs by reading one
paragraph at a time from the keyboard, and store those paragraphs in an array of paragraphs. Next, call/invoke/use the method defined at Question 2. a.
to compute the numbers according to the functionality assigned to you. Finally, the application should display on the screen the numbers computed by the
method implemented at Question 2. a.
