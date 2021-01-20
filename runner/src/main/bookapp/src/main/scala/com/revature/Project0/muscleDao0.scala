package com.revature.Project0
import scala.io.StdIn
import java.sql.DriverManager

//database logic goes in this file 

object muscleDao {

    def printlegs() : Unit = {

       val conn = ConnectionUtil.getConnection() 
    
        val demoStatement = conn.prepareStatement("select * from workouts where body_part = 'Legs';")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){
            println(
              workouts.produceFromResultSet(resultSet)) }
               
    }

     def printarms() : Unit = {
    

       val conn = ConnectionUtil.getConnection()

        val demoStatement = conn.prepareStatement("select * from workouts where body_part = 'Arms';")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){
            println(
              workouts.produceFromResultSet(resultSet)) }
               
    }

     def printback() : Unit = {
    

       val conn = ConnectionUtil.getConnection()

        
    
        val demoStatement = conn.prepareStatement("select * from workouts where body_part = 'Back';")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){
            println(
              workouts.produceFromResultSet(resultSet)) }
               
    }
 def printchest() : Unit = {

       val conn = ConnectionUtil.getConnection()

        
    
        val demoStatement = conn.prepareStatement("select * from workouts where body_part = 'Chest';")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){
            println(
              workouts.produceFromResultSet(resultSet)) }
               
    }


def printcustom() : Unit = {
    val conn = ConnectionUtil.getConnection()

         println("Body part, workout one and workout two")
      val input = StdIn.readLine()
            println("Great! Here is your new workout! " + input)
        }
               
    }
       



    
        
/* 



 val conn = ConnectionUtil.getConnection()

        
    
        val demoStatement = conn.prepareStatement("INSERT ${input} INTO workouts(body_part, workout1, workout2);")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){







def saveNew(body_part : String, workouts1 : String, workouts2 : String) : Boolean = {
    val conn = ConnectionUtil.getConnection()
       

def newWorkout(body_part : String, workout1: String, workout2: String) : String = {
    var 
}

def newWorkout() : Unit = {
    
    println("Body Part, Workout one and Workout two?")
    val wInput = StdIn.readLine()
        println(wInput)


    val input = StdIn.readLine()

      val stmt = conn.prepareStatement("INSERT INTO workouts(body_part, workout1, workout2);")
      StdIn.readLine(workouts.body_part, workouts.workout1, workouts.workout2)
     
      stmt.execute()
    

      //check if rows were updated, return true is yes, false if no
      stmt.getUpdateCount() > 0
    }
    // also returns false if a failure occurred
  } */
    


