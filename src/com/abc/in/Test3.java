package com.abc.in;

public class Test3 {
	
	public static void main(String[] args) {
		
		String s ="Dell";
		char [] c =s.toLowerCase().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c1:c)
		{
			//removing diplicates
			
			if(sb.indexOf(String.valueOf(c1)) == -1)   
			{
				
				sb.append(c1);
			}
		}
		System.out.println(sb);
		System.out.println(sb);
	}

}
