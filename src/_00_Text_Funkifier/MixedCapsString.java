package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String text = "";
		//StringBuilder rep = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if((i-1)%2 ==0) {
				text = text + s.toUpperCase().charAt(i);
			}
			else {
				text = text+s.toLowerCase().charAt(i);
			}
	}
		return text;

}
}
