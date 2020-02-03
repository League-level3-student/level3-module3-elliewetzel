package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder e = new StringBuilder();
		e.append(s);
		e = e.reverse();
		s = e.toString();
		return s;
	}

}
