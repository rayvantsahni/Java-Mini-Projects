import java.util.ArrayList;

class Playlist 
{  
  public static void main(String[] args) 
  {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Radioactive");
    desertIslandPlaylist.add("Thunder");
    desertIslandPlaylist.add("Shots");
    desertIslandPlaylist.add("Ready Aim Fire");
    desertIslandPlaylist.add("Smoke and Mirror");
    desertIslandPlaylist.add("Time");
    desertIslandPlaylist.add("Birds");
    desertIslandPlaylist.add("I Don't Know Why");

    System.out.println("The initial playlist is " + desertIslandPlaylist);
    System.out.println("The size of this playlist is " + desertIslandPlaylist.size());


    System.out.println("Removing song: 'Thunder'");
    desertIslandPlaylist.remove("Thunder");

    System.out.println("Removing song: 'Time'");
    desertIslandPlaylist.remove("Time");

    System.out.println("Removing song: 'Radioactive'");
    desertIslandPlaylist.remove("Radioactive");

    System.out.println("The playlist is left with the following songs: " + desertIslandPlaylist);

    int indexA = desertIslandPlaylist.indexOf("Ready Aim Fire");
    int indexB = desertIslandPlaylist.indexOf("Birds");

    String tempA = "Ready Aim Fire";

    desertIslandPlaylist.set(indexA, "Birds");
    desertIslandPlaylist.set(indexB, tempA);

    System.out.println("The latest playlist looks something like this: " + desertIslandPlaylist);
  }
}
