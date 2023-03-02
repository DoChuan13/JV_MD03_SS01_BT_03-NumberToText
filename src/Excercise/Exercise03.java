package Excercise;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // Print Number with text format
        Scanner scanner = new Scanner(System.in);
        int number, hunPart, tenPart, unitPart;
        String hunText, tenText, unitText;
        System.out.println("Enter a Number (3 units): ");
        number = scanner.nextInt();
        hunPart = number / 100;
        tenPart = (number % 100) / 10;
        unitPart = (number % 100) % 10;
//        System.out.printf("%d %d %d", hunPart, tenPart, unitPart);
        /*Hundred Part*/
        switch (hunPart) {
            case 1:
                hunText = "One hundred";
                break;
            case 2:
                hunText = "Two hundred";
                break;
            case 3:
                hunText = "Three hundred";
                break;
            case 4:
                hunText = "Four hundred";
                break;
            case 5:
                hunText = "Five hundred";
                break;
            case 6:
                hunText = "Six hundred";
                break;
            case 7:
                hunText = "Seven hundred";
                break;
            case 8:
                hunText = "Eight hundred";
                break;
            case 9:
                hunText = "Nine hundred";
                break;
            default:
                hunText = "";
        }
        /*Ten Part*/
        switch (tenPart) {
//            case 1:
//                tenText = "";
//                break;
            case 2:
                tenText = "twenty";
                break;
            case 3:
                tenText = "thirty";
                break;
            case 4:
                tenText = "forty";
                break;
            case 5:
                tenText = "fifty";
                break;
            case 6:
                tenText = "sixty";
                break;
            case 7:
                tenText = "seventy";
                break;
            case 8:
                tenText = "eighty";
                break;
            case 9:
                tenText = "ninety";
                break;
            default:
                tenText = "";
        }
        /*Unit Part*/
        if (tenPart == 1) {
            switch (unitPart) {
                case 0:
                    unitText = "ten";
                    break;
                case 1:
                    unitText = "eleven";
                    break;
                case 2:
                    unitText = "twelve";
                    break;
                case 3:
                    unitText = "thirteen";
                    break;
                case 4:
                    unitText = "fourteen";
                    break;
                case 5:
                    unitText = "fifteen";
                    break;
                case 6:
                    unitText = "sixteen";
                    break;
                case 7:
                    unitText = "seventeen";
                    break;
                case 8:
                    unitText = "eighteen";
                    break;
                case 9:
                    unitText = "nineteen";
                    break;
                default:
                    unitText = "";
            }

        } else {
            switch (unitPart) {
                case 1:
                    unitText = "one";
                    break;
                case 2:
                    unitText = "two";
                    break;
                case 3:
                    unitText = "three";
                    break;
                case 4:
                    unitText = "four";
                    break;
                case 5:
                    unitText = "five";
                    break;
                case 6:
                    unitText = "six";
                    break;
                case 7:
                    unitText = "seven";
                    break;
                case 8:
                    unitText = "eight";
                    break;
                case 9:
                    unitText = "nine";
                    break;
                default:
                    unitText = "";
            }
        }

        String result;
//        System.out.printf("%s %s %s", hunText, tenText, unitText);
        if (hunPart != 0 && (tenPart != 0 || unitPart != 0)) {
            result = hunText + " and " + tenText + " " + unitText;
        } else {
            result = hunText + " " + tenText + " " + unitText;
        }
        System.out.printf("%d is: %s", number, result);
    }
}
