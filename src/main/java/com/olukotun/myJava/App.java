package com.olukotun.myJava;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

    	public class App 
    	{
    	    public static void main( String[] args )
    	    {
    	    	
        int[][] first = {{1,2},{4,5}};
        int[][] second = {{1,2},{2,4}};
        
        int result[][]=new int[2][2];
        
        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Please enter the first element of the first matrix ");
//        
//        int firstElement = input.nextInt();
//        first[0][0] = firstElement;
//        
//
//        System.out.println("Please enter the second element of the first matrix ");
//        
//        int secondElement = input.nextInt();
//        first[0][1] =secondElement;
//        
//
//        System.out.println("Please enter the third element of the first matrix ");
//        
//        int thirdElement = input.nextInt();
//        first[1][0] = thirdElement;
//        
//        
//
//        System.out.println("Please enter the fourth element of the first matrix ");
//        
//        int fourthElement = input.nextInt();
//        first[1][1] = firstElement;
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int sum = 0;
        
        for (int i=0; i < 2; i++) {
        	for(int j=0; j<2; j++) {
        		for(int k=0; k < 2; k++) {
        			sum= sum + first[i][k] * second[k][j];
        			
        		}
        		result[i][j]=sum;
        		
        		sum=0;
        	}
        }
    	         

    	  for(int i= 0; i < 2; i++) {        
    		  for(int j=0; j < 2; j++) {
    			  System.out.print(result[i][j] + " ");
    		  }
    		  
    		  System.out.println();
    	  }
    	        
    	        
    	        
    	        
    	   
    	        
    	        
    	        
    	        
    	   
    	    	

    	        
    	        
    	        
    	        
    	    	
    	    }
    	    
    	    public static void calculateSum() {

   	    	 int mathRow = 3;
   	         int mathCol=2;
   	        int [][] matA = new int[mathRow][mathCol];
   	       int size = matA.length;
   	      int point;
   	      int result=0;
   	      int[] creditHours= new int[mathCol];  
   	      int cgp=0;
   	      int rowSum=0;
   	      int creditSum=0;
   	      String[] studentName = new String[size];
   	      String [] courses = new String[size];

   	      
   	     
   	   
   	         for(int row = 0; row < size; row++){
   	        	 Scanner input = new Scanner(System.in);
   	        	 System.out.println("please enter the student name: ");
   	             String name = input.next();
   	        	 
   	             for(int col=0; col < mathCol; col++ ){
   	            	 System.out.println("Ente the name of the course : ");
   	            	 String courseName = input.next();
   	            	 courses[col] = courseName;

   	               
   	                 System.out.println("Enter the score of the student in " + courseName );
   	                 int studentScore = input.nextInt();

   	                 System.out.println("Enter the credit hour associated with the course ");
   	                 


   	                 int creditHour = input.nextInt();

   	                 creditHours[col] = creditHour;

   	                 if(studentScore <= 39){
   	                      point = 1;

   	                      result = creditHour * point;
   	                     matA[row][col]= result;

   	                 }else if (studentScore >= 40 && studentScore <= 49){
   	                     point = 2;
   	                     result = creditHour * point;
   	                     matA[row][col]= result;

   	                 }else if ( studentScore <=50 && studentScore <= 59){
   	                     point = 3;

   	                     result = creditHour * point;
   	                     matA[row][col]=result;
   	                 } else if(studentScore <= 60 && studentScore <= 69){
   	                     point = 4;

   	                     result = creditHour * point;
   	                     matA[row][col]=result;
   	                 }else{
   	                     point=5;
   	                     result = creditHour * point;
   	                     matA[row][col]=result;
   	                 }
   	                   studentName[row]= name;
   	               
   	                 rowSum = rowSum + matA[row][col];
   	                 creditSum=creditSum + creditHour;
   	                 
   	                cgp = rowSum/creditSum;



   	             }
   	             
   	             System.out.println("the sum of the row is " + rowSum + " and the credit sum is " + creditSum);
   	             
   	             System.out.println("The cummulative grade point of the student is given as " + cgp);
   	             
   	         }


   	         for(int row = 0; row < size; row++){
   	             System.out.print(studentName[row] + "|");
   	             for(int col=0; col < mathCol; col++){
   	                 System.out.print(matA[row][col] + "\t");
   	                
   	             }
   	             System.out.println("|");
   	             
   	             
   	         }

    	    }
    	     public static void calculateCost() {
    	        Scanner scanner = new Scanner(System.in);
    	        
    	        System.out.println("Please enter the quantity of goods bought : ");
    	        
    	        int quantity = scanner.nextInt();
    	        
    	        System.out.println("Please enter the unit price of the item : ");
    	        
    	        double unitPrice = scanner.nextInt();
    	        
    	        
    	        System.out.println("Please enter the promocode available ");
    	        
    	        String promoCode  = scanner.next();
    	        promoCode = promoCode.intern();
    	       
    	        
    	        double totalPrice = quantity * unitPrice;
    	        
    	        double discount =  0.1 * totalPrice;
    	    	
    	    	double discountedPrice = totalPrice - discount ;
    	        
    	       
    	        
    	       if((promoCode.equalsIgnoreCase("summer2020")) && (totalPrice > 200)) {
    	        
    	      	
    	       	discountedPrice = totalPrice - discount ;
    	      	
    	      	System.out.println("The total cost of items is " + "$" + totalPrice + ", You are eligible for a discount of " + "$"+discount+ " and your balance due is " + "$" + discountedPrice );
    	      	}else
    	      		
    	     
    	      
    	         System.out.println("You are not eligible for discount and your totalCost is " + totalPrice); 
    	    	
    	    }
    	     public static void calculateMath() {
    	    	 Scanner scanner = new Scanner(System.in);
    	         System.out.println("Please enter a value for x: ");
    	         
    	         int x = scanner.nextInt();
    	         
    	         System.out.println("The value of of x is : " + x );
    	         
    	         System.out.println("Please enter the value of y: " );
    	         
    	         int y = scanner.nextInt();
    	         
    	        System.out.println("The value of y is " + y);
    	         
    	         
    	     int result = 2*x + (y + 3*x * 4*y)-2*x;
    	     
    	     System.out.println("The result of the expression is: " + result);
    	    
    	       }
   
}
