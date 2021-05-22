package day19_stringManupulation_part1;

public class C5_Task77_EmojiProgram_SwitchCase {

	public static void main(String[] args) {
		/*
		 Create a emoji program:
			1- Check if emoji has 2 characters. If it is not, print “invalid emoji”
			2-Valid emojis:
			Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful,Otherwise invalid
			Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
		 */
		
		String em=";)";
		
		if(em.length()==2) {
			
			if(em.charAt(0)==':') {
			
			
			//char )=')' ;	
			
			switch (em.charAt(1)) {
			case ')':
			System.out.println("Smile");
				break;	
			case '(':
				System.out.println("Sad");
					break;	
			case '/':
				System.out.println("Upset");
					break;	
			case 'p':
				System.out.println("Playful");
					break;	
			default:
				System.out.println("Invalid Value");
				break;
			}
			
			}
			
			if(em.charAt(0)==';') {
				
				switch (em.charAt(1)) {
				case ')':
				System.out.println("Wink");
					break;	
				case '0':
					System.out.println("Surprised");
						break;	
				default:
					System.out.println("Invalid Value");
					break;
				}	
				
			}
			
				
			
		}else {
			System.out.println("Invalid emoji");
		}
		

	}

}
