
Assumptions and Explanations:

1) I am deriving the solution based on Pascal's triangle
2) Using 2 dimensional array for simplicity purpose rather than complexity( there will be some memory loss)
3) Assuming maximum size of the 2-D array to 100
4) Created a method by the name fillWaterInGlasses() which will take capacity of each glass and total water being poured as parameters
    and will return the total number of levels till which we will have water in the glasses
5) Added some driver code to trigger the function
6) Added basic JUnit test for testing the function with different inputs

Test the code:

It is a simple Java application with main(); thus, run the code as a regular java class
( You may make changes to the capacity of the glass and total water poured in the main() )

Output:

Assuming the capacity of each glass is 0.250 litre and total water poured is 1 litre, you will receive below as an output:-

In two dimensional layout

		0.25        0.0         0.0   
		0.25        0.25        0.0   
		0.0625      0.125       0.0625  

which is similar to 

            	0.25
   		 0.25            0.25 
	0.0625      	0.125      	0.0625
  

    
