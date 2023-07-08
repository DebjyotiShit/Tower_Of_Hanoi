public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number=input.nextInt();
        System.out.println("Your "+number+" digit Tower of hanoi game step are there : ");
        function(number,'A','B','C');
    }
    public static void function(int number,char src,char aux,char des){
        if(number==1){
            System.out.println(src+" --> "+des);
            return;
        }
        function(number-1,src,des,aux);
       // System.out.println(src+" --> "+des);  // we can use this one
        function(1,src,aux,des);    // also this one
        function(number-1,aux,src,des);
    }

}
