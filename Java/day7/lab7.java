import java.util.Arrays ;
import java.util.TreeMap ;
import java.util.SortedMap ;
import java.util.SortedSet ;
import java.util.TreeSet ;
class Main {

	public static void main(String args[]){
		String str[] = {"apple", "arrow", "Azure", "Guava", "event", "thrill",
					"quack","responsible","afraid","moor","arch","harass","tame","worry","powerful","highfalutin",
					"normal","boorish","celery","closed","burly","superficial","fairies","writer","scary","repeat",
					"mouth","adjustment","foot","physical","squeamish","whine","reduce","fascinated","substantial",
					"whole","wrong","toothsome","deeply","best","fresh","lush","quartz","tart"};
		SortedSet<String> sset = new TreeSet<>(Arrays.asList(str));
		
		
	
		SortedSet<String> input ;
		SortedMap<Character, SortedSet<String>> strings = new TreeMap<>();
		
		for(String st : sset){
			Character ch= st.charAt(0) ;
			if(strings.containsKey​(ch)){
				input= new TreeSet<>(strings.get​(ch));
				input.add(st);
				//remove
				strings.remove(ch);
				strings.put(ch,input);
				
			}else{
				input= new TreeSet<>();
				input.add(st);
				strings.put(ch , input);
			}
		}
		printAll(strings);
		printWordForChar(strings , 's');
		
	}
	public static void printAll(SortedMap<Character, SortedSet<String>> strings){
		strings.keySet().forEach(k -> System.out.println(k + " -> " + strings.get(k)));
	}
	
	public static void printWordForChar(SortedMap<Character, SortedSet<String>> strings , Character ch ){
	
		if (strings.containsKey​(ch))
			System.out.println(strings.get(ch));
		else
			System.out.println("not found any !");
	}
}


