package StringManipulation;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {

		String str = "hi this is my java code and i am so happy";

		System.out.println(str.length());
		int len = str.length();
		int li = 0;
		int hi = len - 1;

		System.out.println("length ==>" + len);// 41
		System.out.println("li ====>" + li);// 0
		System.out.println("hi====>" + hi); // 40

		/* charAt */
		System.out.println(str.charAt(0)); // h
		System.out.println(str.charAt(11)); // m
		System.out.println(str.charAt(40)); // y
		// System.out.println(str.charAt(41)); //StringIndexOutOfBoundsException

		/* indexOf */
		System.out.println(str.indexOf('h')); // 0
		System.out.println(str.indexOf('i')); // 1 //1st occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 5 //2nd occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));// 8 //3rd occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1) + 1)); // 28

		System.out.println(str.indexOf("java")); // 14

		System.out.println(str.indexOf("naveen")); // 14

		String mesg = "welcome admin";
		if (mesg.indexOf("admin") == 8) {
			System.out.println("msg is valid---pass"); // msg is valid -- passed
		} else {
			System.out.println("invalid message--failed");
		}

		// trim
		String test = " hello world ";
		System.out.println(test); // hello world

		// LC/UC

		String un = "Naveenautomationlabs";
		System.out.println(un.toLowerCase()); // naveenautomationlabs
		System.out.println(un.toUpperCase()); // NAVEENAUTOMATIONLABS

		// replace :
		String dob = "12-08-1990";
		System.out.println(dob.replace("-", "/"));

		String rest = " hello world ";
		System.out.println(rest.replace(" ", ""));

		String mg = "hi this is my java code and i am so happy";
		System.out.println(mg.replace("java", "Cypress")); // hi this is my Cypress code and i am so happy

		// equals:
		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equalsIgnoreCase(t2)); // true

		// contains
		String tg = "hi this is my java code and i am so happy";
		System.out.println(tg.contains("java")); // true

		String messg = "welcome admin";
		if (messg.contains("admin")) {
			System.out.println("PASS"); // PASS
		} else {
			System.out.println("FAIL");
		}

		//
		String x = "hello selenium";
		x.concat("automation");
		System.out.println(x); // hello selenium {String are always immutable }
		
		//subString:
		String orderMesg="my order id is 12345";
		System.out.println(orderMesg.substring(6)); //er id is 12345		
		System.out.println(orderMesg.substring(0,10)); //my order i	
		System.out.println(orderMesg.substring(orderMesg.indexOf("is")+2, orderMesg.length()).trim());
		
		//split:
		
		String lang="java_python_ruby_javascript";
		String lg[]=lang.split("_");
		System.out.println(Arrays.toString(lg)); //[java, python, ruby, javascript]
		
		
		
		
		//
		String top = "xXtestingXxXautomationXXxXXSeleniumxXapplicationX";
		String tp[]=top.split("xX");
		System.out.println(tp[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
