package model.repository;

import connection.ConnectionDB;

import java.sql.Connection;

public class Repository {
    protected Connection conn;

    public Repository() {conn = ConnectionDB.getInstance().getConnection();
    }
}
