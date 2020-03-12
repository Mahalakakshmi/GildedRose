package testproductsinformation;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import productsinformation.GildedRose;

import productsinformation.Item;


public class GildedRoseTest {

	static ArrayList<Item> testlistofitems = new ArrayList<Item>();
	
	static ArrayList<Item> testnormalitems = new ArrayList<Item>();
	static ArrayList<Item> testconjureditems = new ArrayList<Item>();
	static ArrayList<Item> testagedBrieitems = new ArrayList<Item>();
	static ArrayList<Item> testsulfurasItems = new ArrayList<Item>();
	
	
			
		@Test
	public void testupdate() {
		GildedRose gr = new GildedRose();

		testlistofitems.add(new Item("Sulfuras@,OxfordCicus London", 10, 20));
		testlistofitems.add(new Item("Conjured dettol liquid", 12, 30));
		testlistofitems.add(new Item("+5 Dexterity Vest", 10, 20));
		testlistofitems.add(new Item("~Aged #Brie", 2, 0));
		testlistofitems.add(new Item("Elixir of the Mongoose", 5, 7));
		testlistofitems.add(new Item("@Sulfuras, Hand of Ragnaros", 0, 80));
		testlistofitems.add(new Item("", 3, 6));
		testlistofitems.add(new Item("SQL DynamoDB Mongoose", 5, 68));
		testlistofitems.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		testlistofitems.add(new Item("Conjured Mana Cake", 3, 6));
		testlistofitems.add(new Item("Cloud computing is the on-demand availability of "
				+ "computer system resources, especially data storage and computing power, "
				+ "without direct active management by the user. The term is generally used "
				+ "to describe data centers available to many users over the Internet.", 12, 36));
		
		
		System.out.println("Before calling updateQuality GildedRose.normalItems.size() = "+GildedRose.normalItems.size());
		System.out.println("GildedRose.conjureditems.size() = "+GildedRose.conjureditems.size());
		System.out.println("GildedRose.sulfurasItems.size() = "+GildedRose.sulfurasItems.size());
		System.out.println("GildedRose.agedBrieitems.size() = "+GildedRose.agedBrieitems.size());
		System.out.println("GildedRose.inappropriateItems.size() = "+GildedRose.inappropriateItems.size());

	
		
// before calling updateQuality method		
		
		assertEquals(0,GildedRose.normalItems.size());
		assertEquals(0,GildedRose.conjureditems.size());
		assertEquals(0,GildedRose.sulfurasItems.size());
		assertEquals(0,GildedRose.agedBrieitems.size());
		assertEquals(0,GildedRose.inappropriateItems.size());
		

		gr.updateQuality(testlistofitems);
		
// after calling updateQuality method
		
		System.out.println("GildedRose.normalItems.size() = "+GildedRose.normalItems.size());
		System.out.println("GildedRose.conjureditems.size() = "+GildedRose.conjureditems.size());
		System.out.println("GildedRose.sulfurasItems.size() = "+GildedRose.sulfurasItems.size());
		System.out.println("GildedRose.agedBrieitems.size() = "+GildedRose.agedBrieitems.size());
		System.out.println("GildedRose.inappropriateItems.size() = "+GildedRose.inappropriateItems.size());
		
		
		testlistofitems = GildedRose.normalItems;
		//testlistofitems = GildedRose.conjureditems;
		//testlistofitems = GildedRose.sulfurasItems;
		//testlistofitems = GildedRose.agedBrieitems;
		//testlistofitems = GildedRose.inappropriateItems;
		
		for(int i = 0; i < testlistofitems.size(); i++) {

 			System.out.println(
 					testlistofitems.get(i).getName() + "   " + testlistofitems.get(i).getSellIn() + "  " + testlistofitems.get(i).getQuality());

 		}
		
		
		assertEquals(3,GildedRose.normalItems.size());
		assertEquals(2,GildedRose.conjureditems.size());
		assertEquals(1,GildedRose.sulfurasItems.size());
		assertEquals(1,GildedRose.agedBrieitems.size());
		assertEquals(4,GildedRose.inappropriateItems.size());

		
	}

}
