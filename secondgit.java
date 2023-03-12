class main {
 public stastic void main(String[] args) 
{
 String str = "naman";
String bag = " ";
 for(int i=str.length()-1; i>=0; i--)
{
 bag+=str.charAt(i);
}
 if(str. equals(bag)){
 System.out.print("it is a pallindrome");
}else{
 System.out.print("it is not a pallindrome");
}
}
}