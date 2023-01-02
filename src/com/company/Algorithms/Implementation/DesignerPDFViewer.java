package com.company.Algorithms.Implementation;

import java.util.List;

public class DesignerPDFViewer {

//    https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static int designerPdfViewer(List<Integer> h, String word) {
        int tallest = 0;
        for(char c : word.toCharArray()){
            if(h.get(c - 97) > tallest)
                tallest = h.get(c - 97);
        }

        return tallest * word.length();
    }
}
