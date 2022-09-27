//Methods to reverse a String
String str = "sham";
String rev = "";
......................................
//Method -1 using for loop
for(int i = str.length()-1;i>=0;i--){
	rev = rev+str.charAt(i);
	
}
...................................
//Method -2 using toCharArray();

char[] ch = str.toCharArray();
for(int i = ch.lenth-1; i>=0;i--){
rev = rev+ch[i];
}
............................
//Method -3 usin StringBuilder..,

     StringBuilder sbd = new StringBuilder(str).reverse();
     str = sbd.toString();// Converting StringBuildet to String
     System.out.println(str);
