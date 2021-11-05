
public class couponNumbers {

	public static void main(String[] args) {
		{
			char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
			long max=100000000;
			int random =(int) (Math.random()*max);	
			int random1 = (int) (Math.random()*max);
			StringBuffer sb = new StringBuffer();
			StringBuffer sb1 = new StringBuffer();
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random = random/chars.length;
				sb1.append(chars[random1 % chars.length]);
				random1 = random1/chars.length;
			}

			String couponCode = sb.toString();
			System.out.print("Coupon Code: "+couponCode);	
			String couponCode1 = sb1.toString();
			System.out.println(couponCode1);	
		}
	}

}
