import java.util.ArrayList;

import parsing.InputReader;
import parsing.SlogoParser;

public class LogicCenter {	
	private SlogoParser lang;
	
	public LogicCenter() {
		lang = new SlogoParser();
	}

	public void doInstructions(String input) {
		InputReader reader = new InputReader(lang, input);;
		ArrayList<String> inputParsed = reader.getInputParsed();
		ArrayList<String> inputParsedSymbols = reader.getInputParsedSymbols();
		doLogic(inputParsed, inputParsedSymbols);
	}

	private void doLogic(ArrayList<String> inputParsed, ArrayList<String> inputParsedSymbols) {
		int index = 0; //used to keep track of the current reading from both ArrayLists
		
	}
}
