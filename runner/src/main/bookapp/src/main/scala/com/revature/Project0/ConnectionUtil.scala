package com.revature.Project0
import java.sql.Connection

import java.sql.DriverManager

object ConnectionUtil{
    
   def getConnection() : Connection = {

        classOf[org.postgresql.Driver].newInstance()


         DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "337639")
           //val conn = DriverManager.getConnection("jdbc:sqlite:{file}","postgres", "337639") 


    }

}