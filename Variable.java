class Variable{

    public static void main(String a[]){
        //java is strictly typed language, data type is to be mentioned and before variable
        int num=3;
        
        double num2=2;
        //This is not a correct way to define a float as by default if we mention . decimal, it is considered double
        //float marks = 6.5;
        //To define float we need to mention f explicitly 
        float marks = 6.5f;

        //long l=938;
        long l = 938l;
        
        //int result=num+to_integer(num2);
        double result2=num+num2;
        
       // System.out.println("Integer sum :"+result);
        System.out.println("Double sum :"+result2);

        //char needs to be defined with single quotes
        char c='k';
        String s = "string";
        //true and false are keywords so we don't need quotes
        boolean b= true;

    }
}
//result is not executed as double is not converted to int but int can simply get converted to double 

//Extra - print -> simply print
//         println -> generates new line

