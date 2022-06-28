package Problem_Set10;

public class ChatBot
{
    public static void main(String[] args)
    {
        boolean canRespond = false;

        if (args.length < 1) {
            System.out.println("Nothing to say?");
        } else {
            for (int i = 0; i < args.length; i++)
            {
                if ((args[i].equalsIgnoreCase("are") || args[i].equalsIgnoreCase("was")) &&
                        (args[i + 1].equalsIgnoreCase("you") || args[i + 1].equalsIgnoreCase("your") ||
                                args[i + 1].equalsIgnoreCase("doing")))
                {
                   canRespond = true;
                   System.out.println("Fine, but could use some more power.");
                } else if (args[i].equalsIgnoreCase("favorite"))
                {
                    System.out.println(args[args.length - 1] + " I'm only interested in transistors.");
                    canRespond = true;
                }
            }

            if (!canRespond)
            {
                System.out.println("I didn't understand that.");
            }
        }
    }
}
