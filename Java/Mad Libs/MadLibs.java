//This program creates a mad libbed story.
//Author: Rayvant

public class MadLibs 
{
  	public static void main(String[] args)
    {
      String name1, adjective1, adjective2, noun1, noun2, verb1, noun3, noun4, adjective3, name2, place1, noun5, noun6;
      int number;

      name1 = "zeDD";

      adjective1 = "fat";
      adjective2 = "artificial";
      adjective3 = "massive";

      verb1 = "swindle";

      noun1 = "box";
      noun2 = "building";
      noun3 = "bottles";
      noun4 = "adjective";
      noun5 = "clocks";
      noun6 = "needles";

      name2 = "waI";

      number = -42;

      place1 = "Gargantua - The Black Hole";
            
      //The template for the story
      String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "+ adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " +  name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

      System.out.println(story);
    }       
}
