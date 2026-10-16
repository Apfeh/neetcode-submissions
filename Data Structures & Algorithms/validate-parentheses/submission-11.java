class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char brac = s.charAt(i);
            if(bracket.empty()){
                bracket.push(brac);
            }else if(oppBracket(brac) == bracket.peek()){
                bracket.pop();
            }else{
                bracket.push(brac);
            }
        }
        return bracket.empty();
    }
    public char oppBracket(char cBracket){
        return switch (cBracket){
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> ' ';
        };
    }
}
