import java.util.ArrayList;
import java.util.List;


public class GildedRose {

	

	static ArrayList<Item> items = new ArrayList<Item>();
	static ArrayList<Item> conjureditems = new ArrayList<Item>();
	static ArrayList<Item> agedBrieitems = new ArrayList<Item>();
	static ArrayList<Item> sulfurasItems = new ArrayList<Item>();
	static ArrayList<Item> normalItems = new ArrayList<Item>();
	
	public static void main(String[] args) {
		
       
		
        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        
         updateQuality();
         

 		//items = normalItems;
 		//items = conjureditems;
 		//items = sulfurasItems;
 		items= agedBrieitems;
 		
 		
 		System.out.println("*** List of items ****");
 		for (int i = 0; i < items.size(); i++) {

 			System.out.println(
 					items.get(i).getName() + "   " + items.get(i).getSellIn() + "  " + items.get(i).getQuality());

 		}
}

 		
 		public static void updateQuality() {
 			
 			for (int i = 0; i < items.size(); i++) {
 				
 				String itemName = items.get(i).getName().replaceAll("[^\\s0-9a-zA-Z+-]","");
 				
 // sorting sulfuras items as a list				
 			
 				if((itemName.toLowerCase().contains("sulfuras")) &&  (items.get(i).getSellIn() == 0)) {
 				String sulfurasItem= itemName;
 				int sellInSulfuras = items.get(i).getSellIn();
 				int qualityOfSulfuras= items.get(i).getQuality(); 
 				sulfurasItems.add(new Item(sulfurasItem,sellInSulfuras,qualityOfSulfuras));
 				}
 			
 // sorting aged brie items as a list			
 				else if(itemName.toLowerCase().contains("aged brie")){
 				  String AgedBItem = itemName;
 				  int sellInAgedB = items.get(i).getSellIn();
 				  int QualityOfAgedB = items.get(i).getQuality();
 				   if (sellInAgedB == 0) {
 					QualityOfAgedB = 0;
 				} else if ( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB >= 1 && sellInAgedB <= 5) ) {
 					QualityOfAgedB = QualityOfAgedB + 3;
 				} else if ( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB > 5 && sellInAgedB <= 10) ) {
 					QualityOfAgedB = QualityOfAgedB + 2;
 				} else if( (QualityOfAgedB >=0 && QualityOfAgedB <=50) && (sellInAgedB > 10) ){
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

	}

}