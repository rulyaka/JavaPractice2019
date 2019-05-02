
public class Assigment156 {
	public static void main(String[] args) {

	}

	public int count_appearance(String[] arr, String t) {
		int counter = 0;
		for (String s : arr) {
			if (s.equals(t)) {
				counter++;
			}
		}

		return counter;
	}
	public int max(int x,int max)
	  {
		if(x>max) {
			return max;
		}else {
			return x;
		}
		
	
	
	    
	  }
	public boolean isEven(int n)
	  {
	    if(n/2==0) {
	    	return true;
	    }else {
	    	return false;
	    }
	  }
	public String c_profits (int buyPrice,int sellPrice)
	  {
	   if(buyPrice<sellPrice) {
		   return "profit";
	   }else if(buyPrice>sellPrice) {
		   return "loss";
	   }else {
		  return "no loss";
	   }
	   
	   
	   
	  }
	 public boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
	      if(toBe || notToBe ) {
	    	  return true;
	      }else if(notToBe || toBe ) {
	    	  return true;
	      }else if(toBe || toBe) {
	    	  return true;
	      }else {
	    	  return false;
	      }
	    
	  }
	  }
