package regex;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex regex=new Regex();
		
		//will check as it is
		regex.matchPattern("foo","foo");
		
		//. means any character
		//[bcr] means b or c or r 
		//[^bcr] means any character except b or c or r
		//[1-5] provide the range
		//[0-4[6-8]] means union of [0-4] and [6-8] means [01234678]
		//[0-9&&[345]] means intersection of [0-9] and [345] means [345]
		//[2-8&&[4-6]] means intersection of [2-8] and [4-6] means [234]
		//[0-9&&[^345]] means intersection of [0-9] and any character except [345] means [0126789]
		
		regex.matchPattern("cat.","cats");
		regex.matchPattern("[bcr]at","bat");
		regex.matchPattern("[^bcr]at","bat");
		regex.matchPattern("foo[1-5]","foo4");
		regex.matchPattern("[0-4[6-8]]","6");
		regex.matchPattern("[0-9&&[345]]","4");
		regex.matchPattern("[2-8&&[4-6]]","4");	
		regex.matchPattern("[0-9&&[^345]]","2");
		
		//\d means any digit means [0-9]
		//\D means any non digit means [^0-9]
		//\s means any white space character
		//\S means any non white space character
		//\w means a word 0-9 or underscore
		//\W means not \w
		
		regex.matchPattern("\\d","2");
		regex.matchPattern("\\D","a");
		regex.matchPattern("\\s"," ");
		regex.matchPattern("\\S","2");
		regex.matchPattern("\\w","t");
		regex.matchPattern("\\W"," ");
		
		//greedy kuch bhi nhi reluctant ? possesive + add krne pe
		// quantifier tells how much times to match
		// ? means once or not at all
		// + once or more
		// * means zero or more 
		// {n} exactly n
		// {n,} at least n
		// {n-m} n to m times
		regex.matchPattern("a?","a");
		regex.matchPattern("a?","b");
		regex.matchPattern("a?","");
		regex.matchPattern("a+","a");
		regex.matchPattern("a*","");
		regex.matchPattern("a?","ababaaaab");
		regex.matchPattern("a*","ababaaaab");
		regex.matchPattern("a+","ababaaaab");
		
		regex.matchPattern("a{3}","aaa");
		regex.matchPattern("a{3}","aaaa");
		regex.matchPattern("a{3}","aa");
		regex.matchPattern("a{3,}","aaaaaaaa");
		regex.matchPattern("a{3,5}","aaaaaaaa");
		
		regex.matchPattern("dog{3}","dogdogdog");
		regex.matchPattern("dog{3}","dogdogdogdog");
		regex.matchPattern("[abc]{3}","abcabaccf");
		regex.matchPattern("[abc]{3}","acb");
		
		regex.matchPattern(".*foo","xfooxxxxxxfoo");	//greedy
		regex.matchPattern(".*?foo","xfooxxxxxxfoo");	//reluctant
		regex.matchPattern(".*+foo","xfooxxxxxxfoo");	//possesive

		regex.matchPattern("(\\d\\d)\\1","1212");       //backreference
		
//		^	The beginning of a line
//		$	The end of a line
//		\b	A word boundary
//		\B	A non-word boundary
//		\A	The beginning of the input
//		\G	The end of the previous match
//		\Z	The end of the input but for the final terminator, if any
//		\z	The end of the input
		
		regex.matchPattern("^dog$","dog");
		regex.matchPattern("^dog$","    dog");
		regex.matchPattern("\\s*dog$","         dog");
		regex.matchPattern("^dog\\w*","dogblkblbkblkbl");
		
		regex.matchPattern("\\bdog\\b","the dog play");
		regex.matchPattern("\\bdog\\b","the doggie play");
		regex.matchPattern("\\bdog\\B","the dog play");
		regex.matchPattern("\\bdog\\B","the doggie play");
		
		 
	}

}
