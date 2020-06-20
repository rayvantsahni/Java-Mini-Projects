class Language
{

  String name;
  int numSpeaker;
  String regionsSpoken;
  String wordOrder;

  Language(String name, int numSpeaker, String regionsSpoken, String wordOrder)
  {
    this.name = name;
    this.numSpeaker = numSpeaker;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo()
  {
    System.out.println(name + " is spoken by + " + numSpeaker + " people mainly in " + regionsSpoken);
    System.out.println("The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args)
  {
    Language english = new Language("English", 1000758, "US & Canada and any more", "subject-verb-object");
    english.getInfo();
    System.out.println("");

    Language qeqchi = new Mayan("Qʼeqchiʼ", 2330000);
    qeqchi.getInfo();
    System.out.println("");

    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 78454125);
    mandarinChinese.getInfo();
    System.out.println("");

    Language burmese = new SinoTibetan("Burmese", 1000099);
    burmese.getInfo();
  }
}
