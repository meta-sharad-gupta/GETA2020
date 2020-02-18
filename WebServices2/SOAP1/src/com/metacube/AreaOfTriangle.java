package com.metacube;


public class AreaOfTriangle {

    public String calculateArea(double side1, double side2, double side3) {
    	System.out.println("3456789");
    	if(side1 <= 0 || side2 <= 0 || side3 <= 0)
    		return "Triangle's Side can't be negative or zero.";
    	
//    	else if(side1 ==  || side2 == nul || side3 == null)
//    			return "Sides Should not be NULL";
    	
     	
        double halfPoint = (side1 + side2 + side3) / 2;
        if(halfPoint <= side1 || halfPoint <= side2 || halfPoint <= side3 ){
        	return "Impossible Triangle";
        }
        
        double Area = (Math.sqrt(halfPoint * (halfPoint - side1) * (halfPoint - side2)
                    * (halfPoint - side3)));
         return ("Area : " + String.valueOf(Area));
         
    }
}


//http://localhost:8080/SOAP1Client/sampleAreaOfTriangleProxy/TestClient.jsp