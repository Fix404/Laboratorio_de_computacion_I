public class Main {
  public static void main(String[] args) {
    int C=-123;
    System.out.println(C + (C<0 ? " es negativo " : " es positivo "));
    System.out.println(C + (C%2==0 ? " es par " : " es impar "));
    System.out.println(C + (C%5==0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
    System.out.println(C + (C%10==0 ? " es múltiplo de 10 " : " no es múltiplo 10 "));
    System.out.println(C + (C<100 ? " es menor que 100 " : " no es menor que 100 "));
  }
}