package func_programming;

import java.util.function.Predicate;

interface Mathematics{
    public int calc(int a, int b);
}


public class DemoClass {

    public static void F1(int x, int y, Mathematics z){
        System.out.println(z.calc(x, y));
    }

    public static void main(String[] args) {
        Mathematics addLambda = (a, b) -> (a + b);
        Mathematics subLambda = (a, b) -> {return a - b;};
        Mathematics divLambda = (a, b) -> {
            int c;
            c = a / b;
            return c;};
        System.out.println(addLambda.calc(20, 10));
        System.out.println(subLambda.calc(20, 10));
        System.out.println(divLambda.calc(20, 10));

        //Predicate has an inbuilt method called test.
        Predicate<Integer> obj3 = (a) -> { return a>10; }; //Implementing a boolean expression.
        System.out.println(obj3.test(100));


        F1(30, 20, divLambda); //Passing an object reference.
        F1(30, 20, (a, b) -> {return a / b;} ); //Passing a lambda expression.
        F1(30, 20, (a, b) -> {return a % b;} );
    }
}
