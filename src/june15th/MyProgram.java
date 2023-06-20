package june15th;

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		displayPentagonalNumbers();
		System.out.print(" ");
        computeFutureInvestmentValue(scanner);
        System.out.print(" ");
        checkLeapYear(scanner);
        System.out.print(" ");
        checkValidPassword(scanner);
        System.out.print(" ");
        displayMatrix(scanner);
        System.out.print(" ");
        calculateTriangleArea(scanner);
        System.out.print(" ");
        calculatePentagonArea(scanner);
        System.out.print(" ");
        checkPrimeNumber(scanner);
        System.out.print(" ");
        checkConsecutiveNumbers(scanner);
        System.out.print(" ");
        checkMidpoint(scanner);
        System.out.print(" ");
        extractFirstDigit(scanner);
        System.out.print(" ");
        displayFactorsOf3(scanner);
        System.out.print(" ");
        checkAllDigitsEven(scanner);
        System.out.print(" ");
        checkAllCharactersVowels(scanner);
        System.out.print(" ");
        scanner.close();
    }
    
    // Method 1: Display the first 50 pentagonal numbers
    public static void displayPentagonalNumbers() {
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            int pentagonalNumber = i * (3 * i - 1) / 2;
            System.out.print(pentagonalNumber + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    // Method 2: Compute the future investment value
    public static void computeFutureInvestmentValue(Scanner scanner) {
       
        System.out.print("Input the investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Input number of years: ");
        int years = scanner.nextInt();
        
        System.out.println("Years\tFutureValue");
        for (int i = 1; i <= years; i++) {
            double futureValue = investmentAmount * Math.pow(1 + interestRate / 100, i);
            System.out.printf("%d\t%.2f%n", i, futureValue);
        }
    }
    
    // Method 3: Check if a year is a leap year
    public static void checkLeapYear(Scanner scanner) {
        
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
    
    // Method 4: Check if a string is a valid password
    public static void checkValidPassword(Scanner scanner) {
       
        System.out.println("Password rules:");
        System.out.println("1. A password must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        System.out.println("Input a password: ");
        String password = scanner.nextLine();
        
        boolean isValid = password.length() >= 10 && password.matches("^[a-zA-Z0-9]*$") && password.matches(".*\\d.*\\d.*");
        if(isValid == true) {
        	System.out.println("Password is valid: " + isValid);
        }
        
    }
    
    // Method 5: Display an n-by-n matrix
    public static void displayMatrix(Scanner scanner) {
        
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method 6: Calculate triangle area
    public static void calculateTriangleArea(Scanner scanner) {
        
        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();
        
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is " + area);
    }
    
    // Method 7: Calculate pentagon area
    public static void calculatePentagonArea(Scanner scanner) {
      
        System.out.print("Input the number of sides: ");
        int sides = scanner.nextInt();
        System.out.print("Input the side: ");
        double side = scanner.nextDouble();
        
        double area = (sides * side * side) / (4 * Math.tan(Math.PI / sides));
        System.out.println("The area of the pentagon is " + area);
    }
    
    // Method 8: Check if a number is prime
    public static void checkPrimeNumber(Scanner scanner) {
       
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println(isPrime);
    }
    
    // Method 9: Check if three numbers are consecutive
    public static void checkConsecutiveNumbers(Scanner scanner) {
       
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        
        boolean areConsecutive = (num2 == num1 + 1) && (num3 == num2 + 1);
        System.out.println("Check whether the three said numbers are consecutive or not!" + areConsecutive);
    }
    
    // Method 10: Check if one number is the midpoint between two others
    public static void checkMidpoint(Scanner scanner) {
        
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        
        boolean hasMidpoint = (num1 + num3) / 2 == num2 || (num2 + num3) / 2 == num1;
        System.out.println("Check whether the three said numbers has a midpoint!" + hasMidpoint);
    }
    
    // Method 11: Extract the first digit from a number
    public static void extractFirstDigit(Scanner scanner) {
        
        System.out.print("Input an integer (positive/negative): ");
        int number = scanner.nextInt();
        
        int firstDigit = Math.abs(number);
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        System.out.println("Extract the first digit from the said integer: " + firstDigit);
    }
    
    // Method 12: Display the factors of 3 in a number
    public static void displayFactorsOf3(Scanner scanner) {
        
        System.out.print("Input an integer (positive/negative): ");
        int number = scanner.nextInt();
        
        StringBuilder factors = new StringBuilder();
        while (number % 3 == 0) {
            factors.append("3 * ");
            number /= 3;
        }
        factors.append(number);
        
        System.out.println("Factors of 3 of the said integer:");
        System.out.println(factors);
    }
    
    // Method 13: Check if every digit of a number is even
    public static void checkAllDigitsEven(Scanner scanner) {
        
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        
        boolean allDigitsEven = true;
        while (number != 0) {
            int digit = Math.abs(number % 10);
            if (digit % 2 != 0) {
                allDigitsEven = false;
                break;
            }
            number /= 10;
        }
        
        System.out.println("Check whether every digit of the said integer is even or not!" + allDigitsEven);
    }
    
    // Method 14: Check if all characters in a string are vowels
    public static void checkAllCharactersVowels(Scanner scanner) {
        
        System.out.print("Input a string: ");
        String str = scanner.nextLine();
        
        boolean allVowels = true;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                allVowels = false;
                break;
            }
        }
        
        System.out.println("Check all the characters of the said string are vowels or not!" + allVowels);
    }
    
}
	
