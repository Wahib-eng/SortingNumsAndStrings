package bankapp;

import java.math.BigInteger;

import static java.util.Arrays.sort;

public class Main{
        public static void main(String[] args) {
            String []cities = {"yaiz","bannaa","aadrmoot"} ;
            sort(cities);
            for(String city : cities)
                System.out.println(city+" ");

            BigInteger [] bigInteger = {new BigInteger("902840984928347239874"),
                    new BigInteger("7832647823683264"),
                    new BigInteger("8732487236487436")};

            sort(bigInteger);
            for( BigInteger bigInteger1 : bigInteger)
                System.out.println(bigInteger1+" ");



}

}

	