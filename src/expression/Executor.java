package expression;
import parsing.Factory;
import java.util.ArrayList;

import model.turtle.Turtle;

public class Executor extends ExpressionTree {
	public Executor(ArrayList<String> input, ArrayList<String> symbol, ArrayList<Integer> layers, ArrayList<Integer> bracketBounds, Turtle t){
		super(input, symbol, layers, bracketBounds, t);
	}
	
	public String executeStarter(){
		//for(int i = 0; i < NodeList.size(); i++){ System.out.println(NodeList.get(i).value);}
		//System.out.println(NodeList.get(0).left.value);
		return executeFromTreeNode(NodeList.get(0));
	}
	
	private String executeFromTreeNode(Node current){
		//System.out.println(current.type.toString());
		if(current.type.equals("Constant")){return current.value;}
		else if(current.type.equals("Variable")) { return current.value;}
		
		Factory fact = new Factory(current.value);
		int numargs = fact.numComs();
		Object[] args = new Object[1+Math.abs(numargs)];
		args[0] = myTurtle;
		
		if(current.type.equals("Conditional")){ 
			if(current.value.equals("Repeat")){
				int expr = Integer.parseInt(current.expr.executeStarter());
				args[1] = expr;
				args[2] = current.c1;
			}
			else if(current.value.equals("DoTimes")){
				
			}
			else if(current.value.equals("For")){
				
			}
			else if(current.value.equals("If")){
				boolean expr = Boolean.parseBoolean(current.expr.executeStarter());
				args[1] = expr;
				args[2] = current.c1;
			}
			else if(current.value.equals("IfElse")){
				boolean expr = Boolean.parseBoolean(current.expr.executeStarter());
				args[1] = expr;
				args[2] = current.c1;
				args[3] = current.c2;
			}
			else if(current.value.equals("To")){
				
			}
			else if(current.value.equals("MakeVariable")){
				String var = (current.c1.executeStarter()).toString();
				Double d2 = Double.parseDouble(current.c2.executeStarter());
				args[1] = var;
				args[2] = d2;
			}
		}

		else if(numargs == 1){ 
			Double d = Double.parseDouble(executeFromTreeNode(current.left));
			args[1] = d;
		}
		else if(numargs == 2){
			Double d1 = Double.parseDouble(executeFromTreeNode(current.left));
			Double d2 = Double.parseDouble(executeFromTreeNode(current.right));
			
			args[1] = d1;
			args[2] = d2;
		}		
		//System.out.println(args[1]);
		Object temp = fact.setArgs(args);
		return temp.toString();
	}
	
	private void branchOut(Node current){
		if(current.right != null) { executeFromTreeNode(current.right);}
		if(current.left != null) { executeFromTreeNode(current.left);}
	}
}
