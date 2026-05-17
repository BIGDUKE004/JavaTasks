public class ArrayTask{
    public static void main(String[] args){

        char [] [] tictac = new char[3][3];
        tictac [0][0] = 'X';
        tictac [0][1] = 'O';
        tictac [0][2] = 'X';

        tictac [1][0] = 'O';
        tictac [1][1] = 'O';
        tictac [1][2] = 'O';      

        tictac [2][0] = 'X';
        tictac [2][1] = 'X';
        tictac [2][2] = 'O';




    for(int row = 0; row < tictac.length; row++){
        for(int column = 0; column < tictac.length; column++){
            System.out.print(tictac [row][column]);
    }
            System.out.println();
    }



    for(int row = 0; row < tictac.length; row++){
    for(int column = 0; column < tictac.length; column++){

        if(tictac [row][column] == 'X'){
System.out.print("1");
}  else if(tictac [row][column] == 'O'){
System.out.print("0");
}
        
}
System.out.println();
}

}




}
