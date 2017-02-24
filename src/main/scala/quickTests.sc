import forcomp.Anagrams._

"Moldova".toLowerCase.groupBy(l => l).map(pair => (pair._1, pair._2.size)).toList.sortBy({case (letter, count) => letter})

List("A","Day","In","The","Life") mkString(" ")

dictionary map(word => (wordOccurrences(word), word)) groupBy(_._1) map{
  case (occur, list) => (occur, list map(_._2))
}

dictionaryByOccurrences filter(elem => elem._2 contains("Scala")) flatMap(_._2) toList

val list = List(('a', 2), ('b', 2))

combinations(list)