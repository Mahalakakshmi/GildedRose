package productsinformation;

import java.util.ArrayList;
import java.util.List;




public class GildedRose {

	

	public static ArrayList<Item> listofitems = new ArrayList<Item>();
	public static ArrayList<Item> conjureditems = new ArrayList<Item>();
	public static ArrayList<Item> agedBrieitems = new ArrayList<Item>();
	public static ArrayList<Item> sulfurasItems = new ArrayList<Item>();
	public static ArrayList<Item> normalItems = new ArrayList<Item>();
	
	public static ArrayList<Item> inappropriateItems = new ArrayList<Item>();
	
	
	public static void main(String[] args) {
		
       
		
        
		listofitems.add(new Item("+5 Dexterity Vest", 10, 20));
		listofitems.add(new Item("Aged Brie", 2, 0));
		listofitems.add(new Item("Elixir of the Mongoose", 5, 7));
		listofitems.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		listofitems.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		listofitems.add(new Item("Conjured Mana Cake", 3, 6));
        
         updateQuality(listofitems);
         

 		//listofitems = normalItems;
        // listofitems = conjureditems;
 		//listofitems = sulfurasItems;
 		//listofitems = agedBrieitems;
 		
 		
 		System.out.println("*** List of items ****");
 		for (int i = 0; i < listofitems.size(); i++) {

 			System.out.println(
 					listofitems.get(i).getName() + "   " + listofitems.get(i).getSellIn() + "  " + listofitems.get(i).getQuality());

 		}
}

 		
 		public static void updateQuality(ArrayList<Item> items) {
 			
 			for (int i = 0; i < items.size(); i++) {
 				
 				String itemName = items.get(i).getName().replaceAll("[^\\s0-9a-zA-Z+-]","");
 				int strlength = itemName.length();
 				int itemSellIn = items.get(i).getSellIn();
 				int itemQuality =  items.get(i).getQuality();
 				
 		if(  ((strlength >0) && ((itemSellIn == 0 && itemQuality>0 )|(itemSellIn > 0 && itemQuality<=50))  )     ){   
 				 		
 // sorting sulfuras items as a list				
 			
 				//if((itemName.toLowerCase().contains("sulfuras")) &&  (items.get(i).getSellIn() == 0)) {
 				if((itemName.toLowerCase().contains("sulfuras"))) {
 					
 				String sulfurasItem= itemName;
 				int sellInSulfuras = items.get(i).getSellIn();
 				int qualityOfSulfuras= items.get(i).getQuality(); 
 				    if(items.get(i).getSellIn() == 0) {sulfurasItems.add(new Item(sulfurasItem,sellInSulfuras,qualityOfSulfuras));}
 				//sulfurasItems.add(new Item(sulfurasItem,sellInSulfuras,qualityOfSulfuras));
 				    else {inappropriateItems.add(new Item(sulfurasItem,sellInSulfuras,qualityOfSulfuras));}
 				
 				}
 				
 							
 				
 				
 				
 			
 // sorting aged brie items as a list			
 				else if(itemName.toLowerCase().contains("aged brie")){
 				  String AgedBItem = itemName;
 				  int sellInAgedB = items.get(i).getSellIn();
 				  int QualityOfAgedB = items.get(i).getQuality();
 				   if (sellInAgedB == 0) {
 					QualityOfAgedB = 0;} 
 				     else if ( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB >= 1 && sellInAgedB <= 5) ) {
 					QualityOfAgedB = QualityOfAgedB + 3;} 
 				     else if ( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB > 5 && sellInAgedB <= 10) ) {
 					QualityOfAgedB = QualityOfAgedB + 2;} 
 				     else if( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB > 10) ){
 					QualityOfAgedB = QualityOfAgedB + 1;
 				}
 	            
 				agedBrieitems.add(new Item(AgedBItem, sellInAgedB, QualityOfAgedB));
 						
 			}
 				
 				
 				
 		
 // sorting conjured items as a list.			
 				else if(itemName.toLowerCase().contains("conjured")){	
 				
 				String conjuredItem = itemName;
 				int sellInConjured = items.get(i).getSellIn();
 				int qualityOfConjured = items.get(i).getQuality();
 				
 				if ((sellInConjured > 0) && ((qualityOfConjured > 0)  && (qualityOfConjured <=50)) ) {

 					sellInConjured = sellInConjured - 1;
 					qualityOfConjured = qualityOfConjured - 2;
 					if (qualityOfConjured < 0) {
 						qualityOfConjured = 0;
 					}

 					else if ((sellInConjured <= 0) && ((qualityOfConjured > 0)  && (qualityOfConjured <=50))) {

 						sellInConjured = sellInConjured - 1;
 						qualityOfConjured = qualityOfConjured - 4;
 						if (qualityOfConjured < 0) {
 							qualityOfConjured = 0;
 						}

 					}

 				}

 				conjureditems.add(new Item(conjuredItem, sellInConjured, qualityOfConjured));
 			}
 			
 		
 // sorting normal items as a list 				
 				else if (( (itemName.toLowerCase().contains("sulfuras") && itemName.toLowerCase().contains("aged brie")) 
 						&& (itemName.toLowerCase().contains("conjured") && (itemName == null) ) )
 						 == false) {
 				
 				
 				
 				String NormalItem = itemName;	
 				int sellInNormalItem = items.get(i).getSellIn();
 				int qualityOfNormalItem = items.get(i).getQuality();
 				  
 				if ((sellInNormalItem > 0) && ((qualityOfNormalItem > 0)&& (qualityOfNormalItem <= 50))) {

 					sellInNormalItem = sellInNormalItem - 1;
 					qualityOfNormalItem = qualityOfNormalItem - 1;
 					if (qualityOfNormalItem < 0) {
 						qualityOfNormalItem = 0;
 					}

 					else if ((sellInNormalItem <= 0) && ((qualityOfNormalItem > 0)&& (qualityOfNormalItem <= 50))) {

 						sellInNormalItem = sellInNormalItem - 1;
 						qualityOfNormalItem = qualityOfNormalItem - 2;
 						if (qualityOfNormalItem < 0) {
 							qualityOfNormalItem = 0;
 						}

 					}

 				}

 				normalItems.add(new Item(NormalItem, sellInNormalItem, qualityOfNormalItem));
 				
			}

		}
 		
 		else {inappropriateItems.add(new Item(items.get(i).getName(),items.get(i).getSellIn(),items.get(i).getQuality()));}
 			
 		}
 		}
}