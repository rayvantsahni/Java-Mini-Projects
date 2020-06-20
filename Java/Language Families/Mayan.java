class Mayan extends Language
{

  Mayan(String languageName, int speakers)
  {
    super(languageName, speakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo()
  {
    System.out.println("Ki'che' is spoken by 2330000 people mainly in Central America.");
    System.out.println("The language follows the word order: verb-object-subject");
    System.out.println("Fun fact: Ki'che' is an ergative language.");
  }
}
