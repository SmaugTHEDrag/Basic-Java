package Bai6;

public class VD_Math {
    public static void main(String[]args) {
    	
    	// abs - ceil - floor - exp(double a): e^a
    	System.out.println("Math.abs(-156.78)="+Math.abs(-156.78));
    	System.out.println("Math.ceil(124.9)="+Math.floor(124.9));
    	System.out.println("Math.exp(5)="+Math.exp(5)); //e^5
    	System.out.println("Math.round(1345.9785)="+Math.round(1345.9785));
    	//Math.Random -> số > 0 và <1
    	System.out.println("Math.random()="+Math.random());
    	
    	//Tìm max,min của 4 số a,b,c,d
    	int a=15,b=10,c=30,d=20;
    	int max1=Math.max(a,b);
    	int max2=Math.max(c,d);
    	int max=Math.max(max1,max2);
    	int min=Math.min(Math.min(a, b), Math.min(c, d));
    	System.out.println("Max="+max);
    	System.out.println("Min="+min);
    	
    	//TÍnh S=(x^2+1)^n
    	int n=3, x=2;
/*    	double S=1;
    	for(int i=1;i<=n;i++) {
    		S*=x*x+1;
//    	}*/
    	double S=Math.pow(Math.pow(x,2)+1,n);
    	System.out.println("S="+S);
    }
}
