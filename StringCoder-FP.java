/** @param str the string to encode using the master string
     *  Precondition: all of the characters in str appear in the master string;
     *  str.length() > 0
     *  @return a string part in the master string that matches the beginning of str.
     *  The returned string part has length at least 1 and largest 5. 
     *  The method gives prefernce to return the longer matches.
     */
private StringPart findPart(String word){
    if(masterString.indexOf(word) != -1){
        return new StringPart(masterString.indexOf(word),word.length());
    }
    return findPart(word.substring(0,word.length()-1);
}
