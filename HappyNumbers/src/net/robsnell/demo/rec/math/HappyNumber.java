package net.robsnell.demo.rec.math;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
	private int startingNumber;
	
	public int getStartingNumber(){
		return startingNumber;
	}
	
	void setStartingNumber(int value){
		startingNumber = value;
	}
	
	private Boolean isHappy;
	
	public Boolean getIsHappy(){
        if (isHappy == null)
        {
            isHappy = isHappyImplementation();
        }

        return isHappy;
	}
	
	void setIsHappy(Boolean value){
		isHappy = value;
	}
	
	private List<Integer> series;
	
	public List<Integer> getSeries(){
		return series;
	}
	
	void setSeries(List<Integer> value){
		series = value;
	}
	
    public HappyNumber(int startingNumber)
    {
        //https://en.wikipedia.org/wiki/Happy_number
        this.startingNumber = startingNumber;
        this.series = new ArrayList<Integer>();
    }
    
    Boolean isHappyImplementation()
    {
        //first run through
        int iterationStartingNumber = startingNumber;

        do
        {
            //split starting number into digits
            char[] digits = new Integer(iterationStartingNumber).toString().toCharArray();
            
            List<Integer> digitsI = new ArrayList<Integer>();
            for (char c : digits) {
				digitsI.add(Integer.parseInt(new Character(c).toString()));
			}

            //get sum of square of digits
            iterationStartingNumber = 0;
            for (Integer i : digitsI) {
            	iterationStartingNumber += Math.pow((double)i, (double)2);
            }
            
            //if 1 return true
            if (1 == iterationStartingNumber)
            {
                return true;
            }

            //if already present in series return false
            if (series.contains(iterationStartingNumber))
            {
                return false;
            }
            //else add to series and continue
            else
            {
                series.add(iterationStartingNumber);
            }
        } while (true);
    }
}
