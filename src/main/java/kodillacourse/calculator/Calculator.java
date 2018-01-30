package kodillacourse.calculator;

public class Calculator {
    public Calculator(){

    }

    public void addAToB(int a, int b){
        System.out.println( a + b);
    }

    public void substractAFromB(int a, int b){
        System.out.println( a - b);
    }

    public static void main(String args[]){
        Calculator calcul = new Calculator();

        calcul.addAToB(12,36);

        calcul.substractAFromB(144,36);

    }
}