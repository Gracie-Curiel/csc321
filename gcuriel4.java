// Gracie Curiel
/*
 * csc321
 * lab#4
 */

import java.util.Scanner;

public class gcuriel3
{
        public static void main(String[] args)
        {
		System.out.println("Choose a number between 1 and 4");
		System.out.println("1. Eat an apple.");
		System.out.println("2. Eat a banana.");
		System.out.println("3. Eat an orange.");
		System.out.println("4. Eat a strawberry.");
	
		Scanner input = new Scanner(System.in);
                int userinput = input.nextInt();

		if(userinput == 1)
		{
			System.out.println("An apple a day keeps the doctor away.");
		}
		if(userinput == 2)
		{
			System.out.println("Don't go bananas!!!");
		}
		if(userinput == 3)
		{
			System.out.println("Orange you glad to be a programmer?");
		}
		if(userinput == 4)
		{
			System.out.println("I dont have a quote for strawberry :(");
		}

	}
}
