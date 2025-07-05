package String;

public class A15 {
  public static void main(String[] args) {
	String a="hackerrank";
	String b="mountain";
	char [] c1=a.toCharArray();
	char [] c2=b.toCharArray();
char [] c=	merge(c1,c2);
	for(char p:c)
		System.out.print(p+"");
}
  public static char [] merge(char [] c1,char [] c2) {
	  int i =0,j=0,k=0;
	  char [] merge = new char[c1.length+c2.length];
	  while(i<c1.length &&j<c2.length) {
		  if(k%2==0)
			  merge[k++]=c1[i++];
		  else 
			  merge[k++]=c2[j++];
		  
	  }
	  while(i<c1.length)
		  merge[k++]=c1[i++];
	  while(j<c2.length)
		  merge[k++]=c2[j++];
	  
	  return merge;
  }
}
