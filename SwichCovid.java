package classwork;

import java.util.Scanner;

public class SwichCovid {

	public static void main(String[] args) {
	          Scanner input = new Scanner(System.in);
	          int result = 0;
	          String ans = "";
	          System.out.println("Do you have cough?");
	          ans = input.next();
	          while(!ans.equals("yes") && !ans.equals("no")) {
	        	  System.out.println("Enter yes or no");
	        	  System.out.println("Do you have cough?");
	        	  ans = input.next();
	          }
	          switch (ans) {
	          	case "yes":
	          		result = result + 1;
	          		break;
	          	case "no":    
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          //Ifeoluwa
	          System.out.println("Do you have a runny nose?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Are you having diarrhea?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	         System.out.println("Do you have headache?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you have bodyache?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you hava sore throat?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println(result);
	          System.out.println("Do you have fever?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 1;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you have difficulty in breathing?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 2;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you experience fatigue often?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 2;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Have you travelled during the past 14 days?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 3;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you have a travel history to COVID-19 INFECTED AREA?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 3;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	          System.out.println("Do you have a direct contact or taking care of a positive COVID-19 patient?");
	          ans = input.next();
	          switch (ans) {
	          	case "yes":
	        	  result = result + 3;
	        	  break;
	          	case "no":
	          		result = result +0;
	          		break;
	          	default:
	          		System.out.println("incorrect input");
	          		break;
	          }
	         
	         if (result <= 2){ 
	        	System.out.println("You have stress related symptoms");
	          }
	          else if(result <= 5 && result >=3) {
	        	  System.out.println("Hydrate properly and proper personal hygiene");
	          }
	          else if(result <= 12 && result >= 6) {
	        	  System.out.println("Seek a consultation with a Doctor");
	          }
	          else if(result <= 13 && result >= 20) {
	        	  System.out.println("CALL THE NCDC HOTLINE NUMBER");
	          }
	          else {
	        	  System.out.println("You are fine");
	          }
	          }
	}