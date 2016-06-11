public class intToText {
	public static void main(String[] args) {
		int number = 13;
		String strNumber = convertToText(number);

		System.out.println("Integer: " + number + "\nText: " + strNumber);
	}
	/**
	 * Overview
	 * @param
	 * @return
	 */
	public static String convertToText(int number){
        int number_size = getNumberSize(number);
        int [] number_arr = new int[number_size];
				int number_of_frag = 1 + number_size/3;
				int [] number_frag = new int[number_of_frag];
				String number_text = "", number_str = Integer.toString(number), temp = "";

				if(number_size == 1) {
					number_text = getUnit(number);
					return number_text;
				}
				else if(number > 10 && number < 20) {
					number_text = getTeen(number);
					return number_text;
				}
				else {
					for (int i = 0 ; i <= number_of_frag - 1 ; i++ ) {
						for(int j = 0  ; j < 3 ; j++){
							temp = temp + number_str.charAt(number_size - 1 - i);
						}
					}


				}

      //   if(number_length == 1){
      //   	text_to_99 = getUnit(number);
      //   	return text_to_99;
      //   }
      //   else {
      //   	int num_to_99 = number % 100;
      //   	int rest_of_num = number - num_to_99;
			//
      //   	if(num_to_99 < 10) {
      //   		text_to_99 = getUnit(num_to_99);
      //   	}
      //  	 	else if(num_to_99 > 10 && num_to_99 < 20) {
			// 	text_to_99 = getTeen(num_to_99);
      //   	}
      //   	else if(num_to_99 % 10 == 0) {
      //   		text_to_99 = getTens(num_to_99);
      //   	}
      //   	else if( num_to_99 > 20 && num_to_99 % 10 != 0) {
      //   		text_to_99 = getTens(num_to_99 - num_to_99 % 10) + " " + getUnit(num_to_99 % 10);
      //   	}
      //   	int [] int_arr = new int[3];
      //   	int i = 0, j = 2, k = 0;
      //   	if(number_length >= 3) {
      //   	// reverse number string and remove tens and units
      //   	for(i = 0; i <= number_length - 3 ; i++) {
			//
      //   		int_arr[i] = Character.getNumericValue(str_num.charAt(number_length - 3 - i));
    	//     	System.out.println("int_arr[i] = "+ int_arr[i]);
    	//     	if(i % 3 != 0) {
    	//     		temp_str = temp_str + Integer.toString(int_arr[i]);
    	//     		// System.out.println("temp_str = "+ temp_str + " i = "+ i);
    	//     	}
    	//     	if(i % 3 == 0 && temp_str.length() != 0) {
    	//     		System.out.println("temp_str = "+ temp_str + " i = "+ i);
    	//     		temp = temp + hundred(int_arr[i]) + " " + toHundred(Integer.parseInt(temp_str)) + getPower( i + 3);
    	//     		System.out.println("temp = "+ temp );
			//
			//
    	//     		}
			//
    	//     	else if(i % 3 == 0 && temp_str.length() == 0) {
    	//     		System.out.println("temp_str = "+ temp_str + " i = "+ i);
    	//     		temp = temp + hundred(int_arr[i]) + " " + getPower( i + 3);
    	//     		System.out.println("temp = "+ temp );
    	//     	}
			//
			//
			//
    	//     		// for(int l = 0; l < 2; l++) {
    	//     		// 	System.out.println("int to string= " +Integer.toString(int_arr[l]));
    	//     		// 	temp = temp + Integer.toString(int_arr[l]);
    	//     		// }
			//
    	//     	}
    	//     	// text = temp;
			//
    	//     }
    	// }
    	    // 	j--;
    	    // 	if(j < 0 || i == 0) {
    	    // 		System.out.println("j is now = "+ j);
    	    // 		for(int l = 0; l < 2; l++) {
    	    // 			System.out.println("int to string= " +Integer.toString(int_arr[l]));
    	    // 			temp = temp + Integer.toString(int_arr[l]);
    	    // 		}
    	    // 		System.out.println("temp = "+ temp);
    	    // 		num = Integer.parseInt(temp);
    	    // 		System.out.println("parseInt = "+ num);
    	    // 		text = hundred(int_arr[j]) + toHundred(num) + getPower(k);
    	    // 		j = 2;

    	    // 	}
    	    // 	k++;
    	    // }



    //     int [] int_arr = new int[number_length];
    //     int i = 0;

    //     for(i = number_length - 1; i >= 0; i--) {
    //     int_arr[i] = Character.getNumericValue(str_num.charAt(i));
    //     	if(i == number_length - 1 && number_length == 1) {
    //     		text = getUnit(int_arr[i]);
    //     	}
    //     	else if ( i == number_length - 2 && int_arr[i] == 0 ) {
    //     		text = getUnit(int_arr[i + 1]);
    //     	}
    //     	else if( number_length == 2 && int_arr[i] == 1 && int_arr[i + 1] != 0) {
    //     		String teen = Integer.toString(int_arr[int_arr.length-2])+ Integer.toString(int_arr[int_arr.length-1]);
				// int teen_number = Integer.parseInt(teen);
				// System.out.println("t = "+teen_number);
				// text = getTeen(teen_number);
    //     	}
    //     }
        // System.out.println(i);
        //System.out.println(decimalDict(int_arr, 2));
       // String temp = Integer.toString(int_arr[1]);

		return number_text;
	}

	// getUnit will return the string of the digit
	public static String getUnit(int i) {
		String unit = "";
		switch(i){
		case(0): unit = "ZERO";
			break;
		case(1): unit = "ONE";
			break;
		case(2): unit = "TWO";
			break;
		case(3): unit = "THREE";
			break;
		case(4): unit = "FOUR";
			break;
		case(5): unit = "FIVE";
			break;
		case(6): unit = "SIX";
			break;
		case(7): unit = "SEVEN";
			break;
		case(8): unit = "EIGHT";
			break;
		case(9): unit = "NINE";
			break;
		}
	return unit;
	}

	public static Integer getNumberSize( int number ) {
		String str_num = Integer.toString(number);
		int numberSize = str_num.length();
		return numberSize;
	}

	public static String toHundred(int number) {
			int num_to_99 = number % 100;
        	int rest_of_num = number - num_to_99;
        	String text_to_99 = "";

        	if(num_to_99 < 10 && num_to_99 != 0) {
        		text_to_99 = getUnit(num_to_99);
        	}
       	 	else if(num_to_99 > 10 && num_to_99 < 20) {
				text_to_99 = getTeen(num_to_99);
        	}
        	else if(num_to_99 % 10 == 0) {
        		text_to_99 = getTens(num_to_99);
        	}
        	else if( num_to_99 > 20 && num_to_99 % 10 != 0) {
        		text_to_99 = getTens(num_to_99 - num_to_99 % 10) + " " + getUnit(num_to_99 % 10);
        	}
        	System.out.println("text from toHundred function = " +text_to_99);
        	return text_to_99;
	}

	public static String hundred(int number) {
		String text = "";
		if(number != 0){
			text = getUnit(number) + " HUNDRED";
			System.out.println("text from hundred function = " +text);
		}
		return text;
	}


	public static String getTeen(int i) {
		String teen_text = "";
		switch(i){
		case(11): teen_text = "ELEVEN";
			break;
		case(12): teen_text = "TWELVE";
			break;
		case(13): teen_text = "THIRTEEN";
			break;
		case(14): teen_text = "FOURTEEN";
			break;
		case(15): teen_text = "FIFTEEN";
			break;
		case(16): teen_text = "SIXTEEN";
			break;
		case(17): teen_text = "SEVENTEEN";
			break;
		case(18): teen_text = "EIGHTEEN";
			break;
		case(19): teen_text = "NINETEEN";
			break;
		}

		return teen_text;
	}

	public static String getTens(int i) {
		String tens = "";
		switch(i){
		case(10): tens = "TEN";
			break;
		case(20): tens = "TWENTY";
			break;
		case(30): tens = "THIRTY";
			break;
		case(40): tens = "FORTY";
			break;
		case(50): tens = "FIFTY";
			break;
		case(60): tens = "SIXTY";
			break;
		case(70): tens = "SEVENTY";
			break;
		case(80): tens = "EIGHTY";
			break;
		case(90): tens = "NINETY";
			break;
		}
		return tens;
	}

	public static String getPower(int place_value) {
		String power = "";
		 if ( place_value > 3 && place_value <= 6) {
			power = "THOUSAND";
		}
		else if( place_value > 6 && place_value <= 9 ) {
			power = "MILLION";
		}
		else if ( place_value > 9 && place_value <= 12 ) {
			power = "TRILLION";
		}
		else if (place_value > 12 && place_value <= 15) {
			power = "QUADRILLION";
		}
		return power;
	}

}
