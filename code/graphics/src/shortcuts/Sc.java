/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcuts;

import elements.Element;
import java.awt.Color;
import java.util.ArrayList;


/**
 *
 * @author agust
 */
public class Sc {
    
    public static int rmd(int ini, int end ){
        if(ini>end){
            int a = ini;
            ini = end;
            end = a;
        }
        return (int) (Math.random()*(end-ini)+ini);
    }
    
    public static String firstToUpper(String str){
        
        if (str == null || str.isEmpty()) 
          return str;            
        else 
          return str.substring(0, 1).toUpperCase() + str.substring(1); 

    }
    
    public static double rmd(double ini, double end ){
        if(ini>end){
            double a = ini;
            ini = end;
            end = a;
        }
        return Math.random()*(end-ini)+ini;
    }
    
    public static double rmd(double ini, double end, int decimals ){
        if(ini>end){
            double a = ini;
            ini = end;
            end = a;
        }
        return round (Math.random()*(end-ini)+ini, decimals);
    }
    
    public static double round(double num, int decimals) {
        double wholePart, result;
        result = num;
        wholePart = Math.floor(result);
        result=(result-wholePart)*Math.pow(10, decimals);
        result=Math.round(result);
        result=(result/Math.pow(10, decimals))+wholePart;
        return result;
    }
    
    public static Color alphaColor(Color c, double percentage){
        if(percentage<0)
            percentage =0;
        if(percentage >1)
            percentage =1;
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), (int)(255 * percentage) );
    }
    
    public static Color alphaColor(Color c, double percentage, boolean changeWhite){
        if(c.equals(new Color(255,255,255)))
            c = new Color(240,240,240);
        
        return Sc.alphaColor(c ,percentage);
    }
    
    public static ArrayList<String> getTypes(ArrayList<Element> elements){
        ArrayList<String> lst = new ArrayList<String>();
        boolean found = false;
        for (int i = 0; i < elements.size(); i++) {
            found = false;
            for(int j=0; j<lst.size(); j++)
                if(lst.get(j).equals(elements.get(i).getType()))
                    found = true;
            if(!found)
                lst.add(elements.get(i).getType());
            
        }

        return lst;
    }
    
}
