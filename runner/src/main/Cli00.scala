package main
import scala.util.matching.Regex
import scala.io.StdIn

class Cli {

  /** commandArgPattern is a regular expression (regex) that will help us
    * extract the command and argument from user input on the command line
    *
    * Regex is a tool used for pattern matching strings.  Lots of languages and other tools
    * support regex.  It's good to learn at least the basic, but you can also just use this
    * code for your project if you like.
    */
  val commandArgPattern: Regex = "(\\w+)\\s*(.*)".r

  /** Prints a greeting to the user
    */
  def printWelcome(): Unit = {
    println("Welcome to Muscle Mentor!")
  }

  /** Prints the commands available to the user
    */
  def printOptions(): Unit = {
    println("What do you want to workout today?")
    println("[Legs] [Arms] [Back] [Chest] [Create my own workout] [Exit]")
  }

def menu(): Unit = {
    printWelcome()
    var continueMenuLoop = true
    while (continueMenuLoop) { //may have to make a DO while loop
      printOptions()
      // take user input using StdIn.readLine
      // readLine is *blocking* which means that it pauses program execution while it waits for input
      // this is fine for us, but we do want to take note.
      val input = StdIn.readLine()
      // Here's an example using our regex above, feel free to just follow along with similar commands and args
      input match {
        case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("legs") => {
          println("this is where legs should go")
          
            }
            
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("arms") => {
          println("this is where arms should go")
          
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("back") => {
         println("this is where back should go")
          
            }
            case commandArgPattern(cmd, arg) 
            if cmd.equalsIgnoreCase("chest") => {
        println("this is where chest should go")
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("create my own workout") => {
          println("this is where custom should go")
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("exit") => {
         println("See you next time! No pain no gains!")
         
            continueMenuLoop = false}}}}}
    
    
  
        

  
  
 /* def custom(args: Array[String]) : Unit = {
println("this is for create my own")
       
    }
  
  //def arms(args: Array[String]) : Unit = {
println("this is for arms")
       
    }
  
 // def chest(args: Array[String]) : Unit = {
println("this is for chest")
       
    }
  
  def back(args: Array[String]) : Unit = {
println("this is for back")
       
    }}*/