package Lambda;

class LambdaTest {
    public static void main(String[] args) {
        Operationable operation = (int x, int y) -> (x + y);
        Operationable operation1 = (int x, int y)-> (x*y);
        System.out.println(operation.calculate(2,8));
        System.out.println(operation1.calculate(2,8));

    }
}
