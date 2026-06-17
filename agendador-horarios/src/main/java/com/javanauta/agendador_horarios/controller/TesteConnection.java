/**package com.javanauta.agendador_horarios.controller;

import java.sql.Connection;

public class TesteConnection {
    public static void main(String []args) {

        try (Connection conexao =
                ConnectionFactory.getConnection()) {
            System.out.println(
                    "Conexão realizada com sucesso"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}*/
