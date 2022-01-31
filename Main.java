import java.util.Scanner;
import java.util.Random;
//Mini text game, pattern test
public class Main
{
  public static void main (String[]args)
  {
    boolean online = true;
    boolean fight = false;
    int energy = 3;

      start ();


    while (online == true)
      {
	narrator ();
	found ();
	if (choice () == true)
	  {
	    energy++;
	    online = enemyAppears ();
	  }
	else
	    energy--;
	if (energy <= 0)
	  {
	    online = false;
	    System.out.println ("No energy.");
	  }

      }

    close ();
  }


  static void start ()
  {
    System.out.printf ("Game has started!\nFind things and get them?\n\n");
  }

  static boolean choice ()
  {
    Scanner scan = new Scanner (System.in);
    String choice = scan.next ();
    switch (choice.toUpperCase ())
      {
      case "YES":
	System.out.
	  println ("Do it!!!\n\nYou feel revigorated and happy...\n");
	return true;
      case "NO":
	System.out.
	  println ("Okay...    (you should get it next time though.)\n\n\n");
	return false;
      default:
	System.out.println ("Uhm... what?");
	return false;
      }
  }

  static void narrator ()
  {
    Random random = new Random ();
    int random_value = random.nextInt (7);
    switch (random_value)
      {
      case 0:
	System.out.
	  println ("It's getting late, when you catch a glimpse of...");
	break;
      case 1:
	System.out.println ("You're walking around when you see...");
	break;
      case 2:
	System.out.println ("You look around you and there's...");
	break;
      case 3:
	System.out.println ("You wonder what your next adventure is.");
	break;
      case 4:
	System.out.println ("You're craving adventure when you notice...");
	break;
      case 5:
	System.out.println ("You make out something in the distance...");
	break;
      case 6:
	System.out.println ("See, when I was your age...");
	break;

      }

  }

  static void found ()
  {
    Random random = new Random ();
    int random_value = random.nextInt (11);
    switch (random_value)
      {
      case 0:
	System.out.println ("Oh!\n\nA strange 3D block!\nGet it?   (YES/NO)");
	break;
      case 1:
	System.out.println ("Oh!\n\nHoney!!!\nGET IT!!!   (YES/NO)");
	break;
      case 2:
	System.out.println ("Oh!\n\nA diamond!\nGet it?   (YES/NO)");
	break;
      case 3:
	System.out.println ("Oh!\n\nA tree!\nCut it?   (YES/NO)");
	break;
      case 4:
	System.out.println ("Oh!\n\nSome fur!\nGet it?   (YES/NO)");
	break;
      case 5:
	System.out.println ("Oh!\n\nAn ametist!\nGet it?   (YES/NO)");
	break;
      case 6:
	System.out.println ("Oh!\n\nSome pebbles!\nGet it?   (YES/NO)");
	break;
      case 7:
	System.out.println ("Oh!\n\nA sapphire!\nGet it?   (YES/NO)");
	break;
      case 8:
	System.out.println ("Oh!\n\nUhm... Cinnabar?\nGet it?   (YES/NO)");
	break;
      case 9:
	System.out.
	  println ("Oh!\n\nA Squirrel!\nKill it and eat it?   (YES/NO)");
	break;
      case 10:
	System.out.println ("Oh!\n\nAn amulet!\nGet it?   (YES/NO)");
	break;

      }
  }

  static boolean enemyAppears ()
  {
    Random random = new Random ();
    int random_value = random.nextInt (100);

    if (random_value < 25)
      {
	System.out.
	  println
	  ("\nBut it looks like someone came to avenge your discovery; and now you're dead.\n\n\n");
	return false;
      }
    else
      {
	System.out.println ("\nYou're safe for now.\n\n\n");
	return true;
      }
  }



  static void close ()
  {
    System.out.println ("Game is closing... bye :(");
  }
}

