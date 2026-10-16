class Solution {
    public boolean isValid(String s) {
        int left  = 0;
        int right = 1;
        Stack<Character> bracket = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(bracket.empty()){
                bracket.push(s.charAt(i));
            }else if(oppBracket(s.charAt(i)) == bracket.peek()){
                bracket.pop();
            }else{
                bracket.push(s.charAt(i));
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
