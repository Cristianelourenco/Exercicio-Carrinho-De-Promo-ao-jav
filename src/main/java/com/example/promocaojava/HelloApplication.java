package com.example.promocaojava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //Um supermercado anuncia diariamente uma lista com 5 frutas em promoção. Escreva um
        //programa que recebe o nome de uma fruta que você deseja comprar e informa se a fruta
        //pertence à lista de promoções. Exemplo:
        //A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
        //Qual fruta você deseja comprar hoje?
        //banana
        //Ótima escolha! Essa fruta está em promoção hoje.

        String[] frutasEmPromocao = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        Scanner checaFruta = new Scanner(System.in);
        System.out.println("Qual fruta você deseja comprar hoje? \n");
        String frutaUser = checaFruta.nextLine();

        if(Arrays.asList(frutasEmPromocao).contains(frutaUser.toLowerCase())) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Que pena. Essa fruta não está em promoção hoje.");
        }
    }
}


