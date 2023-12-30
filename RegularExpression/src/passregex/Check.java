package passregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public void validatePassword(String str) {
		String regex="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m =p.matcher(str);
		if(m.matches()) {
			System.out.println("valid password");
		}else {
			System.out.println("invalid password");
		}
	}
}
