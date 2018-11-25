package me.theofrancisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringsRearrangement {
		
	static boolean stringsRearrangement(String[] inputArray) {
		class Helper{
			public boolean differByOne (String a, String b) {
				int d=0;
				for (int i=0;i<a.length();i++) {
					if (a.charAt(i)!=b.charAt(i)) {
						d++;
						if (d>1) return false;
					}
				}
				return d==1;
			}
			void insertInMap (Map<Integer,ArrayList<Integer>> map,Integer a, Integer b) {
				if (map.containsKey(a)) {
					map.get(a).add(b);
				}else {
					ArrayList<Integer> l = new ArrayList<>();
					l.add(b);
					map.put(a,l);
				}
			}
	
		    // A function used by DFS 
		    boolean visitMySon(Map<Integer,ArrayList<Integer>> connections, int parent,boolean[] visited, int members ) 
		    { 
		    	visited[parent]=true;
		    	int v = 0;
		    	for (boolean b:visited) {
		    		if (b) v++;else break;
		    	}
		    	if (v==members) return true;
		    	Stack<Integer> sons = new Stack<>();
		    	
		    	//get the sons
		    	for (Integer s:connections.get(parent)) {
		    		if (!visited[s]) sons.push(s);
		    	}
		    	
		    	while (!sons.isEmpty()) {
		    		int next = sons.pop();
		    		if (visitMySon(connections, next ,visited, members)) return true;
		    		else {		    			
		    			visited[next]=false;
		    		}
		    	}
		    	return false;
		        // libroVisitas == toda familia return true;
		        // Marca la node como visitado
		        // meter cada hijo en la pila que no haya sido visitado
		        // mientras la pila no este vacia
		        //   if visitMySon( hijo, libroVisitas) return true;
		    	// else borra libro Visitas
		    	// si la pila esta vacia, regresa false;
		    }
		    
						
		}		
		
		//Creates the map
		Helper helper = new Helper();
		Map <Integer,ArrayList<Integer>> connection = new HashMap<>();
		String a,b;
		for (int i=0;i<inputArray.length-1;i++) {
			for (int j=i+1;j<inputArray.length;j++) {
				a=inputArray[i];
				b=inputArray[j];
				boolean d = helper.differByOne(a, b);
				if (d) {
					helper.insertInMap(connection,i,j);
					helper.insertInMap(connection,j,i);
					}				
			}	
	   }
	//if there is a node that is does not have a transformation then return false;	
	for (int i=0;i<inputArray.length;i++) {		
		if (!connection.containsKey(i)) return false;
	}
	//check for every node if there are any full path
	boolean[] visited = new boolean[connection.size()];
	for (Integer node: connection.keySet()) {
		if (helper.visitMySon (connection,node,visited,connection.size())==true)
			return true;
		Arrays.fill(visited, false);
	}
	return false;	
  }
	
	

}

