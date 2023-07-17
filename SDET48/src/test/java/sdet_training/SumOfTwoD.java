package sdet_training;

public class SumOfTwoD {

	public static void main(String[] args) {
		
		    
		        String input = "Hell123";
		        int sum = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (isDigit(c)) {
		                int digit = c - '0';
		                sum += digit;
		            }
		        }

		        System.out.println("Sum of digits: " + sum);
		    }

		    public static boolean isDigit(char c) {
		        return c >= '0' && c <= '9';
		    }
		}


	}

}
