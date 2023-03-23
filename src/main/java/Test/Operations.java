package Test;

class Operations {

    String replace(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return "a = " + a + " b=" + b;
    }

    String plus (int a, int b){
        return "a + b = " + (a + b);
    }

    void print (String S){
        System.out.println(S);
    }

    void print (int S){
        System.out.println(S);
    }

}
