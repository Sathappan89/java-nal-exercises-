package StringAssignmentNAL;

public class WordorCharacterContainedintheSentence {
/* Write a program to verify a word or a character contained in the sentence.*/
	public static void main(String[] args) {
		
		String word = "This is my String Assignment";
		
		
		if(word.contains("String")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
