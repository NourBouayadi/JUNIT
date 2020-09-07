/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nour
 */
// File Binaire.java
import java.io.*;
public class Foo {
private double a, b;    
private String tab ;
public Foo () { tab = new String () ; }
public Foo ( String b, boolean be ) {
tab = new String (b) ; if (be) revert ( ) ; }
private void revert ( ) {
	byte [] btab = tab.getBytes ( ) ;
	for ( int i = 0; i < (btab.length >> 1); i ++) {
		byte tmp = btab [ i ] ; btab [i] = btab [btab.length - i] ;
		btab[btab.length - i ] = tmp;
}
tab = new String (btab) ;
}
public int getInt ( ) {
int nombre = 0;
for ( int i = tab.length()-1; i >= 0; i--) {
	nombre = (nombre << 1) + ( tab.charAt(i) - '0' ) ; }
return nombre ; }
public double addition(double a, double b){
    return a+b; 
}
}

