package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public final class FirstLoad {

    public static void run() {


        deleteAlunos();

        // JDBC driver name and database URL
        String JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:file:~/dbh2";

        //  Database credentials
        String USER = "teste";
        String PASS = "testepwd";

        //  variaveis de conexão
        Connection conn = null;
        Statement stmt = null;

        try {

            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();


            try {

                int i = 0;
                File myObj = new File("src/main/resources/lista_alunos.txt");
                Scanner myReader = new Scanner(myObj);
                List linhas = new ArrayList<>();

                while (myReader.hasNextLine()) {

                    String data = myReader.nextLine();
                    linhas = Arrays.asList(data.split("[ ]{2,}"));

                    if (linhas.size() > 1) {
                        double cpf = Double.parseDouble(linhas.get(1).toString().replaceAll("[^\\d.]", ""));
                        AlunoEntity alunoEntity = new AlunoEntity(linhas.get(0).toString(), cpf);
                        FakeBanco.setAluno(alunoEntity);

                        i++;
                        String sql = "INSERT INTO ALUNO " + "VALUES ("+i+","+alunoEntity.getCpf()+","+"'2020-04-04'"+","+"'email'"+","+i+",'"+alunoEntity.getNome().toString()+"',"+i+")";
                        stmt.executeUpdate(sql);
                        System.out.println("Incluindo registros  in given database...");

                    }

                  System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();


        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println(" DELETOU COM SUCESSO !");



    }

    public static void persistirDB(int key, String nome, double cpf) {

    // JDBC driver name and database URL
    String JDBC_DRIVER = "org.h2.Driver";
    String DB_URL = "jdbc:h2:file:~/dbh2";

    //  Database credentials
    String USER = "teste";
    String PASS = "testepwd";
    //  variaveis de conexão
    Connection conn = null;
    Statement stmt = null;

    try {

        // STEP 1: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 2: Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        //STEP 3: Execute a query
        System.out.println("Creating table in given database...");
        stmt = conn.createStatement();

        String sql = "INSERT INTO ALUNO " + "VALUES ("+key+","+cpf+","+"'2020-04-04'"+","+"'email'"+","+key+",'"+nome+"',"+key+")";
        stmt.executeUpdate(sql);
        System.out.println("Incluindo registros  in given database...");


        // STEP 4: Clean-up environment
        stmt.close();
        conn.close();


    } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println("Goodbye!");
    }
    public static void deleteAlunos() {


        // JDBC driver name and database URL
        String JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:file:~/dbh2";

        //  Database credentials
        String USER = "teste";
        String PASS = "testepwd";
        //  variaveis de conexão
        Connection conn = null;
        Statement stmt = null;

        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            String sql = "delete from ALUNO";
            stmt.executeUpdate(sql);
            System.out.println("Excluindo registros  from ALUNO...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();

        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        System.out.println(" DELETOU COM SUCESSO !");
    }
}

