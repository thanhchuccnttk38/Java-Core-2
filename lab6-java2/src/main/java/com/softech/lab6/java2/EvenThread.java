/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.lab6.java2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author June
 */
public class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i += 2) {
            System.out.print(" " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("");
    }
}
