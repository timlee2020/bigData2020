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