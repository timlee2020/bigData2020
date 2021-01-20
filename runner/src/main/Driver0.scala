package main


import java.sql.DriverManager
import java.sql.Connection

object Driver {
    def main(args: Array[String]) : Unit = {
      
  def getConnection() : Connection = {

        
 
        DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "337639")}

        //use a prepped statemnt to try to get tracks
        val demoStatement = conn.prepareStatement("SELECT * FROM cats;")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next())
        println(resultSet.getString("name"))
    
    }

    }
