//nqueens problem

class nQueensProblem{
    
    /** we use inner classes when there is 'has-a' relation.
        Without existing nQueensProblem class, position class will not exist.
        nQueensProblem 'has-a' position */
    
    class position{
        int row, col;
        
        position(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    
    public position[] solve(int n){
        
        position[] myArray = new position[n];
        
        int row = 0;
        
        boolean res =  solveNQueen(myArray,n,row);
        if(res) return myArray;
        else return new position[0];
        
    }
    
    public boolean solveNQueen( position[] myArray, int n, int row){
        System.out.println("Trying to place queen at this row: " + row);
        
        int col = 0;
        
        //base case
        if(n == row) return true;
        
        //for every column, check position array to check for the safe place.
        for(col = 0; col < n; col++){
            boolean result = true;
            
            //if I am trying to place my queen at row = 2, only need to check 0th row and 1st row!
            for(int queen = 0; queen < row; queen++){
                if(myArray[queen].col == col || myArray[queen].row == row
                   || (myArray[queen].row + myArray[queen].col) == row + col
                   || (myArray[queen].row - myArray[queen].col) == row - col){
                    
                    result = false;
                    break;
                }
            }
            
            //we found safe place for Queen, let's add it to the array
            if(result){
                System.out.println("safe place row: " + row + " column: " + col);
                
                //add it to position array
                myArray[row] = new position(row,col);
                
                //go and find next safe place for queen.
                if(solveNQueen(myArray,n,row+1)){
                    return true;
                }
            }
        }
        System.out.println("backtrack!");
        return false;
    }
}

//credit : https://www.youtube.com/watch?v=xouin83ebxE
