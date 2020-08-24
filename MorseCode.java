import java.util.Scanner;

public class MorseCode{
	static String a = ".-";
	static String b = "-...";
	static String c = "-.-.";
	static String d = "-..";
	static String e = ".";
	static String f = "..-.";
	static String g = "--.";
	static String h = "....";
	static String i = "..";
	static String j = ".---";
	static String k = "-.-";
	static String l = ".-..";
	static String m = "--";
	static String n = "-.";
	static String o = "---";
	static String p = ".--.";
	static String q = "--.-";
	static String r = ".-.";
	static String s = "...";
	static String t = "-";
	static String u = "..-";
	static String v = "...-";
	static String w = ".--";
	static String x = "-..-";
	static String y = "-.--";
	static String z = "--..";
	static String uTwoDots = "..--";
	static String aTwoDots = ".-.-";
	static String oTwoDots = "---.";
	static String cAccentCirconflexe = "-.-..";
	static String eAccentAigu = "..-..";
	static String eAccentGrave = ".-..-";
	static String aAccentGrave = ".--.-";
	static String num1 = ".----";
	static String num2 = "..---";
	static String num3 = "...--";
	static String num4 = "....-";
	static String num5 = ".....";
	static String num6 = "-....";
	static String num7 = "--...";
	static String num8 = "---..";
	static String num9 = "----.";
	static String num0 = "-----";
	static String plus = ".-.-.";
	static String forwardSlash = "-..-.";
	static String equal = "-...-";
	static String questionMark = "..--..";
	static String underscore = "..--.-";
	static String doubleAppostrophe = ".-..-.";
	static String point = ".-.-.-";
	static String at = ".--.-.";
	static String appostrophe = ".----.";
	static String dash = "-....-";
	static String pointComma = "-.-.-.";
	static String exclamation = "-.-.--";
	static String comma = "--..--";
	static String twoDot = "---...";


	public static String encodeMorse(String value){
		String morseCoded = "";
		char char1;
		for(int index = 0; index < value.length(); index++){
			char1 = value.charAt(index);
			if(char1 == ' '){
				morseCoded = morseCoded + "  ";
			}
			else{
				if(char1 == 'a' || char1 == 'A'){
					morseCoded = morseCoded + a + " ";
				}
				if(char1 == 'b' || char1 == 'B'){
					morseCoded = morseCoded + b + " ";
				}
				if(char1 == 'c' || char1 == 'C'){
					morseCoded = morseCoded + c + " ";
				}
				if(char1 == 'd' || char1 == 'D'){
					morseCoded = morseCoded + d + " ";
				}
				if(char1 == 'e' || char1 == 'E'){
					morseCoded = morseCoded + e + " ";
				}
				if(char1 == 'f' || char1 == 'F'){
					morseCoded = morseCoded + f + " ";
				}
				if(char1 == 'g' || char1 == 'G'){
					morseCoded = morseCoded + g + " ";
				}
				if(char1 == 'h' || char1 == 'H'){
					morseCoded = morseCoded + h + " ";
				}
				if(char1 == 'i' || char1 == 'I'){
					morseCoded = morseCoded + i + " ";
				}
				if(char1 == 'j' || char1 == 'J'){
					morseCoded = morseCoded + j + " ";
				}
				if(char1 == 'k' || char1 == 'K'){
					morseCoded = morseCoded + k + " ";
				}
				if(char1 == 'l' || char1 == 'L'){
					morseCoded = morseCoded + l + " ";
				}
				if(char1 == 'm' || char1 == 'M'){
					morseCoded = morseCoded + m + " ";
				}
				if(char1 == 'n' || char1 == 'N'){
					morseCoded = morseCoded + n + " ";
				}
				if(char1 == 'o' || char1 == 'O'){
					morseCoded = morseCoded + o + " ";
				}
				if(char1 == 'p' || char1 == 'P'){
					morseCoded = morseCoded + p + " ";
				}
				if(char1 == 'q' || char1 == 'Q'){
					morseCoded = morseCoded + q + " ";
				}
				if(char1 == 'r' || char1 == 'R'){
					morseCoded = morseCoded + r + " ";
				}
				if(char1 == 's' || char1 == 'S'){
					morseCoded = morseCoded + s + " ";
				}
				if(char1 == 't' || char1 == 'T'){
					morseCoded = morseCoded + t + " ";
				}
				if(char1 == 'u' || char1 == 'U'){
					morseCoded = morseCoded + u + " ";
				}
				if(char1 == 'v' || char1 == 'V'){
					morseCoded = morseCoded + v + " ";
				}
				if(char1 == 'w' || char1 == 'W'){
					morseCoded = morseCoded + w + " ";
				}
				if(char1 == 'x' || char1 == 'X'){
					morseCoded = morseCoded + x + " ";
				}
				if(char1 == 'y' || char1 == 'Y'){
					morseCoded = morseCoded + y + " ";
				}
				if(char1 == 'z' || char1 == 'Z'){
					morseCoded = morseCoded + z + " ";
				}
			}
		}

		return morseCoded;
	}

	public static void main(String[] args) {
		String regularText = "jad is amazing!";
		System.out.println(encodeMorse(regularText));
	}
}