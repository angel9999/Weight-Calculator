public class WeightCalculator
{

		public static void main(String[] args)
		{
			double x = Double.parseDouble(args[0]);
			double m = 0;
			m = x * 0.38;
			System.out.println("Mars: "+m);
			double j = 0;
			j = x * 2.36;
			System.out.println("Jupiter: "+j);
			double v = 0;
			v = x * 0.91;
			System.out.println("Venus: "+v);
			double s = 0;
			s = x * 1.06;
			System.out.println("Saturn: "+s);
		}

}