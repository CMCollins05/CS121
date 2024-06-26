import java.util.Stack;
public class BalancedBrackets {
    public String checkBalance(String string){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(c == '('){
                stack.push(c);
            }else if(stack.isEmpty() && c==')'){
                stack.push(c);
                if(stack.peek()==')'&& c==')')
                {
                    return "unbalanced";
                }
            }else{
                stack.pop();
            }
        }

        if(stack.empty()){
            return "balanced";
        }else{
            return "unbalanced";
        }
    }
}
