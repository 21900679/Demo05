public class check {
    int come;
    check(int[][] stones, boolean color){       //true(black), false(white)
        if(color)   come = 1;
        else        come = -1;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(stones[i][j] == 3)
                    stones[i][j] = 0;
            }
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(stones[i][j] == come){
//                    System.out.println("first x = " + i + ", y = " + j);
                    right(stones, i, j);
                    left(stones, i, j);
                    up(stones, i, j);
                    down(stones, i, j);
                    rightup(stones, i, j);
                    leftup(stones, i, j);
                    rightdown(stones, i, j);
                    leftdown(stones, i, j);
                }
            }
        }
    }
    public void right(int[][] stones, int x, int y){
        int value = stones[x][y];
        for(int i = y+1; i < 8; i++){
            if(stones[i][x] == value)
                break;
            else if(stones[i][x] == value * (-1)){
                continue;
            }
            else if(stones[i][x] == 0 && stones[i-1][x] == value * (-1)){
//                System.out.println("aa");
//                System.out.println("x = " + x + ", y = " + i);
                stones[i][x] = 3;
                break;
            }
        }
    }
    public void left(int[][] stones, int x, int y){
        int value = stones[x][y];
        for(int i = y-1; i > 0; i--){
            if(stones[i][x] == value)
                break;
            else if(stones[i][x] == value * (-1)){
                continue;
            }
            else if(stones[i][x] == 0 && stones[i+1][x] == value * (-1)){
//                System.out.println("bb");
//                System.out.println("x = " + x + ", y = " + i);
                stones[i][x] = 3;
                break;
            }
        }
    }
    public void up(int[][] stones, int x, int y){
        int value = stones[x][y];
        for(int i = x-1; i > 0; i--){
            if(stones[y][i] == value)
                break;
            else if(stones[y][i] == value * (-1)){
                continue;
            }
            else if(stones[y][i] == 0 && stones[y][i+1] == value * (-1)){
//                System.out.println("aa");
//                System.out.println("x = " + x + ", y = " + i);
                stones[y][i] = 3;
                break;
            }
        }
    }
    public void down(int[][] stones, int x, int y){
        int value = stones[x][y];
        for(int i = x+1; i < 8; i++){
            if(stones[y][i] == value)
                break;
            else if(stones[y][i] == value * (-1)){
                continue;
            }
            else if(stones[y][i] == 0 && stones[y][i-1] == value * (-1)){
//                System.out.println("aa");
//                System.out.println("x = " + x + ", y = " + i);
                stones[y][i] = 3;
                break;
            }
        }
    }
    public void rightup(int[][] stones, int x, int y){
        int value = stones[x][y];
        int i, j;
        for(i = x-1, j = y+1; i > 0 && j < 8; i--, j++){
            if(stones[j][i] == value)
                break;
            else if(stones[j][i] == value * (-1)){
                continue;
            }
            else if(stones[j][i] == 0 && stones[j-1][i+1] == value * (-1)){
//                System.out.println("aa");
//                System.out.println("x = " + x + ", y = " + i);
                stones[j][i] = 3;
                break;
            }
        }
    }
    public void leftup(int[][] stones, int x, int y){
        int value = stones[x][y];
        int i, j;
        for(i = x-1, j = y-1; i > 0 && j > 0; i--, j--){
            if(stones[j][i] == value)
                break;
            else if(stones[j][i] == value * (-1)){
                continue;
            }
            else if(stones[j][i] == 0 && stones[j+1][i+1] == value * (-1)){
                System.out.println("aa");
                System.out.println("x = " + x + ", y = " + i);
                stones[j][i] = 3;
                break;
            }
        }
    }
    public void rightdown(int[][] stones, int x, int y){
        int value = stones[x][y];
        int i, j;
        for(i = x+1, j = y+1; i < 8 && j < 8; i++, j++){
            if(stones[j][i] == value)
                break;
            else if(stones[j][i] == value * (-1)){
                continue;
            }
            else if(stones[j][i] == 0 && stones[j-1][i-1] == value * (-1)){
                System.out.println("aa");
                System.out.println("x = " + x + ", y = " + i);
                stones[j][i] = 3;
                break;
            }
        }
    }
    public void leftdown(int[][] stones, int x, int y){
        int value = stones[x][y];
        int i, j;
        for(i = x+1, j = y-1; i < 8 && j > 0; i++, j--){
            if(stones[j][i] == value)
                break;
            else if(stones[j][i] == value * (-1)){
                continue;
            }
            else if(stones[j][i] == 0 && stones[j+1][i-1] == value * (-1)){
                System.out.println("aa");
                System.out.println("x = " + x + ", y = " + i);
                stones[j][i] = 3;
                break;
            }
        }
    }
}
