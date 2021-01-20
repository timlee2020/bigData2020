package com.revature.Project0

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
    println("[Legs] [Arms] [Back] [Chest] [Custom] [Exit]")
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
            
                printlegs()
            
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("arms") => {
          printarms()
          
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("back") => {
         printback()
          
            }
            case commandArgPattern(cmd, arg) 
            if cmd.equalsIgnoreCase("chest") => {
        printchest()
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("custom") => {
          addWorkout()
            }
            case commandArgPattern(cmd, arg)
            if cmd.equalsIgnoreCase("exit") => {
         println("See you next time! No pain no gains!")
         
            continueMenuLoop = false}}}
        
        
        
        } 
       
        def printlegs() : Unit = {
muscleDao.printlegs()
       }

        def printarms() : Unit = {
muscleDao.printarms()
       }

        def printback() : Unit = {
muscleDao.printback()
       }

        def printchest() : Unit = {
muscleDao.printchest()
       }

    

    def addWorkout() : Unit = {
      
        muscleDao.printcustom()
      
    }
}

    
 