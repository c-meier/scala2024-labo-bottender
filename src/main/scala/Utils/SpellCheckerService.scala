package Utils

trait SpellCheckerService:
  /**
    * This dictionary is a Map object that contains valid words as keys and their normalized equivalents as values (e.g.
    * we want to normalize the words "veux" and "aimerais" in one unique term: "vouloir").
    */
  val dictionary: Map[String, String]

  /**
    * Calculate the Levenstein distance between two words.
    * @param s1 the first word
    * @param s2 the second word
    * @return an integer value, which indicates the Levenstein distance between "s1" and "s2"
    */
  def stringDistance(s1: String, s2: String): Int

  /**
    * Get the syntactically closest word in the dictionary from the given misspelled word, using the "stringDistance"
    * function, if the distance is 3 or less.
    * @param misspelledWord the mispelled word to correct
    * @return the closest normalized word from "mispelledWord" or None
    */
  def getClosestWordInDictionary(misspelledWord: String): Option[String]
end SpellCheckerService

class SpellCheckerImpl(val dictionary: Map[String, String]) extends SpellCheckerService:
  def stringDistance(s1: String, s2: String): Int =
    // TODO - Part 1 Step 2
    ???

  def getClosestWordInDictionary(misspelledWord: String): Option[String] =
    // TODO - Part 1 Step 2
    ???
end SpellCheckerImpl
