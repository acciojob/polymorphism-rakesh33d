package com.driver;

public class Main {

   public class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public void main(String[] args) {
        Product p = new Product();
        int a = p.product(2, 3);
        int b = p.product(2, 3, 4);
        double c = p.product(3.0, 4.0);
    }
}
