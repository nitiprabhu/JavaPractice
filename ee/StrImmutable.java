class StrImmutable
	 {
                public static void main(String args[])
	   {
		String s1 = "sachin";
		String s2 = "tendulkar";
		System.out.println(s1.hashCode());
		
		s1=s1+s2;
		System.out.println(s1.hashCode());
		System.out.println(s1);
		
	}
     }