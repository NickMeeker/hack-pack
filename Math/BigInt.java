package Math;
import java.util.*;
import java.io.*;
import java.math.*;

public class BigInt {
    public static void main(String[] args){
        BigInteger bigInt = new BigInteger("234562341234023450394509345"); // Pass as a string if it's really big
        BigInteger lessBigInt = BigInteger.valueOf(23418401895L); // Pass as a long if it's a little less big. valueOf IS STATIC

        // OPERATIONS
        bigInt.multiply(new BigInteger("2"));
        System.out.println(bigInt);
        // THE ABOVE WILL NOT WORK BECAUSE BigInteger IS IMMUTABLE

        // Instead:
        BigInteger bigIntProduct = bigInt.multiply(new BigInteger("2"));
        System.out.println(bigIntProduct);

        // Add, subtract, divide, multiply, mod, modInverse, etc
        // modInverse is actually pretty nifty
        BigInteger a = BigInteger.valueOf(5);
        BigInteger modInv = a.modInverse(BigInteger.valueOf(26));
        System.out.println(modInv);

        // PRIMALITY
        BigInteger query = new BigInteger("2349283470293840928348027");
        System.out.println(query.isProbablePrime(1)); // correct with probability 1 - (1/2)^(certainty --> INCREASES EXPONTENTIALLY WITH CERTAINTY++
    }
}
