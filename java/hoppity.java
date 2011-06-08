import java.io.File;
import java.util.Scanner;

public class hoppity
{
  private static void usage()
  {
    System.err.println("Usage: java " + hoppity.class.getName() + " <file>");
    System.exit(1);
  }

  private static void hoppity(final int n)
  {
    for (int i = 1; i <= n; i++)
    {
      final String s = i % 15 == 0 ? "Hop"
                     : i %  5 == 0 ? "Hophop"
                     : i %  3 == 0 ? "Hoppity"
                     : null;
      if (s != null)
      {
        System.out.println(s);
      }
    }
  }

  public static void main(final String[] args) throws Exception
  {
    if (args.length != 1 || args[0].trim().length() == 0)
    {
      usage();
    }

    final Scanner in = new Scanner(new File(args[0]));
    final int n = in.nextInt();
    hoppity(n);
  }
}
