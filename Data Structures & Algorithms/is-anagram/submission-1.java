class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();

        // inserting all the character of the String s in the hashmap for comparing;

        //check if the length is not equal then it is not a anagram
        if(s.length() != t.length())
            return false;

        for(char a : s.toCharArray()){
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        //check if the every character is there in the mp or not

        for(char a : t.toCharArray() ){
            if(!mp.containsKey(a))
                return false;
            mp.put(a, mp.getOrDefault(a, 0) - 1);

            if(mp.get(a) == 0)
                mp.remove(a);
        }

        return true;
    }
}
