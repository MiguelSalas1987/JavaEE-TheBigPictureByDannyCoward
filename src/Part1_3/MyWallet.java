package Part1_3;

import java.util.*;

public class MyWallet {
	String [] coins = {"1¢","1¢","5¢","25¢","25¢"};
	String [] currency ={"$5","$10","$1","$20","$20"};
	String [] receips = {"water -$2","groceries - $35.26", "bookstore - $12.99"};
	
	public String[] getCoins()
	{
		return coins;
	}
	
	public List<String> getNotes()
	{
		return Arrays.asList(currency);
	}
	
	public Set<String> getReceips(){
		return new HashSet<String>(Arrays.asList(receips));
	}
}
