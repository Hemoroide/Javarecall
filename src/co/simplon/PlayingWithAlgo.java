package co.simplon;

import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		ArrayList<String> arrList = new ArrayList<String>();
			for (int i=0 ; i<array.length ; i++) {
				if (array[i].charAt(0) == 'a')
					arrList.add(array[i]);
				}
			return arrList; 
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i=0 ; i<array.length ; i++) {
			if (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'e' || array[i].charAt(0) == 'u' || array[i].charAt(0) == 'i' || array[i].charAt(0) == 'o')
				arrList.add(array[i]);}
			return arrList;
	}

	public static String [] removeNullElements(String array[]) {
		ArrayList<String> arrList =	new ArrayList<String>();
			for ( int i = 0; i < array.length ; i++) {
				if (array[i]==null) {
					arrList.add(array[i]);
					}
				return arrList;
			}		 
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		String[] reverse = new String [array.length];
	    for(int i = 0; i < array.length; i++)
	    {
	        reverse[i] = new StringBuilder(array[i]).reverse().toString();
	    }
	    return reverse;
	}

	public static String[] reverseOrderInArray(String array[]) {
		String[] reverse = new String [array.length];
	    for(int i = 0; i < array.length; i++)
	    {
	        reverse[i] = new StringBuilder(array[i]).reverse().toString();
	    }
	    return reverse;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
				}

	public static String getFirstHalf(String string) {
		return string.substring(0, string.length() / 2);
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		ArrayList<String> arrList = new ArrayList<String>();
		char letterUser = 'a';
		for (int i = 0 ; i <array.length; i++) {
			if (array[i] == letterUser) { 
				arrList.add(array);
			}
			return arrList;
		}
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		return null;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		String newTitle = title.toLowerCase();
		return newTitle;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return null;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		return null;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}
	
	public static boolean checkIfPair(int number) {
		boolean isPair = false;
		if (number % 2 == 0) {
			isPair=true;
				}
		return isPair;
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean isPair = false;
		if (number1 % 2 == 0 && number2 % 2 == 0 && number3 % 2 != 0) {
			isPair = true;
			}
		return isPair;
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		boolean isPair = false;
		if ((number1+number2+number3) % 2 == 0) {
			isPair=true; }
				
		return isPair;
		
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		boolean isPair=true;
		for (int i = 0 ; i < array.length; i++) {
			if (array[i]%2!=0) {
				isPair=false;
			}
		
		}
		return isPair;
		
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		return false;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		if (prix%2==0 && prix <=22) {
			return true;
		}
		else {return false;
		}
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		double prixSolde = ((pourcentDeRemise/100)*prix);
		if (prixSolde<=100) {
			return true;
		}
			else { return false;}
		
	}
	
	public static boolean checkCase2(int number1, int number2) {
		if (number1%7==0) {
			return true;
		}
		else if (number2%7==0) {
			return true;
		}
		else if ((number1+number2)%7==0) {
			return true;
		}
		else {return false;}
		
	}
	
	public static boolean checkCase2a(int number1, int number2) {
		if (number1%7==0) {
			return true;
		}
		else if (number2%7==0) {
			return true;
		}
		else if ((number1+number2)%7==0) {
			return false;
		}
		else {return false;}
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		return false;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		if (word.charAt(0)=='a') {
			return true;
		}
		else {return false;}
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
