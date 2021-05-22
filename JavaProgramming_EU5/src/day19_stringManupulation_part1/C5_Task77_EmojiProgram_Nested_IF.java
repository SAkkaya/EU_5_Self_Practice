package day19_stringManupulation_part1;

public class C5_Task77_EmojiProgram_Nested_IF {

	public static void main(String[] args) {

	/*
	 * Create a emoji program: 1- Check if emoji has 2 characters. If it is not,
	 * print “invalid emoji” 2-Valid emojis: Starting with : = > :) Smile, :( Sad,
	 * :/ Upset, :p Playful,Otherwise invalid Starting with ; = > ;) Wink, ;0
	 * Surprised, Otherwise invalid
	 */


		String emoji = ":)";

		// check if it does not equal to 2 chars

		if (emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return; // stop execution  --> sadece main method icinde break olmaz btreak loop icinde loop u bitirir
		}

		// if code reaches this point, then emoji is 2 chars
		// get first and second chars and assign to variables

		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println("Smile");
			} else if (second == '(') {
				System.out.println("Sad");
			} else if (second == '/') {
				System.out.println("Upset");
			} else {
				System.out.println("Unknown emoji");
			}

		} else if (first == ';') {
			if (second == ')') {
				System.out.println("Wink");
			} else if (second == '0') {
				System.out.println("Suprised");
			} else {
				System.out.println("Unknown emoji");
			}
		} else {
			System.out.println("Invalid"); // ))
		}

	}

}