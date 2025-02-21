public class PracticeProblem {

	public static void main(String args[]) {

	}

public static String pyramid(int num){
	String pyramid = "";
	for(int i = 0; i < num; i++ ){
for (int j = 1; num - j > i; j++){
pyramid = pyramid + " ";
}
for (int l = 0; l < i+1; l++){
	pyramid = pyramid + "*";
	if(l<i){
		pyramid = pyramid + " ";
	}
	}
	
	if (i < num - 1){
		pyramid = pyramid + "\n";
	}
	}

	return pyramid;
}

public static String square(int num){
String square = "";
	for(int i = 0; i < num; i++){
	if (i == 0 || i + 1 == num){
		for (int j = 0; j < num; j++){
square = square + "*";
		}
	}
	else{
		square = square + "*";
		for (int l = 0; l < num - 2; l++){
			square = square + " ";
		}
		square = square + "*";
	}
	if(i + 1 < num ){
		square = square + "\n";
	}
	}
return square;
}


public static boolean hasLowercase(String word){
	String word2 = word.toLowerCase();
	String word3 = word.toUpperCase();
	for(int i = 0; i < word.length(); i++){
		if (word.charAt(i)==word2.charAt(i) && word2.charAt(i) != word3.charAt(i)){
			return true;
		}

		
	}
	return false;
}
}