package com.netcrcker;

public class Task7 {
    public static char firstUniqueChar(String s) {
        int len = s.length();
        for(int i = 0;i<len;i++){
            boolean found = true;
            for(int j = i+1;j < len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found == true){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
