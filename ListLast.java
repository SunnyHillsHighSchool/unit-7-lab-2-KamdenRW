//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    boolean check = false;
    if(ray.size() < 1){
     return false;
    }

    int num = ray.get(ray.size()-1);

    
    for(int i = 0; i < ray.size()-2; i++){
      if(num == ray.get(i)){
        return true;
      }
    }
  
    //return check;
		return false;
	}
}