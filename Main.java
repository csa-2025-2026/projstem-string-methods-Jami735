public class Main
{
  public static void main(String[] args)
  {
   
    lastFirstN("cream", "butter", 3);
    stringManip("tinker", "bell");
    Syste
    eStr("badaboom","ada");

  }
  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    firstN = s2.substring(0,n);

    int startPosition = s1.length() - n;
    lastN = s1.substring( startPosition );

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    System.out.println(s1.toUpperCase());
    String firstL = s2.substring(0,1).toUpperCase();
    String restW = s2.substring(1).toLowerCase();
    System.out.println(firstL + restW);

  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output;
    String before;
    String after;
    int startOfs2 = s1.indexOf(s2);
    int endOfs2 = startOfs2 + s2.length();

    before = s1.substring(0, startOfs2);
    after = s1.substring(endOfs2);
    output = before + after;
    return output;
    
  }
}
