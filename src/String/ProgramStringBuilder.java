package String;

public class ProgramStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str ="Mohan";
          StringBuilder sb1=new StringBuilder("pqr");
         StringBuilder sb2=new StringBuilder(str);
         StringBuilder sb3=new StringBuilder("cde");
         StringBuilder sb4=new StringBuilder(str);
         sb1.append("apr");
         sb2.append("abg");
         String s7=str.concat("rtyu");
         System.out.println(sb1);
         System.out.println(sb2);
         System.out.println(s7);
         System.out.println(str);
	}

}
