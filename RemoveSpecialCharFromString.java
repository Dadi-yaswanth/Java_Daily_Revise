 private static String checkString(String s){
     String newString = "";
     for(char ch: s.toCharArray()){
         if(ch ==' '||(ch >='a' && ch<= 'z') || (ch>='0' && ch<='9')){
             newString+=ch;
         }
     }
     return newString;
 }
.......................
 private static String checkString(String s){
    return s.replaceAll("[^A_Za-z0-9]","");
 }
