package forcomp

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by vgorcinschi on 2/22/17.
  */
class MyTestSuite extends FunSuite with Matchers{

  import Anagrams._

  test("The adequacy of words grouping in wordOccurrences"){
    //Moldova should yield a list of 6 tuples
    wordOccurrences("Moldova").size should  be(6)
  }

  test("Letter count for a letter in the sentence after calling sentenceOccurrences"){
    //"Hai Moldova" doit renvoyer une liste de tuples ou 'a' figurerais deux fois
    sentenceOccurrences(List("Hai", "Moldova")).head should equal(('a', 2))
  }
}
