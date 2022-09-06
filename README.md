# CSCD300Lab5
Stack Linked-list: infix expression to postfix expression, evaluate postfix expression

Problems Description
Based on the materials we discussed in classroom, you are required to implement the pseudo code regarding converting infix expression into postfix expression, then evaluating the postfix expression to produce a single result. Based on the demonstration I did in classroom, you will solve two problems, the first one (hw5) is required, while the second one (hw6) is optional but considered as bonus.
Problem 1)à(hw5)
a) Read in the value of the symbols from input file hw5_input2.txt, and represent each
symbol with a double precision value (Java double type).
b) Read in infix expressions from hw5_input3.txt. These infix expressions use the symbols
defined in hw5_input2.txt. Please do not change either of the input files.
c) Convert each infix expression from step (b) into postfix expression.
d) Evaluate each postfix expression in step (c) using the value of symbols in hw5_input2.txt
to yield a single result of double type, if the original infix expression has a correct syntax and in correct format. Otherwise, your program has to show an error message. The error message is thrown by your program based on the evaluation result for the current expression, which is shown below at the end of this section. You cannot hardcode your error message!
e) Output the results for each expression in step (c) and step (d) into a file, named hw5_output.txt. The format and part of the output file hw5_output.txt are shown below. Format is “original infix expression - - > corresponding postfix expression - - > evaluated postfix in double type”.
