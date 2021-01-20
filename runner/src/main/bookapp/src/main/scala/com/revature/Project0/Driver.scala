package com.revature.Project0

import java.sql.DriverManager
import java.sql.ResultSet



object Driver {
    



    
    def main(args: Array[String]) : Unit = {
       //getConnection teake URL username and pword

       val conn = ConnectionUtil.getConnection()
        //use a prepped statemnt to try to get tracks
        
    
        val demoStatement = conn.prepareStatement("select * from workouts where body_part = 'Arms';")
        demoStatement.execute()
        val resultSet = demoStatement.getResultSet()
        while(resultSet.next()){
            println(
              workouts.produceFromResultSet(resultSet)) }
               
    }}
    


case class workouts(body_part : String, workouts1 : String, workouts2 : String){}

object workouts {
    def produceFromResultSet(resultSet : ResultSet) = {
        apply(resultSet.getString("body_part"),
        resultSet.getString("workout1"),
        resultSet.getString("workout2"))
    }



}








