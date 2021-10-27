package com.lukefowles.datastructures;

import java.util.Queue;
import java.util.Stack;

public class Exercise2 {
    public static Boolean doBracketsMatch(String string) {
        String[] bracketArray = string.split("");
        Stack<String> bracketStack = new Stack<String>();
        for(String bracket : bracketArray) {
            switch(bracket) {
                case "(" , "[", "{":
                    bracketStack.push(bracket);
                    break;

                case ")":
                    if (bracketStack.peek().equals("(")) {
                        bracketStack.pop();
                    } else {
                        return false;
                    }
                    break;

                case "}":
                    if (bracketStack.peek().equals("{")) {
                        bracketStack.pop();
                    } else {
                        return false;
                    }
                    break;

                case "]":
                    if (bracketStack.peek().equals("[")) {
                        bracketStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return bracketStack.isEmpty() ? true : false;
    }
}

//            if(bracket.equals("(")) {
//                parenthesesStack.push(bracket);
//            }
//            else if(bracket.equals(")")) {
//                if(parenthesesStack.empty()) {
//                    return false;
//                }
//                else { parenthesesStack.pop(); }
//            }
//            else if(bracket.equals("{")) {
//                curlyBracketStack.push(bracket);
//            }
//            else if(bracket.equals("}")) {
//                if(curlyBracketStack.empty()) {
//                    return false;
//                }
//                else { curlyBracketStack.pop(); }
//            }
//            else if(bracket.equals("[")) {
//                squareBracketStack.push(bracket);
//            }
//            else if(bracket.equals("]")) {
//                if(squareBracketStack.empty()) {
//                    return false;
//                }
//                else { squareBracketStack.pop(); }
//            }


