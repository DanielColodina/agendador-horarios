/**package com.javanauta.agendador_horarios.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectionFactory {

    //Criando a conexao privada;
    private static final String URL =
            "jdbc:mysql://localhost:3306/agendador";

    private static final String USER = "root";

    private static final String PASSWORD = "admin";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,
                    USER,
                    PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao conectar com o banco de dados!", e
            );
        }
    }

}**/
