package TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String stdin;

        int total = 0;
        int inc = 0;
        int inc2 = 0;
        int inc3 = 0;
        int inc4 = 0;
        int inc5 = 0;
        int inc6 = 0;
        int cerise = 75;
    	int pomme = 100;
    	int banane = 150;
    	
        while (! (stdin = reader.readLine()).equals("tcho")){
        	String[] pannier = stdin.split(", ");
        	if (pannier.length ==1){
        		switch(pannier[0]){
            	case "Pommes":
            		inc5 ++;
            		if(inc5 %4 == 0){
            			total = total + pomme -100;
            		}else{
            			total = total + pomme;
            		}
            	break;
            	case "Apples":
            		inc3 ++;
            		if(inc3 %3 == 0){
            		}else{
            			total = total + pomme;
            		}
            		
            	break;
            	case "Mele":
            		inc4 ++;
            		if(inc4 %2 == 0){
            			total = total + pomme - 50;
            		}else{
            			total = total + pomme;
            		}
            	break;
            	case "Cerises":
            		inc ++;
            		if(inc %2 == 0){
            			total = total + cerise - 20;
            		}else{
            			total = total + cerise;
            		}
            	break;
            	case "Bananes":
            		inc2 ++;
            		if(inc2 %2 == 0){
            		}else{
            			total = total + banane;
            		}
            	break;
            	}
        		inc6 ++;
        		if(inc6 %5 == 0){
        			total = total - 200;
        		}
        	}else{
        	for (int i=0; i<pannier.length;i++){
        		switch(pannier[i]){
            	case "Pommes":
            		inc5 ++;
            		if(inc5 %4 == 0){
            			total = total + pomme - 100;
            		}else{
            			total = total + pomme;
            		}
            	break;
            	case "Apples":
            		inc3 ++;
            		if(inc3 %3 == 0){
            		}else{
            			total = total + pomme;
            		}
            		
            	break;
            	case "Mele":
            		inc4 ++;
            		if(inc4 %2 == 0){
            			total = total + pomme - 50;
            		}else{
            			total = total + pomme;
            		}
            	break;
            	case "Cerises":
            		inc ++;
            		if(inc %2 == 0){
            			total = total + cerise - 20;
            		}else{
            			total = total + cerise;
            		}
            	break;
            	case "Bananes":
            		inc2 ++;
            		if(inc2 %2 == 0){
            		}else{
            			total = total + banane;
            		}
            	break;
            	}
        		inc6 ++;
        		if(inc6 %5 == 0){
        			total = total - 200;
        		}
        	}
        	}
        	
        System.out.println(">" + total);

	}
	}
}


