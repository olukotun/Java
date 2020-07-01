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
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of row of the first matrix : ");
        int row1 = scanner.nextInt();
        
        System.out.println("Please enter the column of the first matrix :");
        
        int col1 = scanner.nextInt();
        
        System.out.println("Please enter the number of row of the second matrix : ");
        int row2 = scanner.nextInt();
        
        System.out.println("Please enter the column of the second matrix :");
        
        int col2 = scanner.nextInt();
       
        int[][] matrixA = new int[row1][col1];
        int[][] matrixB = new int[row2][col2];
        int[][] result1 = new int[row1][col2];
        int sum = 0;
        
        
        if(col1==row2) {
        	for(int i =0; i < row1; i++) {
        		for(int j=0; j < col1; j++) {
        			System.out.println("Please enter the " + i + " " + j + " element of matrix A");
        			int element = scanner.nextInt();
        			matrixA[i][j] = element;
        			
        		}
        	}
        	
        	
        	for(int i =0; i < row2; i++) {
        		for(int j=0; j < col2; j++) {
        			System.out.println("Please enter the " + i + " " + j + " element of matrix B");
        			int element = scanner.nextInt();
        			
        			matrixB[i][j] = element;
        			
        		}
        	}
        	
        	
        	for (int i=0; i < row1; i++) {
            	for(int j=0; j<col2; j++) {
            		for(int k=0; k < col1; k++) {
            			sum= sum + matrixA[i][k] * matrixB[k][j];
            			
            		}
            		   result1[i][j]=sum;
            		
            		   sum=0;
            	}
            }
        	         

        	  for(int i= 0; i < row1; i++) {        
        		  for(int j=0; j < col2; j++) {
        			  System.out.print(result1[i][j] + " ");
        		  }
        		  
        		  System.out.println();
        	  }
        	    
        	
        }else {
        	System.out.println("Please check the dimension of the matrix you want to multiply ");
        }
        
        
        
        
        
        
        
        
        
        
 
        
            
    	        
    	        
    	        
    	   
    	        
    	        
    	        
    	        
    	   
    	    	

    	        
    	        
    	        
    	        
    	    	
    	    }
    	    
    	    public static void calculateGp() {

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
