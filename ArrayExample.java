
public class ArrayExample <T extends Number>
{
	T[] nums;
	public ArrayExample(T[] o) 
	{
		nums=o;
	}
	double average() 
	{
		double sum = 0.0;
		for(int i=0; i < nums.length; i++)
		sum += nums[i].doubleValue(); 
		return (sum / nums.length);
	}
	boolean sameAvg(ArrayExample<?> obj)
	{
		if (average()==obj.average())
			return true;
		return false;
	}
}
