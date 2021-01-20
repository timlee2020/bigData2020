package com.revature.Project0

import scala.util.matching.Regex
import scala.io.StdIn


class Cli {

  

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
    while (continueMenuLoop) { 
      printOptions()
      
      val input = StdIn.readLine()
      
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

    
 