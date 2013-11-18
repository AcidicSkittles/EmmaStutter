import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;
import java.io.*;
public class StutterTest{
	@Test
	public void testIsDelimiter() {
		assertTrue(Stutter.isDelimiter(","));
		assertFalse(Stutter.isDelimiter("c"));
	}
	@Test
	public void testStut(String[] args ) {
		File fileName = new File ("C:\\Users\\Richard\\Documents\\Cs485SE\\Stutter\\Stutter-master\\src\\infile.txt");
		BufferedReader inFile = new BufferedReader (
                new InputStreamReader(
                		new FileInputStream(fileName)));
		Stutter.stut(inFile);
	}
	@Test
	public void testCheckDupes() {
		
	Stutter.checkDupes(1);
	Stutter.checkDupes(2);
	}
}
