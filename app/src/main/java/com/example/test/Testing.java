package com.example.test;

public class Testing {
    public int sum(int a, int b) {
        return  a + b;
    }
    public int sub(int a, int b) {
        return  a - b;
    }
    public int mul(int a, int b) {
        return  a * b;
    }
    public int div(int a, int b) {
        return  a / b;
    }
    public int mod(int a, int b) {
        return  a % b;
    }
    public boolean par(int a) {
        return  a % 2 == 0;
    }
    public int longi(String a){
        return a.length();
    }
    public boolean palindromo(String a){
        return a.equals(new StringBuilder(a).reverse().toString());
    }
}
