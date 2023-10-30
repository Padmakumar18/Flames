import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Left
{
  static String left (String str, int d)
  {
    String ans = str.substring (d) + str.substring (0, d);
      return ans;
  }
}
class Kumar
{
  static void kumar (char ch)
  {
    switch (ch)
      {
    case 'f':
	System.out.println ("Freinds");
	System.out.println ("-----------");
	break;
	case 'l':System.out.println ("Love");
	System.out.println ("-----------");
	break;
	case 'a':System.out.println ("Affection");
	System.out.println ("-----------");
	break;
	case 'm':System.out.println ("Marriage");
	System.out.println ("-----------");
	break;
	case 'e':System.out.println ("Enemy");
	System.out.println ("-----------");
	break;
	case 's':System.out.println ("Sister/Brother");
	System.out.println ("-----------");
	break;
      }
  }
}
public class Flames
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a, b, c = 0, d, e, f, g;
    String str3 = "", str4 = "", str5 = "", str6 = "";
      System.out.println ("Enter the 1st Name:");
    String str1 = sc.nextLine ();
      System.out.println ("Enter the 2nd Name:");
    String str2 = sc.nextLine ();
      str1 = str1.toLowerCase ();
      str2 = str2.toLowerCase ();
    StringBuilder sb = new StringBuilder (str1);
    StringBuilder sd = new StringBuilder (str2);
    for (a = 0; a < sb.length (); a++)
      {
	if (sb.charAt (a) == ' ')
	  {
	    sb.deleteCharAt (a);
	  }
      }
    for (b = 0; b < sd.length (); b++)
      {
	if (sd.charAt (b) == ' ')
	  {
	    sd.deleteCharAt (b);
	  }
      }
    Pattern p = Pattern.compile ("\\W");
    Matcher m = p.matcher (sb);
    while (m.find ())
      {
	c++;
      }
    p = Pattern.compile ("\\W");
    m = p.matcher (sd);
    while (m.find ())
      {
	c++;
      }
    if (c > 0)
      {
	System.out.print ("Don't Use Any Special Character !");
      }
    else
      {
	int len1 = sb.length ();
	int len2 = sd.length ();
	int len3 = 0;
	int len4 = 0;
	int flen = 0;
	for (d = 0; d < len1; d++)
	  {
	    for (e = 0; e < len2; e++)
	      {
		if (sb.charAt (d) == sd.charAt (e))
		  {
		    sb.replace (d, d + 1, "0");
		    sd.replace (e, e + 1, "0");
		  }
	      }
	  }
	str3 = sb.toString ();
	str4 = sd.toString ();
	for (f = 0; f < len1; f++)
	  {
	    if (str3.charAt (f) != '0')
	      {
		str5 = str5 + str3.charAt (f);
	      }
	  }
	for (g = 0; g < len2; g++)
	  {
	    if (str4.charAt (g) != '0')
	      {
		str6 = str6 + str4.charAt (g);
	      }
	  }
	len3 = str5.length ();
	len4 = str6.length ();
	flen = len3 + len4;
	int temp = flen;
	if (flen <= 0)
	  {
	    System.out.println ("No Mathces");
	  }
	else
	  {
	    StringBuffer sk = new StringBuffer ("flames");
	    for (int h = 0; h < 5; h++)
	      {
		int flen1 = sk.length ();
		while (flen > flen1)
		  {
		    flen = flen - flen1;
		  }
		sk = sk.deleteCharAt (flen - 1);
		String ans = sk.toString ();
		int arun = flen - 1;
		ans = Left.left (ans, arun);
		sk = new StringBuffer (ans);
		flen = temp;
	      }
	    System.out.println ("-----------");
	    char ch = sk.charAt (0);
	    Kumar.kumar (ch);
	  }
      }
	}
}
