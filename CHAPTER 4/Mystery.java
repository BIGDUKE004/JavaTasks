//      this program print 12 times using a while loop and prints out the total of varaible y and for each iteration variable keeps addig the number of iteration it has gone to the next value it bring fortg

public class Mystery {
public static void main(String[] args) {
int x = -2;
int total = 0;
while (x <= 10) {
int y = x + 2;
x++;
total += y;
System.out.printf("Y is: %d and total is %d\n", y, total);
}
}
} 
