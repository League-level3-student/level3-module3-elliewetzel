package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
			}

	@Override
	public String funkifyText(String s) {
	StringBuilder rep = new StringBuilder(s);
	for(int i = 0; i < s.length(); i++) {
		Character c = s.charAt(i);
		c = Character.toLowerCase(c);
		rep.setCharAt(i, c);
	}
	s = rep.toString();
	System.out.println(s);
	return s;
	}

}