Count of Occurence of character in String,,

we can solve this problem using two method:
1.Using String methods //Using indexOf and substring
2.Using Hashmap
......................................
1.Using String methods

     String str = sc.nextLine().replace(" ","");
     while (str.length()>0){
         char ch = str.charAt(0);
         System.out.println(ch+" :"+count(ch,str) );
        str =  str.replace(""+ch,"");
     }

 private static int count(char ch,String str){
     int count = 0;
     while (str.indexOf(ch)!=-1) {
         count++;
         str = str.substring(str.indexOf(ch)+1);
     }
    return count;
 }
.......................................
2.Using Hashmap..,
we will creat hashmap of<Charachter,Integer>

Hashmap<> map = hashmap<Character, Integer>();

for(char ch :str.toCharArray())
{

if(map.containsKey(ch)){
	map.put(ch,map.get(ch)+1);
	}else{
		map.put(ch,1);
			}

}
sout(map);
