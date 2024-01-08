public class prac{
    public static void main(String[]args){
        // widening type casting
        int a = 10;
        double b= a;
        System.out.println(b);
        
        // narroe type casting
        double c =12.0;
        int  d =(int)c;
        System.out.println(d);
        
        //concatenation
        String e = "fullstack";
        String f = "DEVELOPER";
        System.out.println(e.concat (f));
         
         //add the name with space between first and second name
         System.out.println(e+" "+f);
         
         // length of the input
         
         System.out.println(e.length());
         
         // lower and upper case 
         System.out.println (e.toUpperCase());
         System.out.println(f.toLowerCase());
         
         // indexOf method
         System.out.println(e.indexOf("s"));
         
         // math library
         
         System.out.println(Math.min(a,d));
         System.out.println(Math.max(a,d));
         System.out.println(Math.sqrt(d));
         System.out.println(Math.abs(-200));
         System.out.println(Math.random());
         int g = (int)(Math.random()*71);
         System.out.println(g);
         
         
         int h = 18;
         if(g<h){
             System.out.println(" not eligible to vote");
         }
         else if(g==h){
             System.out.println("eligible to vote");
         }
         else{
             System.out.println("eligible to vote");
         }
             
         
             
    }
}