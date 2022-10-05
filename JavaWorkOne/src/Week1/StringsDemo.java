package Week1;

public class StringsDemo {

	public static void main(String[] args) {
		String message="Weather is very good today";
		System.out.println(message);
		
		/*System.out.println("Person Number: "+ message.length());
		System.out.println("5.person: "+message.charAt(4));
		System.out.println(message.concat(" Yeah!"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] Character=new char[5];
		message.getChars(0,5,Character,0);
		System.out.println(Character);
		System.out.println(message.indexOf("at"));
		System.out.println(message.lastIndexOf("e"));*/
		
		String NewMessage=message.replace(' ','-');
		System.out.println(NewMessage);	
		System.out.println(message.substring(2,5));
		
		for(String kk:message.split(" ")) {
			System.out.println(kk);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
