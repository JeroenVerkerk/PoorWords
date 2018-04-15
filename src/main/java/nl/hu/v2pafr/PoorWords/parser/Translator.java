package nl.hu.v2pafr.PoorWords.parser;

import nl.hu.v2pafr.PoorWords.Translate.language.Language;
import nl.hu.v2pafr.PoorWords.Translate.translate.Translate;

public class Translator {
	
	//De zin, de taal van en de taal naar worden meegegeven vanuit de UI
	public String translate(String txt, String languageFrom, String languageTo ){
        Translate trans = new Translate();
        String translation ="";
        //Roep de API aan met de zin die vertaald moet worden en de taal van en naar
        try {
            translation = trans.execute(txt,Language.valueOf(languageFrom.toUpperCase()), Language.valueOf(languageTo.toUpperCase()));
        }catch (Exception e) {
        	System.out.println(e);
        }
        //return het resultaat
        return translation;
    }
}
