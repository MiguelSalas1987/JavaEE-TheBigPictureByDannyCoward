package Part1_3;

import java.util.*;

public class MyWallet {
	String [] coins = {"1 Cent","1 Cent","5 Cents","25 Cents","25 Cents"};
	String [] currency ={"$5","$10","$1","$20","$20"};
	String [] receips = {"water -$2","groceries - $35.26", "bookstore - $12.99"};
	
	public String[] getCoins()
	{
		return coins;
	}
	
	public List<String> getCurrency()
	{
		return Arrays.asList(currency);
	}
	
	public Set<String> getReceips(){
		return new HashSet<String>(Arrays.asList(receips));
	}
}
