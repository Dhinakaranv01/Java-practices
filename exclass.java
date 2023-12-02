


/* there are five user 
rohit,kholi,dhoni,hardik,jadu
*/

public class exclass{
    public static void main(String[]args){
        library first = new library();
        first.Name = "rohit";
    
        first.Num = 45;
        library second = new library();
        second.Name = "kholi";
        second.Num = 18;
        library third = new library();
        third.Name = "dhoni";
        third.Num = 7;
        library fourth = new library();
        fourth.Name = "hardik";
        fourth.Num=33;
        library fifth = new library();
        fifth.Name="jadu";
        fifth.Num = 8 ;
        System.out.println(first.Num);
        System.out.println(second.Num);
        System.out.println(third.Num);
        System.out.println(fourth.Num);
        System.out.println(fifth.Num);
    }

    
}
class library{
    String Name ;
    
    int Num;
    
}
