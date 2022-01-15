package mapping;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	
			
				

			

					public class Entry {

					}

					public static void main(String[] args) {
						
						HashMap<Integer,String> hm=new HashMap<Integer,String>();      
					      hm.put(1,"Akhila");    
					      hm.put(2,"Vinod");    
					      hm.put(3,"Aadhira");   
					       
					      System.out.println("\nThe elements of Hashmap are ");  
					      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
					       System.out.println(m.getKey()+" "+m.getValue());    
					      }
					      
					    
					       
					      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
					      
					      ht.put(4,"Latha");  
					      ht.put(5,"Radhika");  
					      ht.put(6,"Ani");  
					      ht.put(7,"Mampu");  

					      System.out.println("\nThe elements of HashTable are ");  
					      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
					       System.out.println(n.getKey()+" "+n.getValue());    
					      }
					      
					      
					     
					      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
					      map.put(8,"swetha");    
					      map.put(9,"Bujjamma");    
					      map.put(10,"Aravind");       
					      
					      System.out.println("\nThe elements of TreeMap are ");  
					      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
					       System.out.println(l.getKey()+" "+l.getValue());    
					      }    
					      
					   }  
				

			


	}


