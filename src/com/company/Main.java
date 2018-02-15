package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InicioSesion sesion = new InicioSesion();
                JFrame windows = new JFrame("Inicio de Sesión...");
                windows.setContentPane(sesion.getPanel());
                windows.pack();
                windows.setBounds(100,100,800,400);
                windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                windows.setVisible(true);


            }
        });
    }
}
