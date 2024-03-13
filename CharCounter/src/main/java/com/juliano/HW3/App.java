package com.juliano.HW3;

public class App 
{
    public static void main( String[] args )
    {
        char[] testData = {'a','a','c','v','b','s','k','b','b','p','p'};
        char toFind = 'b';
        System.out.println("The Character "+toFind+" was found: "+countChar(testData,toFind)+" Times!");
    }

    public static int countChar(char[] input, char toFind){
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == toFind){
                count++;
            }
        }
        return count;
    }
}
