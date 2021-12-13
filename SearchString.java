package com.ishita;

public class SearchString {
    public static void main(String[] args) {
        String str="Community Classes";
        int ans=searchInString(str, 's');
        System.out.println(ans);
    }

    static int searchInString(String str, char target){
        if(str.length()==0){
            return -1;
        }
        for(int index=0;index<str.length();index++){
            if(str.charAt(index)==target){
                return index;
            }
        }
        return -1;
    }
}
