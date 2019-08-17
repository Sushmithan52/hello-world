import avi.*;
class ArthmaticExec 
{
 public static void main(String[] args) 
 { 
	Window screen = new Window("Example_1.java","bold","blue",24); 

	DialogBox inputDividend = new DialogBox(screen,"Dividend?"); 
	DialogBox inputDivisor = new DialogBox(screen,"Divisor?");
	int dividend, divisor, quotient;
	screen.showWindow();
	inputDividend.showDialogBox();
	dividend = inputDividend.getInteger();
	inputDivisor.showDialogBox(); 
	divisor = inputDivisor.getInteger();
	quotient = dividend / divisor;
	screen.write(dividend+" / "+divisor+" = "+quotient+"\n");
}
}
