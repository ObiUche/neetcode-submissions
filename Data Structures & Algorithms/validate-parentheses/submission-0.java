class Solution {
    public boolean isValid(String s) {
        // firstly i want to use a arrayDeque as it is more efficent than stack
        Deque<Character> stack = new ArrayDeque<>();

        // now i want to iterate through the char array to do comparisons
        for(char c: s.toCharArray()){

            // now that i am inside the array i want to push all open brackets to 
            // the stack
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }

            // now lets tackle behaviour if we see a closing bracket
            else {
                // we encounter a closing bracket and the open bracket stack is empty
                // return false for valid parentheses
                if(stack.isEmpty()){
                    return false;
                }

                // in order to do comparision we need to see the latest char from stack
                char top = stack.pop();

                // now time to do comparison 
                if(c == '}' && top != '{'){
                    return false;
                }

                // if c is a closing bracket and the latest added is not matching
                // return false 
                if(c == ']' && top !='['){
                    return false;
                }

                if(c == ')' && top != '('){
                    return false;
                }
            }
        }

        // return that status of the stack if empty matching else not matching
        return stack.isEmpty();
    }
}
