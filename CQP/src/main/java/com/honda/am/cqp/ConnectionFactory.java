package com.honda.am.cqp;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionFactory {

   private static BasicDataSource dataSource;

   private ConnectionFactory() {
   }

   public static Connection getConnection() throws SQLException {
      if (dataSource == null) {
         dataSource = new BasicDataSource();
         dataSource.setUrl("jdbc:sqlserver://hamdxwsql009:1433;databaseName=cqp");
         dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         dataSource.setUsername("cqpdev");
         dataSource.setPassword("CqPdev1t");
      }
      return dataSource.getConnection();
   }
}