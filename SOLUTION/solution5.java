class solution5 extends Exception{
    solution5(String str){
        System.out.println(str);
    }
}
class ExceptionHandaling{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        try{
            if(a%2==0){
                System.out.println("The "+a+" is Even.");
            }
            else{
                throw new solution5("Number Consist Odd Value.");
            }

        }
        catch(solution5 e){
            System.out.println(e);;
        }

    }
}
