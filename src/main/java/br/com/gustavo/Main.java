package br.com.gustavo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ebcdic{
    private final Map<Integer, String> ebcdicMap;

    public Ebcdic(){
        this.ebcdicMap = new HashMap<>();
        this.fillMap();
    }

    public void fillMap(){
        this.ebcdicMap.put(0, "NUL");
        this.ebcdicMap.put(1, "SOH");
        this.ebcdicMap.put(2, "STX");
        this.ebcdicMap.put(3, "ETX");
        this.ebcdicMap.put(4, "PF");
        this.ebcdicMap.put(5, "HT");
        this.ebcdicMap.put(6, "LC");
        this.ebcdicMap.put(7, "DEL");
        this.ebcdicMap.put(8, "GE");
        this.ebcdicMap.put(9, "RLF");
        this.ebcdicMap.put(10, "SMM");
        this.ebcdicMap.put(11, "VT");
        this.ebcdicMap.put(12, "FF");
        this.ebcdicMap.put(13, "CR");
        this.ebcdicMap.put(14, "SO");
        this.ebcdicMap.put(15, "SI");
        this.ebcdicMap.put(16, "DLE");
        this.ebcdicMap.put(17, "DC1");
        this.ebcdicMap.put(18, "DC2");
        this.ebcdicMap.put(19, "TM");
        this.ebcdicMap.put(20, "RES");
        this.ebcdicMap.put(21, "LN");
        this.ebcdicMap.put(22, "BS");
        this.ebcdicMap.put(23, "IL");
        this.ebcdicMap.put(24, "CAN");
        this.ebcdicMap.put(25, "EM");
        this.ebcdicMap.put(26, "CC");
        this.ebcdicMap.put(27, "CU1");
        this.ebcdicMap.put(28, "IFS");
        this.ebcdicMap.put(29, "IGS");
        this.ebcdicMap.put(30, "IRS");
        this.ebcdicMap.put(31, "IUS");
        this.ebcdicMap.put(32, "DS");
        this.ebcdicMap.put(33, "SOS");
        this.ebcdicMap.put(34, "FS");
        this.ebcdicMap.put(36, "BYP");
        this.ebcdicMap.put(37, "LF");
        this.ebcdicMap.put(38, "ETB");
        this.ebcdicMap.put(39, "ESC");
        this.ebcdicMap.put(42, "SM");
        this.ebcdicMap.put(43, "CU2");
        this.ebcdicMap.put(45, "ENQ");
        this.ebcdicMap.put(46, "ACK");
        this.ebcdicMap.put(47, "BEL");
        this.ebcdicMap.put(50, "SYN");
        this.ebcdicMap.put(52, "PN");
        this.ebcdicMap.put(53, "RS");
        this.ebcdicMap.put(54, "UC");
        this.ebcdicMap.put(55, "EOT");
        this.ebcdicMap.put(59, "CUB");
        this.ebcdicMap.put(60, "DC4");
        this.ebcdicMap.put(61, "NAK");
        this.ebcdicMap.put(63, "SUB");

        this.ebcdicMap.put(74, "¢");
        this.ebcdicMap.put(75, ".");
        this.ebcdicMap.put(76, "<");
        this.ebcdicMap.put(77, "(");
        this.ebcdicMap.put(78, "+");
        this.ebcdicMap.put(79, "|");

        this.ebcdicMap.put(90, "!");
        this.ebcdicMap.put(91, "$");
        this.ebcdicMap.put(92, "*");
        this.ebcdicMap.put(93, ")");
        this.ebcdicMap.put(94, ";");
        this.ebcdicMap.put(95, "¬");
        this.ebcdicMap.put(96, "-");
        this.ebcdicMap.put(97, "/");

        this.ebcdicMap.put(106, "¦");
        this.ebcdicMap.put(107, ",");
        this.ebcdicMap.put(108, "%");
        this.ebcdicMap.put(109, "-");
        this.ebcdicMap.put(110, ">");
        this.ebcdicMap.put(111, "?");

        this.ebcdicMap.put(121, "");
        this.ebcdicMap.put(122, ":");
        this.ebcdicMap.put(123, "#");
        this.ebcdicMap.put(124, "@");
        this.ebcdicMap.put(125, "");
        this.ebcdicMap.put(126, "=");
        this.ebcdicMap.put(127, "\"");

        this.ebcdicMap.put(129, "a");
        this.ebcdicMap.put(130, "b");
        this.ebcdicMap.put(131, "c");
        this.ebcdicMap.put(132, "d");
        this.ebcdicMap.put(133, "e");
        this.ebcdicMap.put(134, "f");
        this.ebcdicMap.put(135, "g");
        this.ebcdicMap.put(136, "h");
        this.ebcdicMap.put(137, "i");
        this.ebcdicMap.put(145, "j");
        this.ebcdicMap.put(146, "k");
        this.ebcdicMap.put(147, "l");
        this.ebcdicMap.put(148, "m");
        this.ebcdicMap.put(149, "n");
        this.ebcdicMap.put(150, "o");
        this.ebcdicMap.put(151, "p");
        this.ebcdicMap.put(152, "q");
        this.ebcdicMap.put(153, "r");
        this.ebcdicMap.put(162, "s");
        this.ebcdicMap.put(163, "t");
        this.ebcdicMap.put(164, "u");
        this.ebcdicMap.put(165, "v");
        this.ebcdicMap.put(166, "w");
        this.ebcdicMap.put(167, "x");
        this.ebcdicMap.put(168, "y");
        this.ebcdicMap.put(169, "z");

        this.ebcdicMap.put(192, "{");
        this.ebcdicMap.put(193, "A");
        this.ebcdicMap.put(194, "B");
        this.ebcdicMap.put(195, "C");
        this.ebcdicMap.put(196, "D");
        this.ebcdicMap.put(197, "E");
        this.ebcdicMap.put(198, "F");
        this.ebcdicMap.put(199, "G");
        this.ebcdicMap.put(200, "H");
        this.ebcdicMap.put(201, "I");
        this.ebcdicMap.put(208, "}");
        this.ebcdicMap.put(209, "J");
        this.ebcdicMap.put(210, "K");
        this.ebcdicMap.put(211, "L");
        this.ebcdicMap.put(212, "M");
        this.ebcdicMap.put(213, "N");
        this.ebcdicMap.put(214, "O");
        this.ebcdicMap.put(215, "P");
        this.ebcdicMap.put(216, "Q");
        this.ebcdicMap.put(217, "R");
        this.ebcdicMap.put(226, "S");
        this.ebcdicMap.put(227, "T");
        this.ebcdicMap.put(228, "U");
        this.ebcdicMap.put(229, "V");
        this.ebcdicMap.put(230, "W");
        this.ebcdicMap.put(231, "X");
        this.ebcdicMap.put(232, "Y");
        this.ebcdicMap.put(233, "Z");

        this.ebcdicMap.put(240, "0");
        this.ebcdicMap.put(241, "1");
        this.ebcdicMap.put(242, "2");
        this.ebcdicMap.put(243, "3");
        this.ebcdicMap.put(244, "4");
        this.ebcdicMap.put(245, "5");
        this.ebcdicMap.put(246, "6");
        this.ebcdicMap.put(247, "7");
        this.ebcdicMap.put(248, "8");
        this.ebcdicMap.put(249, "9");

        this.ebcdicMap.put(255, "EO");
    }

    public String searchOnMap(int value){
        return this.ebcdicMap.get(value);
    }
}

public class Main {
    public static void main(String[] args) {
        Ebcdic ebcdicMap = new Ebcdic();

        Scanner s = new Scanner(System.in);

        while(s.hasNext()){

            String[] aux = s.nextLine().split(" ");

            for(int i=0;i<aux.length;i++){
                int v = Integer.parseInt(aux[i], 8);

                String valueFromMap = ebcdicMap.searchOnMap(v);

                if(v==64)
                    System.out.print(" ");
                else if(!valueFromMap.isEmpty())
                    System.out.print(valueFromMap);
            }
            System.out.print("\n");
        }
    }
}