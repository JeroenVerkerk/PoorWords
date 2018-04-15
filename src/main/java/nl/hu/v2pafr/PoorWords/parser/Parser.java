package nl.hu.v2pafr.PoorWords.parser;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import nl.hu.v2pafr.PoorWords.GUI;
import nl.hu.v2pafr.PoorWords.antlr.*;

public class Parser {
	
		public boolean checkZin(String zin) {
			boolean result = false;
			
			//Check de zin die wordt meegegeven vanuit de UI
			ANTLRInputStream input = new ANTLRInputStream(zin);
	        PoorWordLexer lexer = new PoorWordLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);

	        PoorWordParser parser = new PoorWordParser(tokens);
	        ParseTree tree = parser.eenvoudigezin();
	        
	        //Als er null SyntaxErrors zijn betekend het dat de zin correct is dus dat checken we hieronder
	        if (parser.getNumberOfSyntaxErrors() == 0) {
		        
	        	//Laat de boom structuur zien in een scherm
		        JFrame frame = new JFrame("Antlr AST");
		        JPanel panel = new JPanel();
		        TreeViewer viewr = new TreeViewer(Arrays.asList(
		                parser.getRuleNames()),tree);
		        viewr.setScale(1.5);//scale a little
		        panel.add(viewr);
		        frame.add(panel);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(650,350);
		        frame.setVisible(true);
		        
		        result = true;
	        }
	        //Als er meer dan 0 SyntaxErrors zijn betekend het dat er iets niet correct is in de zin dus is resultaat false
	        else {
	        	result = false;
	        }
	        
	        return result;
		}
}
