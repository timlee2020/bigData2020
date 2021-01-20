package example

import scala.collection.mutable

class CollectionsDemo {
    //you can write import statments in your code 
    //not just at the top

    def run() = {
        //import an immutable map
        //import scala.collection.immuntable.Map
        //option for wildcar import:
        //import scala.collection.mutable._

        //we're going to talk about collections, all the built in ones are found in
        //scala.collection but we can write our own.
        //A collection is an object that lets us store other objects
        //(most often data values, but scala is functional) in some structured manner

        //we often describe these collections as being "backed by" some "data structure".
        /*each of these collections works by having some classic data structure under the hood
        that actually stores the data we mostly dont need to worry about this rn
        but its good to know about the data structures backing each collection
        so youre able to use the right collection for your specific use case 
        A collection might be backed by arrays or a linked list or a binary tree
        or a hash table. 
        knowing about data structures will just let you use collections more effectivley
        
        *Generics allow us to paramterize over type, which gets us compile time
        type safety for our collections. Generics are donated with []
        and they let us define a List[String] vs List[Int] vs List[Pizza]
        
        */

        val ints = mutable.ArrayBuffer[Int]()

        //ArrayBuffer is mutabale, we can modify values stored within it 
        //and its length. It is also indexed, so its like a mutable array

        //add elements 

        ints += 4
        ints += 7

        //remove elements 

        ints -= 1 
        ints -= 4

        println(ints)
        
        //access via index
        println(ints(0))

        //ArrayBuffer is mutable and indexed, really just like a mutable array

        //List is an immutable sequence. It stores elemetns in order line an ArrayBuffer,
        //but its elements and its length cannot be changed. It also works differently 
        //under the hood.

        val doubles = List(4.4, 5.5, 6.6, 7.222)

        //any methods we call on a list will return a new list 
        //rather than modifying the existing list 
        //append and prepend using :+ and +:

        print(doubles :+ 55.55)
        println(55.55 +: doubles)

        println(doubles) //still unchanged 

        //append and prepend multiples
        println(doubles :+ List(3.3,1.5345))

        println(List(3.0, 4.0, 3.0 ) :+ doubles)

        //insert new values with patch, but this is a kind of rare use case
        println(doubles.patch(1, List(77.777), 1))

        println(doubles(2))

        //list are stores in a sequence, and so we can access them by index. They are immutable
        // under the hood, a list is asingle-linked list, instead of being backed by an array
        // the end of the list, under the hood, has an element pointing to Nil

        //lets talk for a moment about immmutability here. our list are immunatble,
        //meaning we cant add or rmeove or edit values in them
        //however, we *can* change properties on the objects

        class MutableFieldHaver(field: String) {
            override def toString() = {s"field: $field"}
        }

        val mfhList = List(new MutableFieldHaver("green"), new MutableFieldHaver("red"), new MutableFieldHaver("seven"))
        println(mfhList)
      // mfhList :+ new MutableFieldHaver("blue")
       //println(mfhlist)
       // mfhList(1).field = ("something Else!")
       // println(mfhlist)

       /*vector is an indexed, immutable collection, backed by arrays. Its like 
       List in that its immuatble, its like ArrayBuffer in that its good for random
       access.
       */

       val longs = Vector[Long](44L, 23L, -90L)

       println(longs)
       //we can explore vector methods, they are not too different 

       /* Map is different sort of data structure. Its like a dictionary in python
       and kind of similar to a actual dictioray. Your map stores key, value pairs
       we dont put a single value inside of a map, instead we store pairs, one is the key and
       one is the value. We are able to quickly and easily accessthese pairs in 
       the map using their key. We store a key and a value and we lookup by key 

       map can be immutable or mutable, its just depends whether we import it from 
       scala.collection.mutbale or scala.collection.immutable. 
*/
       //Map syntax:

       val states = Map[String, String](
        "key" -> "value",
        "AK" -> "Alaska",
        "NY" -> "New York",
        "CA" -> "Cali"
       )

       //retrieve based on key
        println(states("AK"))

        println(states("NY"))

        println("NY".hashCode()) //what this do?

       // states += ("GA" -> "Georgia") //add k, v pairs

      //  states("CA") = "Cali, is on fire"

      //loop over the key values pairs using a foreach
      states.foreach({ case(key, value) => println()})

      //your map provides constant time lookup based on key. Regardless of how big 
      //finding a key, value pair is almost instantaneous

      /*we can make Maps using any 2 types for the key and the value
      the types dont have to be the same, the restriction is that the type of the 
      key must implement the hashcode() and equals() methods
      the reason for this is that your Map uses a hash table under the hood.
      if you dont know what that is, its really interesting but not necessary
      at the moment
      */

      //we can also have an immutable, by importing it from scala.collection.immuatble 
      //we can use both in the same file by using the fully qualified class name:

      val imMap = scala.collection.immutable.Map(
          "yellow" -> 6,
          "red" -> 3,
          "blue" -> 10
      )

      //this fails :
      //imMap("yellow") = 2o

      //can just get the values 
      println(imMap.values) //why does it print like that?

      // A set is a collection w/o duplicate elements. We can iterate over it, but
      // it is not indexed. We shouldnt assume that a set has a fixed order.
      //Some varieties of set do and others dont. 

      //sets can be both immutable or mutable similar to maps. Also similar to maps
      //checking whether a value is contained within a set is "very" fast 

      val shorts = Set[Short](3,5,7,9)

     // shorts += 11
      //shorts += 14

     println(shorts)

     //these lines wont change the set because they contain duplicate elements

     //shorts ++= List(1,3,5,7)
     //shorts += 13

     //the default implementation od a Set is a Hashset, which has no gaurenteed order
     //a hashset uses a hash table under the hood, similar to a map. In general, we can think
     // of a set as Map w/o any values. On this note, Sets can only contain 
     //objects that have a hashcode() implementation

     // shorts.add(10)
     // shorts.remove(5)

     //We can also use SortedSet 
     //A scala type that will often appear and we should be familiar with is Option.
     //Its not a collection but it is kind of a container for another value.
     //Option represents some value that may or may not exist.
     //the use of option is very common in functional code and its nice 
     //because it sometimes lets us avoid try-catch exception handling 

     //we can get Options from Maps:

     println(states.get("NY"))
     println(states.get("MA"))

     //An option containing a value will be represented by Some(value)
     //an option with no value will be represented by None

     //we can use match sttaments very effectively with options:
     states.get("Da") match {
    case Some(states) => println(states)
    case None => println("not found in map")

     }

     val abbrevs = List("AK", "NY", "CA")

     //map is a higher order function that takes a function that is used to
     //transform every element in a data structure 


     abbrevs.map((abbrev) => abbrev.last).foreach(println)
     //underscore shortcut 
     //abbrevs.map(_.last).foreach(println)

     abbrevs.map(states.get(_)).foreach(println)

     //above map is returning a List[Option[String]]. Whenever we have nested
     //data structures like this we can call .flatten to reduce them to a single 
     // level, in this case to get a List[String]

     println(abbrevs.map(states.get(_)).flatten)

     //we can also use flatMap, which is just a map followed by flatten. This method
     //is very useful for when you have a chain of transformations (map cells)
     //that all produce Options

     println(abbrevs.flatMap(states.get(_))) //what are these damn underscores 

     //option is like a container for a claue that amy or may not example 
     //Some(value) = Exist. None = Dont exist 
     //you can flatMap to work with transdormations that produce options. 







       
       

        //tuples a tuple is an ordered series of values of various types, up to 22!
        // Use tuples when youd ont want to create a class or a case class for some 
        //group properties 

        val myTuple : (Int, String, List[Int]) = (3, "hello", List[Int] (3,4))

        //access the elements of a tuple using ._ followed by the number we want
        println(myTuple._2)

        val myInferredTuple = (4.5, 55, "hi", 5.6)

        //We can have collections of tuples, this can be an easy
        //and flexible way to store structured data:

        val myPriorites = List[(String, Int)](("wash dishes", 3), ("get oil changed", 7))
        val myWeirdTuple : (CollectionsDemo, String, String, Float) = null

        //map, filter, reduce:
        //map filter and reduce are all higher order functions. Lets save the reduce for later
        /* these functions can be found in many programming languages, each of them 
        take a function as an argument that operates on some data structure (often a List in Scala).
        map and filter both return a new List. none of map, filter or rduce modify the existing list

        map is used to trasnform the elements in a data structure. The output of map
        will be a new List with the same number of elements as the OG list,
        but the value/type of elements 
        in the new list may be different
        */

        //filter is used to filter thru the elements 

        //foreach is somewhat similar, but it doent return anything,
        //instead foreach just calls a function on each element in your data structure 

        //multiply each element in the list by 2
        List(1,2,3,4,5).map(_*2).foreach(println)

        //add 3 each to element
        List(1,2,3,4,5).map(_+3).foreach(println)

        //use the repl to try it out

        //multiply each element in the list by 7, then filter out all odd elements 
        // then convert them all to strings, then transform them into tuples
        //containing (String, Int), with the number as a string and its length 

        //case classes provide more structure and info than tuples, but are easier 
        //to quickly create and use than reg classes 

        //A case class doesnt provide any totally new functionality over reg classes,
        // it jusr provides automatcially generated methods + defaults that we would 
        //have to write ourselves in a reg class.
        //Evrything that a case class does can be done with a regualr class
        //"Syntactic sugar"

        //case classes are by default immutable, so they are ofetn used in FP style code

        case class Fruit(name: String, color: String) {
            //can still add functionality and fields 

            def sing() = {
                println("la la la")
            }
        }

        //now we can use the case class:
        print(Fruit("lemon", "yellow"))

        val lime = Fruit("lime", "green")
        //can access fields but cannot change them 
        // lime.color = "red"

        lime.sing()

        case class Todo(task: String, priority: Int) {}

        val myTodos = List(Todo("wash dishes", 7), Todo("water plants", 5))

        println(myTodos) 

        //what exactly does a case class get you?
        //fields default to val, case classes are by default immmutable
        //but you can access their fields, you just cant changed them
        // equals and hashcode methods are generated based on the fields.
        //this means equality btwn case classes will check their fields 
        //equalities and you put them in Sets and Maps
        // a defualt toString method is generated 
        //a copy() method is generated that will let us make modifed copies 
        // of instances of the case class
        //apply and unapply methods are generated 
        //unapply lets your use the case class in match expressions, we'll see this later
        //apply is a special method in Scala that is used whenever you just use the name of the class
        //as if it were a function. We have not called out apply when we'be seen it 
        //but we have seen it frequently 

        //examples of apply:
        //creating a new List:
        List(1,2,3,4,5)

        //accessing by index
        doubles(2)

        //accessing by a key in a map 
        states("NY")

        //creating new instances of our case class
        Todo("explain apply method", 9)

        






    }
}