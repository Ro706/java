public class ExampleString{
	public static void main(String[] args){
		String city = "bokaro";
		System.out.println("city name is "+city);
		int citylen = city.length();
		System.out.println("Length of city is "+citylen);
		int index = city.indexOf("o");
		System.out.println("index of k is : "+index);
		int lindex = city.lastIndexOf("o");
                System.out.println("Last index of o is : "+lindex);
		char ch1 = city.charAt(4);
		System.out.println("character at index 6 is index 6 is "+ch1);

	}
}
