import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testConstructeurArrayRecopie() {
	String str = "abc";
	char[] value = str.toCharArray();
	MyString test = new MyString(value);
	assertArrayEquals(value,test.value);
	}
	
	
	@Test
	public void testConsultationLongueur() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals(3,test.length());
	}



	@Test
	public void testEstNonVide() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertFalse(test.isEmpty());
	}
	
	@Test
	public void testEstVide() {
		String str = "";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertTrue(test.isEmpty());
	}
	
	@Test
	public void testCharAtValeurTrouvée() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals('b',test.charAt(1));
	}

	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testIndexNégatif() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		test.charAt(-1);
	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testIndexTropGrand() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		test.charAt(value.length+1);
	}
	
	
	
	
	
	@Test
	public void testStringObjetLuiMeme() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		MyString test2 = new MyString(value);	
		assertTrue(test.equals(test2));
	}
	
	@Test
	public void testStringObjetDifferent() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertFalse(test.equals(null));
	}	
	
	@Test
	public void testStringDifferentLongueur() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		
		String str2 = "abce";
		char[] value2	= str2.toCharArray();
		
		MyString test2 = new MyString(value2);	
		assertFalse(test.equals(test2));
	}
	
	@Test
	public void testStringMemeChaine() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		
		String str2 = "abc";
		char[] value2	= str2.toCharArray();
		MyString test2 = new MyString(value2);	
		
		assertTrue(test.equals(test2));
	}

	@Test
	public void testStringMemeLongueurChaineDifferente() {
		String str = "abcgef";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		
		String str2 = "abcdef";
		char[] value2	= str2.toCharArray();
		
		MyString test2 = new MyString(value2);	
		assertFalse(test.equals(test2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testIndexOfPremièreOccurrenceTrouvée() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals(0,test.indexOf('a'));
	}
	
	@Test
	public void testIndexOfPremièreOccurenceNonTrouvée() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals(-1,test.indexOf('d'));
	}
	
	@Test
	public void testLastIndexOfDernièreOccurrenceTrouvée() {
		String str = "abcabc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals(3,test.lastIndexOf('a'));
	}
	@Test
	public void testLastIndexOfDernièreOccurrenceNonTrouvée() {
		String str = "abcabc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		assertEquals(-1,test.lastIndexOf('d'));
	}
	
	@Test
	public void testConcatAvecUnStringVide() {
		String str = "abc";
		char[] value	= str.toCharArray();
		String str2 = "";
		char[] value2	= str2.toCharArray();
		MyString test = new MyString(value);
		assertEquals(test,test.concat(new MyString(value2)));
	}
	
	@Test
	public void testConcatAvecUnStringNonVide() {
		String str = "abc";
		char[] value	= str.toCharArray();
		String str2 = "def";
		char[] value2	= str2.toCharArray();
		MyString test = new MyString(value);
		String str3 = "abcdef";
		char[] value3	= str3.toCharArray();
		MyString test2 = new MyString(value3);
		assertEquals(test2,test.concat(new MyString(value2)));
		
	}


	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testSubstringMoins1() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		test.substring(-1, 2);
	}
	


	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testSubstring2() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		test.substring(0, value.length+2);
	}
	

	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testSubstring3() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		test.substring(2, 0);
	}

	@Test
	public void testSubstringCas4() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		String str2 = "abc";
		char[] value2	= str2.toCharArray();
		MyString test2 = new MyString(value2);
		
		assertEquals(test,test.substring(0, value.length));
	}
	
	@Test
	public void testSubstringCas5() {
		String str = "abc";
		char[] value	= str.toCharArray();
		MyString test = new MyString(value);
		
		String str2 = "b";
		char[] value2	= str2.toCharArray();
		MyString test2 = new MyString(value2);
		assertEquals(test2,test.substring(1, value.length-1));
	}
	
	
	
	

}
