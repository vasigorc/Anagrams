"Moldova".toLowerCase.groupBy(l => l).map(pair => (pair._1, pair._2.size)).toList.sortBy({case (letter, count) => letter})

List("A","Day","In","The","Life") mkString(" ")

