package com.carrerdevs.wordguesserpractice;



public class Main {

    public static void main(String[] args) {
        //    Exo 1
//        System.out.println(charCount(char c;""););
        //    Exo 2
        System.out.println(getCount());
        //    Exo 3
        //    Exo 4
        
    }
//    Exo 1


//        public static int charCount(char c, String str) {
//            int count = 0;
//            for(int i = 0; i < str.length(); i++){
//                if(str.charAt(i) == c) count++;
//            }
//            return count;
//        }
    //    Exo 2
    public static int getCount() {
        String str = null;
        return str.replaceAll("[^aeiou]","").length();
    }
    //    Exo 3
    //    Exo 4
}
