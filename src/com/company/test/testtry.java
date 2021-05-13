package com.company.test;

class sample{
        private int counter;
        public void addcount(){
            counter = counter+1;
            System.out.println("Counter Value : "+counter);
        }

    }

public class testtry{
    public static void main(String[] args) {
        sample t1 = new sample();
        t1.addcount();
    }
}

