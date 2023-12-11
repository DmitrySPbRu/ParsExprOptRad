package ParsExprOptRad;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //ParsExprRad.readExprProt("");
        //ParsExprRad.writeTxtExprProt("");
        //ParsExprRad.copyFileEP("","");
        ParsExprOpt.readExprProt("МОЛК_ЭКСПРЕСС-ПРОТОКОЛ_2022.12.20_06.48.33.epf");
        System.out.println("Success finish " +
                "ParsExprOpt.readExprProt(МОЛК_ЭКСПРЕСС-ПРОТОКОЛ_2022.12.20_06.48.33.epf)");
        ParsExprOpt.readExprProt("МОЛК_ЭКСПРЕСС-ОТЧЕТ_2022.12.20_06.48.33.eof");
        System.out.println("Success finish " +
                "ParsExprOpt.readExprProt(МОЛК_ЭКСПРЕСС-ОТЧЕТ_2022.12.20_06.48.33.eof)");
        //ParsExprOpt.writeTxtExprProt("");
        //System.out.println("Success finish " +
        //        "ParsExprOpt.writeTxtExprProt(МОЛК_ЭКСПРЕСС-ПРОТОКОЛ_2022.12.20_06.48.33.epf)");
        //ParsExprOpt.copyFileEP("МОЛК_ЭКСПРЕСС-ПРОТОКОЛ_2022.12.20_06.48.33.epf","OptExprProt.txt ");
        //System.out.println("Success finish " +
          //      "ParsExprOpt.copyFileEP(МОЛК_ЭКСПРЕСС-ПРОТОКОЛ_2022.12.20_06.48.33.epf)");

    }
}