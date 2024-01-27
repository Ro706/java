public class ExampleString{
	public static void main(String[] args){
		String city = "Amravat";
		city = city.toLowerCase();
		System.out.println("city name is "+city);
		int citylen = city.length();
		System.out.println("Length of city is "+citylen);
		int index = city.indexOf("a");
		System.out.println("index of k is : "+index);
		int lindex = city.lastIndexOf("a");
                System.out.println("Last index of o is : "+lindex);
		char ch1 = city.charAt(4);
		System.out.println("character at index 6 is index 6 is "+ch1);
		int n = citylen-1,flag = 0;
		while (n != -1){
			if (city.charAt(n)=='a'){
				flag += 1;
			}
			n--;
		}
		System.out.println("The number of time 'a' comming in given string is "+flag);

	}
}
