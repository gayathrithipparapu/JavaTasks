package com.netcrcker;

import java.util.HashMap;

public class Task7 {
    public static char firstUniqueChar(String s) {
        /*int len = s.length();
        char c=s.charAt(0);
        for(int i = 0;i<len;i++){
            int cnt=0;
            char ch=s.charAt(i);
            for(int j = 0;j < len;j++){
                if(ch==s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt==1){
                c=ch;
                break;
            }
            else
            {
                System.out.println("no unique");
            }

        }
        return c;*/
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return ' ';
    }

}
