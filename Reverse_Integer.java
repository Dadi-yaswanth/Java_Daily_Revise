// revNumber = revNumber *10 + reaminder;
private static int reverseNumber(int number){
     int revNumber = 0;
     while (number>0){
         int remainder = number%10;
         revNumber = revNumber*10+remainder;
         number/=10;
     }
     return revNumber;
 }
