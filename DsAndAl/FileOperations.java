package Com.DsAndAl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileOperations {
	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "xx/xx/xxxx";

	public FileOperations() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String convertString(UserDetails userDetails, String message) {
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName() + " " + userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.date());

		return message;
	}

	public String getFileText(String fileName) {
		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
			}
		}
	}

	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return "";
	}
}
