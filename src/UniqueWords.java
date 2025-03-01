import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
	  for (int i = 0; i < list.size(); i++)
	  {
		  boolean isUnique = true;
		  
		  // Checks for all previous elements
		  for (int j = 0; j < i; j++)
		  {
			  isUnique = false;
			  break;
		  }
		  
		  // If we don't find a match with a previous element, we increment
		  if (isUnique)
		  {
			  count++;
		  }
	  }
	  
	  return count;
   }


   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
