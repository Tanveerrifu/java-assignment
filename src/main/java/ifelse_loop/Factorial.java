package ifelse_loop;

//6. Write  a program to find the factorial of a given number

class Factorial{
    public static void main(String args[]){
        int i,fact=1;
        int number=7;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}