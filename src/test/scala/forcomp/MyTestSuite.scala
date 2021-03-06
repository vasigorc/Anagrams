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

  test("that the entire dictionary contains occurrences that can be mapped to multiple words"){
    var sum = 0
    dictionaryByOccurrences foreach(anagram => if(anagram._2.size > 1) sum+=1)
    assert(sum > 1)
    info(s"We have $sum anagrams that are mapped to 1+ words")
  }

  test("moist and omits shold come up as part of the same anagram"){
    wordAnagrams("moist").size should be (2)
  }

  test("example from the assignment should return a list of 9 elements"){
    combinations(List(('a', 2), ('b', 2))).size should be(9)
  }
}
