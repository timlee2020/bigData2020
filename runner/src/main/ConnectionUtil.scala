package main


import java.sql.DriverManager
import java.sql.Connection

object ConnectionUtil{

    def getConnection() : Connection = {

        
 
        DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "337639")
}}