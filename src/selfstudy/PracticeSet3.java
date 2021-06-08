package selfstudy;

public class PracticeSet3 {
	
	public static void main(String[] args) {
		
		//Problem1
		
		String name = "Tejas Patil";
		name = name.toLowerCase();
		System.out.println(name);
		
		//Problem2
		String text = "My Friend Is Very Loyal";
		text = text.replace(" ", "_");
		System.out.println(text);
		
		//Problem3
		String name1 = "Dear <|name|>, Thanks  a lot!";
		name1 = name1.replace("<|name|>", "Tejas");
		System.out.println(name1);
		
		//Problem4
		String name2 = "This string contains double and triple spaces";
		System.out.println(name2.indexOf("  "));
		System.out.println(name2.indexOf("   "));
		
		//Problem5
		String name3 = "Dear Tejas,\n\tHow are you?\n\tI hope the weather is nice in pune";
		System.out.println(name3);
		
		
		
		
		
		
		
		
	}
	

}
