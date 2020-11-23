package classDemo;

public class MyString  {

	int length;
	char[] characters;
	
	MyString(char[] ch)
	{
		length = ch.length;
		characters = new char[length];
		for (int i = 0; i < length; i++)
			characters[i] = ch[i];
	}
	MyString(Object obj)
	{
		MyString o=(MyString)obj;
		length = o.length();
	       characters = new char[length];
	       for (int i = 0; i < length; i++)
	           characters[i] = o.charAt(i);
	}
	public boolean equals(MyString s) {
	       if (this.length != s.length)
	           return false;

	       int i = 0;
	       while (i < this.length) {
	           if (this.characters[i] != s.characters[i])
	               return false; 
	           i++;
	       }
	       return true; 
	   }
	public char charAt(int index) {
	       return characters[index];
	   }
	
	public int length() {
	       return length;
	   }

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		char a[]= {'h','e','l','l','o'};
		char b[]= {'h','e','l','l','o'};
		MyString s=new MyString(a);
		MyString s1=new MyString(b);
		
		System.out.println(s.equals(s1));
		System.out.println(s.charAt(2));
		
		MyString s2=new MyString(s1);
		System.out.println(s.equals(s2));
		

	}

}
