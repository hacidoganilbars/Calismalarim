package com.dogan.ilbars.hesapmakinasi;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static java.lang.String.valueOf;

public class Controller {
    public TextField tfGosterge;
    int sayi;
    String text=null;
    int sayi2;
    int sonuc;

    public void arti(ActionEvent actionEvent) {
        sayi=Integer.parseInt(tfGosterge.getText());
        tfGosterge.setText(null);
        text="arti";


    }

    public void eksi(ActionEvent actionEvent) {
        sayi=Integer.parseInt(tfGosterge.getText());
        tfGosterge.setText(null);
        text="eksi";
    }

    public void bolu(ActionEvent actionEvent) {
        sayi=Integer.parseInt(tfGosterge.getText());
        tfGosterge.setText(null);
        text="bolu";
    }

    public void carpi(ActionEvent actionEvent) {
        sayi=Integer.parseInt(tfGosterge.getText());
        tfGosterge.setText(null);
        text="carpi";
    }

    public void sil(ActionEvent actionEvent) {
        tfGosterge.setText(null);
        sayi=0;
        sayi2=0;
    }

    public void esittir(ActionEvent actionEvent) {

        try {
            if(text.equals("arti")){
                sayi2=Integer.parseInt(tfGosterge.getText());
                sonuc=sayi+sayi2;
                System.out.println(sonuc);
                tfGosterge.setText(valueOf(sonuc));
                tfGosterge.getText();
            }   if(text.equals("eksi")){
                sayi2=Integer.parseInt(tfGosterge.getText());
                sonuc=sayi-sayi2;
                System.out.println(sonuc);
                tfGosterge.setText(valueOf(sonuc));
                tfGosterge.getText();
            }
            if(text.equals("carpi")){
                sayi2=Integer.parseInt(tfGosterge.getText());
                sonuc=sayi*sayi2;
                System.out.println(sonuc);
                tfGosterge.setText(valueOf(sonuc));
                tfGosterge.getText();
            }
            if(text.equals("bolu")) {
                sayi2 = Integer.parseInt(tfGosterge.getText());

                try {
                    sonuc = sayi / sayi2;
                    System.out.println(sonuc);
                    tfGosterge.setText(valueOf(sonuc));
                    tfGosterge.getText();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    tfGosterge.setText("Tanýmsýz");
                }
                System.out.println("Tanýmsýz");

            }

        }catch(RuntimeException e){
            e.printStackTrace();
            tfGosterge.setText("Hata");
        } System.out.println("Hata!!");


    }

    public void sifir(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("0");
        }
        tfGosterge.getText();
    }

    public void dokuz(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("9");
        }
        tfGosterge.getText();
    }

    public void sekiz(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("8");
        }
        tfGosterge.getText();
    }

    public void yedi(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("7");
        }
        tfGosterge.getText();
    }

    public void alti(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("6");
        }
        tfGosterge.getText();
    }

    public void bes(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("5");
        }
        tfGosterge.getText();
    }

    public void dort(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("4");
        }
        tfGosterge.getText();
    }

    public void uc(MouseEvent mouseEvent) {
        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("3");
        }
        tfGosterge.getText();
    }
    public void iki(MouseEvent mouseEvent) {

        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("2");
        }
        tfGosterge.getText();

    }
    public void bir(MouseEvent mouseEvent) {

        for (int i=1;i<=mouseEvent.getClickCount();i++){
            tfGosterge.appendText("1");
        }
        tfGosterge.getText();
    }

}
