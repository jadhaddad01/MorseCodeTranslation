import java.util.Scanner;

public class MorseCode{
	//basic english alphabet
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

	//european extra
	static String uTwoDots = "..--";
	static String aTwoDots = ".-.-";
	static String oTwoDots = "---.";
	static String cAccentCirconflexe = "-.-..";
	static String eAccentAigu = "..-..";
	static String eAccentGrave = ".-..-";
	static String aAccentGrave = ".--.-";

	//num
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

	//complex chars
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
				//english alphabet
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

				//nums
				if(char1 == '1'){
					morseCoded = morseCoded + num1 + " ";
				}
				if(char1 == '2'){
					morseCoded = morseCoded + num2 + " ";
				}
				if(char1 == '3'){
					morseCoded = morseCoded + num3 + " ";
				}
				if(char1 == '4'){
					morseCoded = morseCoded + num4 + " ";
				}
				if(char1 == '5'){
					morseCoded = morseCoded + num5 + " ";
				}
				if(char1 == '6'){
					morseCoded = morseCoded + num6 + " ";
				}
				if(char1 == '7'){
					morseCoded = morseCoded + num7 + " ";
				}
				if(char1 == '8'){
					morseCoded = morseCoded + num8 + " ";
				}
				if(char1 == '9'){
					morseCoded = morseCoded + num9 + " ";
				}
				if(char1 == '0'){
					morseCoded = morseCoded + num0 + " ";
				}

				//complex chars
				if(char1 == '+'){
					morseCoded = morseCoded + plus + " ";
				}
				if(char1 == '/'){
					morseCoded = morseCoded + forwardSlash + " ";
				}
				if(char1 == '='){
					morseCoded = morseCoded + equal + " ";
				}
				if(char1 == '?'){
					morseCoded = morseCoded + questionMark + " ";
				}
				if(char1 == '_'){
					morseCoded = morseCoded + underscore + " ";
				}
				if(char1 == '"'){
					morseCoded = morseCoded + doubleAppostrophe + " ";
				}
				if(char1 == '.'){
					morseCoded = morseCoded + point + " ";
				}
				if(char1 == '@'){
					morseCoded = morseCoded + at + " ";
				}
				if(char1 == '\''){
					morseCoded = morseCoded + appostrophe + " ";
				}
				if(char1 == '-'){
					morseCoded = morseCoded + dash + " ";
				}
				if(char1 == ';'){
					morseCoded = morseCoded + pointComma + " ";
				}
				if(char1 == '!'){
					morseCoded = morseCoded + exclamation + " ";
				}
				if(char1 == ','){
					morseCoded = morseCoded + comma + " ";
				}
				if(char1 == ':'){
					morseCoded = morseCoded + twoDot + " ";
				}

				//european chars
				if(char1 == 'ü' || char1 == 'Ü'){
					morseCoded = morseCoded + uTwoDots + " ";
				}
				if(char1 == 'ä' || char1 == 'Ä'){
					morseCoded = morseCoded + aTwoDots + " ";
				}
				if(char1 == 'ö' || char1 == 'Ö'){
					morseCoded = morseCoded + oTwoDots + " ";
				}
				if(char1 == 'ç' || char1 == 'Ç'){
					morseCoded = morseCoded + cAccentCirconflexe + " ";
				}
				if(char1 == 'é' || char1 == 'É'){
					morseCoded = morseCoded + eAccentAigu + " ";
				}
				if(char1 == 'è' || char1 == 'È'){
					morseCoded = morseCoded + eAccentGrave + " ";
				}
				if(char1 == 'à' || char1 == 'À'){
					morseCoded = morseCoded + aAccentGrave + " ";
				}
			}
		}

		return morseCoded;
	}

	//Parsed spaces and words and now need to change them into english
	public static String decodeMorse(String value){
		String morseDecoded = "";
		String valueParsed;
		char char2;
		valueParsed = value.replace("   ", "/");
		valueParsed = valueParsed.replace(" ", ",");

		String tmp = "";
		for(int index1 = 0; index1 < valueParsed.length(); index1++){
			char2 = valueParsed.charAt(index1);
			System.out.println(char2);
			if(index1 == valueParsed.length()-1) System.out.println("last one");

			if(char2 == ','){

			}
			if(char2 == '/'){
				morseDecoded += " ";
			}
		}


		return morseDecoded;
	}

	public static void main(String[] args) {
		/*
		if(args!=null){
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		*/
		String a = encodeMorse("This is amazing!");
		System.out.println(decodeMorse(a));

		
	}
}